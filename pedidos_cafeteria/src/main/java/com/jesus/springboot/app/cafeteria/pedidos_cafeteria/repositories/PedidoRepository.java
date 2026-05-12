package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;

import java.util.ArrayList;

public interface PedidoRepository {

    public ArrayList<Pedido> findAll();
    public Pedido findById(int id);
    public void addPedido(Pedido pedido);
    public void actualizarEstado(int id, String estado);


}
