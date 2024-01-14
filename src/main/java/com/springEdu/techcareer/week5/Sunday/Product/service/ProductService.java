package com.springEdu.techcareer.week5.Sunday.Product.service;

import com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto.ProductSaveRequestDto;
import com.springEdu.techcareer.week5.Sunday.Product.entity.Product;
import com.springEdu.techcareer.week5.Sunday.Product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public boolean saveProduct(ProductSaveRequestDto productSaveRequestDto) {
        Product product = modelMapper.map(productSaveRequestDto, Product.class);
        productRepository.save(product);
        return true;
    }

}
