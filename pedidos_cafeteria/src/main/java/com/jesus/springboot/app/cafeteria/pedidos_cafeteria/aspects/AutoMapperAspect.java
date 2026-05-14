package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.aspects;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.PedidoService;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AutoMapperAspect {

    @Autowired
    private PedidoService service;


}
