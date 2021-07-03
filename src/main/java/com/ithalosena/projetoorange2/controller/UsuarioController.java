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

import com.ithalosena.projetoorange2.dto.UsuarioDTO;
import com.ithalosena.projetoorange2.model.Usuario;
import com.ithalosena.projetoorange2.services.UsuarioService;


@RestController
@RequestMapping(path = "/api/usuario")
public class UsuarioController {
	
	UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

	@PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
         Usuario usuarioSalvo =  usuarioService.salvar(usuarioDTO.dtoParaUsuario());
         if (usuarioDTO.equals(null)){
             return new ResponseEntity<>(usuarioSalvo, HttpStatus.BAD_REQUEST);
         }
         return new ResponseEntity<>(usuarioSalvo, HttpStatus.CREATED);
    }
	
	@GetMapping
    public List<Usuario> consultarTodos(){
        return usuarioService.consultarTodos();
    }
	
}
