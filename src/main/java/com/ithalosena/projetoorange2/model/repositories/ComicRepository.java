package com.ithalosena.projetoorange2.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ithalosena.projetoorange2.model.Comic;

public interface ComicRepository extends CrudRepository<Comic, Long> {

	Comic findById(long id);
	Comic deleteById(long id);
}
