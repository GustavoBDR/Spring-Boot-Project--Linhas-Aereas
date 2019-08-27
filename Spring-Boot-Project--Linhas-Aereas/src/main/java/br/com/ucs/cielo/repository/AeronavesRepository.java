package br.com.ucs.cielo.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ucs.cielo.model.Aeronave;

public interface AeronavesRepository extends CrudRepository<Aeronave, Long>{

}
