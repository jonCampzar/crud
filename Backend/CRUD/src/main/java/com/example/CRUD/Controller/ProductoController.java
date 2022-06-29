package com.example.CRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CRUD.Model.Producto;
import com.example.CRUD.Service.ProductoService;


@RestController
@RequestMapping("api/producto")
public class ProductoController {

ProductoService productoService;
	
	public ProductoController(@Autowired ProductoService productoService) {
		this.productoService = productoService;
}
	
	@GetMapping("/{id}")
	public Producto getProducto(@PathVariable Integer id) {
		return productoService.getProducto(id);
	}
	
	@GetMapping("/all")
	public List<Producto> getProductos(){
		return productoService.getProductos();
	}
	
	 
	@PostMapping
	public Producto saveProducto(@RequestBody Producto producto) {
		return productoService.saveProducto(producto);
	}
		
	@DeleteMapping("delete/{id}")
	public void deleteAlumno(@PathVariable Integer id) {
		productoService.deleteProducto(id);
	}
		
	@PutMapping
	public Producto updateProducto(@RequestBody Producto producto) {
		return productoService.updateProducto(producto);
	}
}
