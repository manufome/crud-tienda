package com.ManuelForero.demoApp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "estado_orden")
public class EstadoOrden {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_orden")
    private Long idEstadoOrden;
    @Column(name = "nombre_estado_orden")
    private String nombreEstadoOrden;

}
