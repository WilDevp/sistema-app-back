package com.wildevp.sistemas.app;

import com.wildevp.sistemas.app.entity.Rol;
import com.wildevp.sistemas.app.entity.Usuario;
import com.wildevp.sistemas.app.entity.UsuarioRol;
import com.wildevp.sistemas.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemasAppBackApplication implements CommandLineRunner {
    @Autowired
    private UsuarioService service;
    public static void main(String[] args) {
        SpringApplication.run(SistemasAppBackApplication.class, args);
    }
    @Override
    public void run(String[] args)throws Exception {
      /*  Usuario usuario = new Usuario();
        usuario.setNombre("Wilmar");
        usuario.setApellido("Garcia");
        usuario.setUsername("wildevp");
        usuario.setPassword("wildevp");
        usuario.setEmail("wildevp@gmail.com");
        usuario.setTelefono("3028676522");
        usuario.setPerfil("foto.png");

        Rol rol = new Rol();
        rol.setRolId(1L);
        rol.setNombreRol("ADMIN");

        Set<UsuarioRol> rolUsuarios = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);
        rolUsuarios.add(usuarioRol);

        Usuario usuarioGuardado = service.guardarUsuario(usuario, rolUsuarios);
        System.out.println(usuarioGuardado.getUsername());*/
    }
}
