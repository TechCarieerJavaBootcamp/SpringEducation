package com.springEdu.techcareer.week5.Sunday.Product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "street")
    private String street;

    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;

}
