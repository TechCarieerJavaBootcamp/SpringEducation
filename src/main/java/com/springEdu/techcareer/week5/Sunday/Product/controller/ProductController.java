package com.springEdu.techcareer.week5.Sunday.Product.controller;

import com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto.ProductSaveRequestDto;
import com.springEdu.techcareer.week5.Sunday.Product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

   private final ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<Boolean> saveProduct(@RequestBody ProductSaveRequestDto productSaveRequestDto){
        boolean isSaveProduct = productService.saveProduct(productSaveRequestDto);
        return new ResponseEntity<>(isSaveProduct, HttpStatus.OK);

    }
}
