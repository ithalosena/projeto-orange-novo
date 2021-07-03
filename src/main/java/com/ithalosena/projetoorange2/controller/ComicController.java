package com.ithalosena.projetoorange2.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithalosena.projetoorange2.dto.ComicDTO;
import com.ithalosena.projetoorange2.model.Comic;
import com.ithalosena.projetoorange2.services.ComicService;

@RestController
@RequestMapping(path = "/api/comic")
public class ComicController {

	ComicService comicService;
	
	@Autowired
	public ComicController(ComicService comicService) {
		this.comicService = comicService;
	}
	
	@PostMapping
	public ResponseEntity<Comic> criarComic(@RequestBody @Valid ComicDTO comicDTO){
		Comic comicSalvo = comicService.inserirComic(comicDTO.dtoParaComic());
		if(comicDTO.equals(null)) {
			return new ResponseEntity<>(comicSalvo, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(comicSalvo, HttpStatus.CREATED);
	}
	
	@GetMapping
    public List<Comic> consultarTodos(){
        return comicService.consultarComic();
    }
}
