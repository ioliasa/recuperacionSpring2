package com.recetaJaca.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.recetaJaca.model.Receta;
import com.recetaJaca.service.RecetaService;

@Controller
public class RecetaController {
	
	@Autowired
	RecetaService recetaService;
	
	@GetMapping("/")
	public String principal(Model model) {
		ArrayList<Receta> recetas = (ArrayList<Receta>) recetaService.getRecetas();
		model.addAttribute("recetas", recetas);
		return "index";
	}
	
	@GetMapping("/indexLogueado")
	public String logueado(Model model) {
		return "indexLogueado";
	}

}
