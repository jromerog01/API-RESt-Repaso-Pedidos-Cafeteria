package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.aspects;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Producto;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.PedidoService;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.ProductoService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NombreMayusAspect {

    @Autowired
    private ProductoService service;

    @Before("execution(* com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.ImplPedidoService.addPedido(..)) && args(pedido)")
    public void nombreClienteMayus(Pedido pedido){
        pedido.setNombreCliente(pedido.getNombreCliente().toUpperCase());

    }

    @After("execution(* com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.PedidoService.findAll(..))")
    public void crearProducto(){
        service.addProducto(new Producto(2, "Churritos", 6, 9 ));


    }

}
