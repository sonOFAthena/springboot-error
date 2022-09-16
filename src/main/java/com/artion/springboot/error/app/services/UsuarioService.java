package com.artion.springboot.error.app.services;

import com.artion.springboot.error.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public List<Usuario> listar();
    public Usuario obtenerPorId(Integer id);
    public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
