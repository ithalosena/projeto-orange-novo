package com.ithalosena.projetoorange2.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithalosena.projetoorange2.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findById(long id);
	Usuario deleteById(long id);
}
