package com.jesus.springboot.app.cafeteria.pedidos_cafeteria.models;

public class Producto {

    private int idProducto;
    private double precio;
    private String nombre;
    private int cantidad;

    public Producto(double precio, String nombre, int cantidad, int idProducto) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }

    public Producto(){

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
