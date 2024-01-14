package com.springEdu.techcareer.week5.Sunday.Product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="text")
    private String text;

    @ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;

}
