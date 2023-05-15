package com.recetaJaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetaJaca.model.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Integer> {

}
