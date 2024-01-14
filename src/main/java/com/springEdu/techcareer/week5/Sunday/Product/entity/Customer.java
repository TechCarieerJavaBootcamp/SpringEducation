package com.springEdu.techcareer.week5.Sunday.Product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="last_name")
    private String lastName;


}
