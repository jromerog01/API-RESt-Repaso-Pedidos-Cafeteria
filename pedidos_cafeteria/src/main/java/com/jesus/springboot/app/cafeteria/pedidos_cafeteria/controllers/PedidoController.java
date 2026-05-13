package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.controllers;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.PedidoDTO;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/findAll")
    public ArrayList<PedidoDTO> findAll(){
        return service.findAll();
    }

    @GetMapping("/findAllRaw")
    public ArrayList<Pedido> findAllRaw(){
        return service.findAllRaw();
    }

    @GetMapping("/findById/{id}")
    public PedidoDTO findById(@PathVariable int id){
        return service.findById(id);
    }

    @PostMapping("/post")
    public Pedido agregarPedido(@RequestBody Pedido pedido){
        pedido.setEstadoPedido("NO ENTREGADO");
        service.addPedido(pedido);
        return pedido;
    }

    @PutMapping("/entregar/{idPedido}")
    public PedidoDTO marcarEntregado(@PathVariable int idPedido){
        return service.marcarEntregado(idPedido);
    }




}
