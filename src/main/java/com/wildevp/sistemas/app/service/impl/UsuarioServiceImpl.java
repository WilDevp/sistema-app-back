package com.wildevp.sistemas.app.service.impl;

import com.wildevp.sistemas.app.entity.Usuario;
import com.wildevp.sistemas.app.entity.UsuarioRol;
import com.wildevp.sistemas.app.repository.RolRepository;
import com.wildevp.sistemas.app.repository.UsuarioRepository;
import com.wildevp.sistemas.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> rolUsuarios) throws Exception {
        Usuario nombreUsuario = usuarioRepository.findByUsername(usuario.getUsername());
        if(nombreUsuario != null) {
            throw new Exception("El usuario ya existe");
        }
         for (UsuarioRol usuarioRol:rolUsuarios){
             rolRepository.save(usuarioRol.getRol());
         }
         usuario.getRolesUsuarios().addAll(rolUsuarios);
         nombreUsuario = usuarioRepository.save(usuario);
         return nombreUsuario;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
}
