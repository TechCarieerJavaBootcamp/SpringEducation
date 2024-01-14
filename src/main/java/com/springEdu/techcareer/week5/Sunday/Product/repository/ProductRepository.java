package com.springEdu.techcareer.week5.Sunday.Product.repository;

import com.springEdu.techcareer.week5.Sunday.Product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
