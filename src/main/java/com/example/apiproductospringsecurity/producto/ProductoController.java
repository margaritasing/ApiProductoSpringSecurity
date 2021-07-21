package com.example.apiproductospringsecurity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;


    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<String> getNombreProductos(){
        return productoService.getNombreProductos();
    }

    @GetMapping("detalles")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }
}
