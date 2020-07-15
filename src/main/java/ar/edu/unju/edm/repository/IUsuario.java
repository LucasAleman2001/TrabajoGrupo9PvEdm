package ar.edu.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario,Integer>{
	
}
