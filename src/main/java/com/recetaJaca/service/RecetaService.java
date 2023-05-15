package com.recetaJaca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recetaJaca.model.Receta;
import com.recetaJaca.repository.RecetaRepository;


@Service
public class RecetaService {

	@Autowired
	RecetaRepository recetaRepository;

	public List<Receta> getRecetas(){
		return recetaRepository.findAll();
	}
}
