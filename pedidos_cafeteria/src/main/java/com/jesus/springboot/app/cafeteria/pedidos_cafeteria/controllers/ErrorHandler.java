package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.controllers;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.exceptions.IdPedidoInvalidoException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(IdPedidoInvalidoException.class)
    public Map<String, Object> idPedidoInvalidoException(Exception ex){
        Map<String, Object> mapita = new HashMap<>();
        mapita.put("mensaje", "el id del pedido ingresado no existe");
        mapita.put("fecha", new Date());
        mapita.put("error", ex.getMessage());

        return mapita;
    }



}
