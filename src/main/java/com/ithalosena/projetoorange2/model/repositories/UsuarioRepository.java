package com.ithalosena.projetoorange2.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ithalosena.projetoorange2.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	Usuario findById(long id);
	Usuario deleteById(long id);
}
