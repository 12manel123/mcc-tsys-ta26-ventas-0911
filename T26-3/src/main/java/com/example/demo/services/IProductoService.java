package com.example.demo.services;

import com.example.demo.dto.Producto;

import java.util.List;

public interface IProductoService {
    Producto getProductoByCodigo(int codigo);
    List<Producto> getAllProductos();
    Producto createProducto(Producto producto);
    Producto updateProducto(int codigo, Producto producto);
    void deleteProducto(int codigo);
}