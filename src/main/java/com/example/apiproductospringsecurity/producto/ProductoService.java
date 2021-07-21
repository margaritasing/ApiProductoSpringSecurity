package com.example.apiproductospringsecurity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;


    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getProductos(){
        return productoRepository.findAll();
    }

    public List<String> getNombreProductos(){
        List<Producto> productos = productoRepository.findAll();
        return productos.stream()
                .map(producto -> producto.getNombre())
                .toList();
    }



}
