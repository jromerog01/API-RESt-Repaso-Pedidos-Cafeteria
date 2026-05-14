package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.repositories;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class ImplProductoRepository implements ProductoRepository {

    private ArrayList<Producto> productos;


    @Override
    public ArrayList<Producto> findAll() {
        if (productos == null){
            ObjectMapper objectMapper = new ObjectMapper();
            Resource resource = new ClassPathResource("/json/Productos.json");

            try {
                productos = new ArrayList<>(Arrays.asList(objectMapper.readValue(resource.getFile(), Producto[].class)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return productos;
    }

    @Override
    public Producto findById(int id) {
        for (Producto p : findAll()){
            if (p.getIdProducto() == id){
                return p;
            }
        }

        throw new IllegalArgumentException("Tu id no existe mano");
    }


    @Override
    public Producto addProducto(Producto producto) {
        productos.add(producto);
        return producto;
    }
}
