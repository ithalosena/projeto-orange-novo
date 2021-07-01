package com.ithalosena.projetoorange2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithalosena.projetoorange2.model.Usuario;
import com.ithalosena.projetoorange2.model.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> consultarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario consultarUsuario(long id) {
        return usuarioRepository.findById(id);
    }

    public MensagemRespostaDTO deletarUsuario(long id) {
        usuarioRepository.deleteById(id);
        String mensagem = "Usuário deletado com Sucesso";
        return new MensagemRespostaDTO(mensagem);
    }