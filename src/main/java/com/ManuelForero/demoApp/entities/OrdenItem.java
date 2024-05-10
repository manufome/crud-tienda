package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "orden_items")
public class OrdenItem {
    @EmbeddedId
    private OrdenItemPK id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Orden orden;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Producto producto;

    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "precio_unitario")
    private Long precioUnitario;
}

