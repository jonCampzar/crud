package com.example.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CRUD.Model.Producto;
import com.example.CRUD.Repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService{
	
ProductoRepository productoRepository;
	
	public ProductoServiceImp(@Autowired ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public Producto getProducto(Integer id) {
		Optional<Producto> producto = productoRepository.findById(id);
		return producto.orElse(null);
	}

	@Override
	public List<Producto> getProductos() {
			return productoRepository.findAll();
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Boolean deleteProducto(Integer id) {
		try {
			productoRepository.deleteById(id);
			return true;
		}catch(Exception err){
			return false;
		}
		
	}

	@Override
	public Producto updateProducto(Producto producto) {
		return productoRepository.save(producto);
	}

}
