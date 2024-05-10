package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "precio_venta")
    private Double precioVenta;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaProducto categoria;
    @Column(name = "img_producto")
    private byte[] imgProducto;
}
