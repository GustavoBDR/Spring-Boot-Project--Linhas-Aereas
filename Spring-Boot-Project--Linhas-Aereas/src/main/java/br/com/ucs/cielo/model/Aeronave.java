package br.com.ucs.cielo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "aeronave")
public class Aeronave {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
    
	private String fabricante;    
	private String modelo;
	private Integer capacidade;
	
    public Aeronave(String fabricante, String modelo, Integer capacidade) {
    	this.fabricante = fabricante;
    	this.modelo = modelo;
    	this.capacidade = capacidade;
    }	
	
    public Aeronave() {
    }
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
		
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
