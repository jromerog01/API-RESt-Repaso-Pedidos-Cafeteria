package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.aspects;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Aspect
@Component
public class DescuentosAspect {


    /*
    Descuento del 20% si el pedido incluye Chamoyada y Croissant
    Indices:
    Chamoyada: 6
    Croissant: 7
     */
    @Before("(execution (* com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.ImplPedidoService.addPedido(..)) && args(pedido))")
    public void combo1(Pedido pedido){
        ArrayList<Integer> idsCombo = new ArrayList<>(Arrays.asList(6,7));
        ArrayList<Integer> productos = (ArrayList<Integer>) pedido.getIdProductos();
        if (productos.containsAll(idsCombo)){
            pedido.setImporteTotal(pedido.getImporteTotal()*0.80);
        }
    }


    
}
