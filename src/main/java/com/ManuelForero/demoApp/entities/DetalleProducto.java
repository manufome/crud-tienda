package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "detalle_producto")
public class DetalleProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long idDetalle;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    @Column(name = "stock")
    private Long stock;
}
