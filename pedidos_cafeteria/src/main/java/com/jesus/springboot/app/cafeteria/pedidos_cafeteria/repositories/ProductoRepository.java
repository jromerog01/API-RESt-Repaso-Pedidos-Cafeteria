package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;

import java.util.ArrayList;

public interface ProductoRepository {

    public ArrayList<Producto> findAll();
    public Producto findById(int id);

}
