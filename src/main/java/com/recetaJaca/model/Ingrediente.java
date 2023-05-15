package com.recetaJaca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Ingrediente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String unidadMedida;
	
	@OneToMany(mappedBy = "receta")
	private List<RecetaIngrediente> recetaIngrediente =new ArrayList<RecetaIngrediente>();
	
	
	public Ingrediente(Integer id, String nombre, String unidadMedida) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		
	}
	public Ingrediente() {
		super();
				// TODO Auto-generated constructor stub
	}
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
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
		
	public List<RecetaIngrediente> getRecetaIngrediente() {
		return recetaIngrediente;
	}
	public void setRecetaIngrediente(List<RecetaIngrediente> recetaIngrediente) {
		this.recetaIngrediente = recetaIngrediente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
