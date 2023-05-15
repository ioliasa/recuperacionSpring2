package com.recetaJaca.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(RecetaIngredienteId.class)
public class RecetaIngrediente {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "receta_id")
	private Receta receta;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ingrediente_id")
	private Ingrediente ingrediente;
	
	private Double cantidad;
	private String unidad;
	public RecetaIngrediente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecetaIngrediente(Receta receta, Ingrediente ingrediente, Double cantidad, String unidad) {
		super();
		this.receta = receta;
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
		this.unidad = unidad;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	
	

}
