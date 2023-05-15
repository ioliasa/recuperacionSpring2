package com.recetaJaca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.recetaJaca.model.Usuario;
import com.recetaJaca.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{



}
