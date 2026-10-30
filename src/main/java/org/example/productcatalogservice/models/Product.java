package org.example.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {

    private double price;
    private String description;
    private String imageUrl;
    private Category category;

}
