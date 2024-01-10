package com.springEdu.techcareer.week4.Sunday.controller;

import com.springEdu.techcareer.week4.Sunday.dto.StudentAddressUpdateDto;
import com.springEdu.techcareer.week4.Sunday.dto.StudentSaveRequestDto;
import com.springEdu.techcareer.week4.Sunday.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Boolean> saveStudent(@RequestBody StudentSaveRequestDto studentSaveRequestDto) {
        boolean isSaveStudent = studentService.saveStudent(studentSaveRequestDto);
        return new ResponseEntity<>(isSaveStudent, HttpStatus.OK);
    }

    @PutMapping("/updateStudentAddress")
    public ResponseEntity<String> updateStudentAddress(@RequestBody StudentAddressUpdateDto studentAddressUpdateDto){
        String isUpdateStudentAddress = studentService.updateStudentAddress(studentAddressUpdateDto);
        return new ResponseEntity<>(isUpdateStudentAddress, HttpStatus.OK);
    }

}
