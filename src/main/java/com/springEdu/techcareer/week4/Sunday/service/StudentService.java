package com.springEdu.techcareer.week4.Sunday.service;

import com.springEdu.techcareer.week4.Sunday.dto.StudentAddressUpdateDto;
import com.springEdu.techcareer.week4.Sunday.dto.StudentSaveRequestDto;
import com.springEdu.techcareer.week4.Sunday.model.Student;
import com.springEdu.techcareer.week4.Sunday.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public boolean saveStudent(StudentSaveRequestDto studentSaveRequestDto) {
        Student student = convertToStudentFromStudentSaveRequestDto(studentSaveRequestDto);
        studentRepository.save(student);
        return true;
    }

    private static Student convertToStudentFromStudentSaveRequestDto(StudentSaveRequestDto studentSaveRequestDto) {
        Student student = new Student();
        student.setStudentName(studentSaveRequestDto.getStudentName());
        student.setAddress(studentSaveRequestDto.getAddress());
        student.setTckn(studentSaveRequestDto.getTckn());
        //Yukarıdaki set işlemlerini yapar.
        // BeanUtils.copyProperties(studentSaveRequestDto, student);
        return student;
    }
    private static Student convertToStudentFromStudentSaveRequestDto2(StudentSaveRequestDto studentSaveRequestDto) {
        ModelMapper modelMapper = new ModelMapper();
        Student student = modelMapper.map(studentSaveRequestDto, Student.class);
        return student;
    }

    private Student convertToStudentFromStudentSaveRequestDto3(StudentSaveRequestDto studentSaveRequestDto) {
        return modelMapper.map(studentSaveRequestDto, Student.class);
    }

    public String updateStudentAddress(StudentAddressUpdateDto studentAddressUpdateDto) {
        Long id = studentAddressUpdateDto.getId();
        String address = studentAddressUpdateDto.getAddress();

        Optional<Student> studentById = studentRepository.findById(id);

        try {
            Student student = studentById.get();
            student.setAddress(address);
            studentRepository.save(student);
            return "Güncelleme başarılı";

        } catch (Exception e) {
            e.printStackTrace();
            return String.format("%s Id'ye sahip bir öğrenci bulunmamaktadır!", id);
        }
    }
}
