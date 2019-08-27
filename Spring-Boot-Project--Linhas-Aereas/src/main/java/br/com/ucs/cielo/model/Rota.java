package br.com.ucs.cielo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "rota")
public class Rota {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)		
	private Integer id;
    
	private String origem;    
	private String destino;
	private Integer aeronave_id;
	
	public Rota(String origem, String destino, Integer aeronave_id) {
		this.origem = origem;
		this.destino = destino;
		this.aeronave_id = 1;
	}
	
	public Rota() {
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getAeronave_id() {
		return aeronave_id;
	}

	public void setAeronave_id(Integer aeronave_id) {
		this.aeronave_id = aeronave_id;
	}
}
