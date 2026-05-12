package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private int idPedido;
    private Date fecha;
    private String nombreCliente;
    private List<Integer> idProductos;
    private double importeTotal;
    private String estadoPedido;

    public Pedido(Date fecha, String nombreCliente, List<Integer> idProductos, double importeTotal, String estadoPedido, int idPedido) {
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.idProductos = idProductos;
        this.importeTotal = importeTotal;
        this.estadoPedido = estadoPedido;
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Integer> getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(List<Integer> idProductos) {
        this.idProductos = idProductos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}
