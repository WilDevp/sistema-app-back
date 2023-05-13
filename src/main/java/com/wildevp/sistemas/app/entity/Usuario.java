package com.wildevp.sistemas.app.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean enable = true;
    private String perfil;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "Usuario")
    private Set<UsuarioRol> rolesUsuarios = new HashSet<UsuarioRol>();
}
