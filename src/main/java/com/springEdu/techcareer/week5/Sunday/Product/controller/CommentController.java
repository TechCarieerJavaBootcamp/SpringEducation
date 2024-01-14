package com.springEdu.techcareer.week5.Sunday.Product.controller;

import com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto.CommentSaveRequestDto;
import com.springEdu.techcareer.week5.Sunday.Product.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/saveComment")
    public ResponseEntity<Boolean> saveComment(@RequestBody CommentSaveRequestDto commentSaveRequestDto){
        Boolean isSaveComment = commentService.saveComment(commentSaveRequestDto);
        return new ResponseEntity<>(isSaveComment, HttpStatus.OK);
    }


}
