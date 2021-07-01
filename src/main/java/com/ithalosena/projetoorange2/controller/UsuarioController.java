package com.ithalosena.projetoorange2.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ithalosena.projetoorange2.model.Usuario;
import com.ithalosena.projetoorange2.model.repositories.UsuarioRepository;
import com.ithalosena.projetoorange2.services.UsuarioService;


@RestController
@RequestMapping(path = "/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
         Usuario usuarioSalvo =  UsuarioService.salvar(usuarioDTO.dtoParaUsuario());
         if (usuarioDTO.equals(null)){
             return new ResponseEntity<>(usuarioSalvo, HttpStatus.BAD_REQUEST);
         }
         return new ResponseEntity<>(usuarioSalvo, HttpStatus.CREATED);
    }
}
