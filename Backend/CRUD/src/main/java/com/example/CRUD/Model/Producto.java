package com.example.CRUD.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(nullable = false, name="id_producto")
		private Integer id;
		
		@Column(nullable = false, name="nombre")
		private String nombre;
		
		@Column(nullable = false, name="precio")
		private Integer precio;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Integer getPrecio() {
			return precio;
		}

		public void setPrecio(Integer precio) {
			this.precio = precio;
		}
		
		
	
}
