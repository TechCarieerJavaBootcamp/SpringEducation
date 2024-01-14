package com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentSaveRequestDto {

    private String text;
    private Long productId;
    private Long customerId;
}
