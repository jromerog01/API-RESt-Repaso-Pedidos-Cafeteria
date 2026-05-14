package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ImplProductoService implements ProductoService{

    @Autowired
    private ProductoRepository repository;

    @Override
    public ArrayList<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Producto findById(int id) {
        return repository.findById(id);
    }

    @Override
    public Producto addProducto(Producto producto) {
        return repository.addProducto(producto);
    }
}
