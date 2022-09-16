package com.artion.springboot.error.app.services;

import com.artion.springboot.error.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private List<Usuario> lista;

    public UsuarioServiceImpl() {
        this.lista = new ArrayList<>();
        lista.add(new Usuario(1, "jose", "ramirez"));
        lista.add(new Usuario(2, "pepa", "garcia"));
        lista.add(new Usuario(3, "lalo", "mena"));
        lista.add(new Usuario(4, "luci", "fernandez"));
        lista.add(new Usuario(5, "pato", "gonzales"));
        lista.add(new Usuario(6, "paco", "rodriguez"));
        lista.add(new Usuario(7, "andres", "gusman"));
    }

    @Override
    public List<Usuario> listar() {
        return this.lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        Usuario resultado = null;

        for (Usuario u: this.lista){
            if (u.getId().equals(id)){
                resultado = u;
                break;
            }
        }
        return resultado;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        Usuario usuario = this.obtenerPorId(id);

        return Optional.ofNullable(usuario);
    }
}
