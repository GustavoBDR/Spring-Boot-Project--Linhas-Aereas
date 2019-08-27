package br.com.ucs.cielo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue	
	private Integer id;
    
	private String passageiro_cpf;    
	private Integer rota_id;
	private String poltrona;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}	
	
	public String getPassageiro_cpf() {
		return passageiro_cpf;
	}
	
	public void setPassageiro_cpf(String passageiro_cpf) {
		this.passageiro_cpf = passageiro_cpf;
	}
	
	public Integer getRota_id() {
		return rota_id;
	}
	
	public void setRota_id(Integer rota_id) {
		this.rota_id = rota_id;
	}
	
	public String getPoltrona() {
		return poltrona;
	}
	
	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}
}
