package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Column(name = "contrasena")
    private String contrasena;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
    @Column(name = "reset_token")
    private String reset_token;
}
