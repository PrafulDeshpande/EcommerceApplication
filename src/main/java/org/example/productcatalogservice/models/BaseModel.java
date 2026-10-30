package org.example.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public abstract class BaseModel {

    private long id;
    private String name;
    private Date CreatedAt;
    private Date UpdateAt;
    private State state;

}
