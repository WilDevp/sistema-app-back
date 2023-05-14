package com.wildevp.sistemas.app.service;

import com.wildevp.sistemas.app.entity.Usuario;
import com.wildevp.sistemas.app.entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> rolUsuarios) throws Exception;
    public  Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long usuarioId);
}
