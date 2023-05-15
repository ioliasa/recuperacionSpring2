package com.recetaJaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetaJaca.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer> {

}
