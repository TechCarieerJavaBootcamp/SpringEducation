package com.springEdu.techcareer.week5.Saturday.Optional;

import com.springEdu.techcareer.week4.Sunday.dto.responseDto.StudentListByNameResponseDto;
import com.springEdu.techcareer.week4.Sunday.model.Student;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Student student = new Student();

        Optional<Student> user = Optional.empty();

       // Optional<Student> o = Optional.of(null);

        Optional<Student> user1 = Optional.ofNullable(student);
        user1.get();
    }
}
