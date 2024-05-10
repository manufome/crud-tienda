package com.ManuelForero.demoApp.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrdenItemPK implements Serializable {
    private Long orderId;
    private Long productId;
}
