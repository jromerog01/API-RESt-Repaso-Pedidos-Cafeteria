package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.interceptors;

import com.jesus.springboot.app.cafeteria.pedidos_cafeteria.services.PedidoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Component
public class IdProductosInterceptor implements HandlerInterceptor {

    @Autowired
    private PedidoService service;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ArrayList<Integer> indices = service.getIdPedidos();






        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
