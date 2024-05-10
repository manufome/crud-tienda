package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long idRol;
    @Column(name = "nombre_rol")
    private String nombreRol;
}
