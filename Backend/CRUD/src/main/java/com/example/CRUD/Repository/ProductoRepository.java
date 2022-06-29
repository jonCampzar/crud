package com.example.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD.Model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}
