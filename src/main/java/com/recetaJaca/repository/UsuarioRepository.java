package com.recetaJaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetaJaca.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
