package com.springEdu.techcareer.week5.Sunday.Product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;
}
