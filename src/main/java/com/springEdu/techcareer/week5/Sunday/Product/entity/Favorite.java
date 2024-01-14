package com.springEdu.techcareer.week5.Sunday.Product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="favorite")
public class Favorite {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
}
