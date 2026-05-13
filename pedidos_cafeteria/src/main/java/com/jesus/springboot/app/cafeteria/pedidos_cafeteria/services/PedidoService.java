package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.PedidoDTO;

import java.util.ArrayList;

public interface PedidoService {
    public ArrayList<PedidoDTO> findAll();
    public PedidoDTO findById(int id);
    public void addPedido(Pedido pedido);
    public ArrayList<Pedido> findAllRaw();
    public PedidoDTO marcarEntregado(int id);
    public ArrayList<Integer> getIdPedidos();




    }
