package com.ithalosena.projetoorange2.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithalosena.projetoorange2.model.Comic;

public interface ComicRepository extends JpaRepository<Comic, Long> {

	Comic findById(long id);
	Comic deleteById(long id);
}
