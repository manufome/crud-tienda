package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "categorias_productos")
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    @Column(name = "img_categoria")
    private Blob imgCategoria;
}
