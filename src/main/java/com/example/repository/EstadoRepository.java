package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Estado;


//Pide siempre la clase modelo y tipo del id
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
