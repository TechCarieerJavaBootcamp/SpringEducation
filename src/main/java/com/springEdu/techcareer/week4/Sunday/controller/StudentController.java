package com.springEdu.techcareer.week4.Sunday.controller;

import com.springEdu.techcareer.week4.Sunday.dto.requestDto.StudentAddressUpdateDto;
import com.springEdu.techcareer.week4.Sunday.dto.requestDto.StudentSaveRequestDto;
import com.springEdu.techcareer.week4.Sunday.dto.responseDto.StudentListByNameResponseDto;
import com.springEdu.techcareer.week4.Sunday.model.Student;
import com.springEdu.techcareer.week4.Sunday.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

   private final StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Boolean> saveStudent(@RequestBody StudentSaveRequestDto studentSaveRequestDto) {
        boolean isSaveStudent = false;
        try {
            isSaveStudent = studentService.saveStudent1(studentSaveRequestDto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(isSaveStudent, HttpStatus.CREATED);
    }

    @PutMapping("/updateStudentAddress")
    public ResponseEntity<String> updateStudentAddress(@RequestBody StudentAddressUpdateDto studentAddressUpdateDto){
        String isUpdateStudentAddress = studentService.updateStudentAddress(studentAddressUpdateDto);
        return new ResponseEntity<>(isUpdateStudentAddress, HttpStatus.OK);
    }

    @GetMapping("/getAllStudentByName")
    public ResponseEntity<List<StudentListByNameResponseDto>> getAllStudentByName(@RequestParam String studentName){
        List<StudentListByNameResponseDto> allStudentByName = studentService.getAllStudentByName(studentName);
        return new ResponseEntity<>(allStudentByName, HttpStatus.OK);
    }

}