package com.recetaJaca.model;

import java.io.Serializable;
import java.util.Objects;


public class RecetaIngredienteId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer receta;
	private Integer ingrediente;
	
	public RecetaIngredienteId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecetaIngredienteId(Integer receta, Integer ingrediente) {
		super();
		this.receta = receta;
		this.ingrediente = ingrediente;
	}

	public Integer getReceta() {
		return receta;
	}

	public void setReceta(Integer receta) {
		this.receta = receta;
	}

	public Integer getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Integer ingrediente) {
		this.ingrediente = ingrediente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ingrediente, receta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecetaIngredienteId other = (RecetaIngredienteId) obj;
		return Objects.equals(ingrediente, other.ingrediente) && Objects.equals(receta, other.receta);
	}
	
	
}
