package com.ithalosena.projetoorange2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithalosena.projetoorange2.model.Comic;
import com.ithalosena.projetoorange2.model.repositories.ComicRepository;

@Service
public class ComicService {
	ComicRepository comictRepository;
	
	@Autowired
	public ComicService(ComicRepository comicRepository) {
		this.comictRepository = comicRepository;
	}
	
	
	public Comic inserirComic(Comic comic) {
		return comictRepository.save(comic);
		
	}
	
	public List<Comic> consultarComic(){
		return comictRepository.findAll();
	}
	
	public Comic consultarPorId(long id){
        return comictRepository.findById(id);
    }
}
