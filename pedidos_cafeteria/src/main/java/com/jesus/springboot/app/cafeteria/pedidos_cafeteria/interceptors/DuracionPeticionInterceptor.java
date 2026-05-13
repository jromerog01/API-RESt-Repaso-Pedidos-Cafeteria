package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class DuracionPeticionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long inicio = System.currentTimeMillis();

        request.setAttribute("tiempoInicio", inicio);
        System.out.println("Iniciando peticion");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);

        long inicio = (long) request.getAttribute("tiempoInicio");
        long fin = System.currentTimeMillis();


        System.out.println("Peticion finalizada: " + request.getMethod() + " " + request.getRequestURI());
        System.out.println("Tiempo: " + (fin - inicio) + " ms");
        System.out.println("Status: " + response.getStatus());
    }
}