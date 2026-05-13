package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.exceptions.IdPedidoInvalidoException;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.PedidoDTO;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories.PedidoRepository;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ImplPedidoService implements PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ProductoRepository productoRepository;

    private ArrayList<PedidoDTO> pedidosDTO = new ArrayList<>();


    @Override
    public ArrayList<PedidoDTO> findAll() {

        if (pedidosDTO.isEmpty()){

            ArrayList<Pedido> pedidosRaw = repository.findAll();

            for (Pedido p : pedidosRaw){
                ArrayList<Producto> productos = new ArrayList<>();
                for(Integer i : p.getIdProductos()){
                    Producto buscado = productoRepository.findById(i);

                    if(buscado != null){
                        productos.add(buscado);

                    }
                }

                pedidosDTO.add(new PedidoDTO(
                        p.getIdPedido(),
                        p.getFecha(),
                        p.getNombreCliente(),
                        productos,
                        p.getImporteTotal(),
                        p.getEstadoPedido()
                ));
            }

        }

        return pedidosDTO;
    }

    @Override
    public PedidoDTO findById(int id) {
        for (PedidoDTO p: pedidosDTO){
            if (p.getIdPedido() == id){
                return p;
            }
        }

        throw new IdPedidoInvalidoException("El id de tu pedido no existe, lo lamentamos");


    }

    @Override
    public void addPedido(Pedido pedido) {
        repository.addPedido(pedido);
        mapearPedidos();
    }

    public ArrayList<Pedido> findAllRaw(){
        return repository.findAll();
    }

    public void mapearPedidos(){
        pedidosDTO.clear();

        ArrayList<Pedido> pedidosRaw = repository.findAll();

        for (Pedido p : pedidosRaw){
            ArrayList<Producto> productos = new ArrayList<>();
            for(Integer i : p.getIdProductos()){
                Producto buscado = productoRepository.findById(i);

                if(buscado != null){
                    productos.add(buscado);

                }
            }

            pedidosDTO.add(new PedidoDTO(
                    p.getIdPedido(),
                    p.getFecha(),
                    p.getNombreCliente(),
                    productos,
                    p.getImporteTotal(),
                    p.getEstadoPedido()
            ));
        }

    }

    @Override
    public PedidoDTO marcarEntregado(int id) {
        if (!getIdPedidos().contains(id)){
            throw new IdPedidoInvalidoException("Tu pedido no existe, no puedes actualizar su estado");
        }

        repository.marcarEntregado(id);
        mapearPedidos();

        return findById(id);
    }


    public ArrayList<Integer> getIdPedidos(){
        ArrayList<Integer> idPedidos = new ArrayList<>();

        for (Pedido p : repository.findAll()){
            idPedidos.add(p.getIdPedido());
        }

        return idPedidos;
    }
}
