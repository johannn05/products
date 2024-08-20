package com.joshop.products.event.model;
import java.io.Serializable;
import java.util.UUID;

public class ProductEvent implements Serializable {

    private UUID productId;
    private String name;
    private String shortDescription;
    private double price;

    // getters and setters
}
