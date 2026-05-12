package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.controllers;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping("/findAll")
    public ArrayList<Producto> findAll(){
        return service.findAll();
    }

}
