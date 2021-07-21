package com.example.apiproductospringsecurity.producto;

import javax.persistence.*;

@Entity
@Table(name= "productos")
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "producto_id=" + producto_id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
