package com.springEdu.techcareer.week5.Sunday.Product.service;

import com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto.CommentSaveRequestDto;
import com.springEdu.techcareer.week5.Sunday.Product.entity.Comment;
import com.springEdu.techcareer.week5.Sunday.Product.entity.Customer;
import com.springEdu.techcareer.week5.Sunday.Product.entity.Product;
import com.springEdu.techcareer.week5.Sunday.Product.repository.CommentRepository;
import com.springEdu.techcareer.week5.Sunday.Product.repository.CustomerRepository;
import com.springEdu.techcareer.week5.Sunday.Product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Comments;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    public Boolean saveComment(CommentSaveRequestDto commentSaveRequestDto) {

        String text = commentSaveRequestDto.getText();
        Long productId = commentSaveRequestDto.getProductId();
        Long customerId = commentSaveRequestDto.getCustomerId();

        Product product = productRepository.findById(productId).get();
        Customer customer = customerRepository.findById(customerId).get();

        Comment comment = new Comment();
        comment.setText(text);
        comment.setProduct(product);
        comment.setCustomer(customer);

        commentRepository.save(comment);

        return true;
    }
}
