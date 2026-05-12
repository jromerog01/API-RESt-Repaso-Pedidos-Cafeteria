package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class ImplPedidoRepository implements PedidoRepository {

    private ArrayList<Pedido> pedidos;

    @Override
    public ArrayList<Pedido> findAll() {

        if (pedidos == null){
            Resource resource = new ClassPathResource("/json/Pedidos.json");
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                pedidos = new ArrayList<>(Arrays.asList(objectMapper.readValue(resource.getFile(), Pedido[].class)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return pedidos;
    }

    @Override
    public Pedido findById(int id) {
        for (Pedido p : pedidos){
            if (p.getIdPedido() == id){
                return p;
            }
        }

        throw new IllegalArgumentException("Tu pedido no existe mano");
    }

    @Override
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public void actualizarEstado(int id, String estado) {
        Pedido pedido = findById(id);
        pedido.setEstadoPedido(estado);
    }
}
