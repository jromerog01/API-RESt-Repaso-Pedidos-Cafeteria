package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models;

import java.util.Date;
import java.util.List;

public class PedidoDTO {

    private int idPedido;
    private Date fecha;
    private String nombreCliente;
    private List<Producto> productos;
    private double importeTotal;
    private String estadoPedido;

    public PedidoDTO(int idPedido, Date fecha, String nombreCliente, List<Producto> productos, double importeTotal, String estadoPedido) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.importeTotal = importeTotal;
        this.estadoPedido = estadoPedido;
    }

    public PedidoDTO() {

    }


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
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


}
