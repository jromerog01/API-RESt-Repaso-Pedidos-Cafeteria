package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;

import java.util.ArrayList;

public interface ProductoService {
    public ArrayList<Producto> findAll();
    public Producto findById(int id);



}
