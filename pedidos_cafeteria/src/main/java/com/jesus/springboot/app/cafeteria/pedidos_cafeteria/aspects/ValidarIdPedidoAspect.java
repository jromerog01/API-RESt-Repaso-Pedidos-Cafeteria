package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.aspects;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.exceptions.IdPedidoInvalidoException;
import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models.Pedido;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class ValidarIdPedidoAspect {

    @Before("execution(* com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.ImplPedidoService.addPedido(..)) && args(pedido)")
    public void verificarIdProductos(Pedido pedido) {
        ArrayList<Integer> productosValidos = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> pedidosOrden = pedido.getIdProductos();


        for (Integer p : pedidosOrden){
            if (!productosValidos.contains(p)){
                throw new IdPedidoInvalidoException("Uno de los productos del pedido no esta en el intervalo");
            }
        }


    }




}
