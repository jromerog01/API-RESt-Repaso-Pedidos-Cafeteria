package com.jesus.springboot.app.cafeteria.pedidos_cafeteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PedidosCafeteriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PedidosCafeteriaApplication.class, args);
    }

}
