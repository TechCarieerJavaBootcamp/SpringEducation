package com.springEdu.techcareer.week5.Sunday.Product.repository;

import com.springEdu.techcareer.week5.Sunday.Product.entity.Customer;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
