package com.example.CRUD.Service;

import java.util.List;

import com.example.CRUD.Model.Producto;

public interface ProductoService {

	Producto getProducto(Integer id);
	
	List<Producto> getProductos();
	
	Producto saveProducto(Producto producto);
	
	Boolean deleteProducto(Integer id);
	
	Producto updateProducto(Producto producto);
	
}
