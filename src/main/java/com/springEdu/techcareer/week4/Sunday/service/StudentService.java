package com.springEdu.techcareer.week4.Sunday.service;

import com.springEdu.techcareer.week4.Sunday.dto.requestDto.StudentAddressUpdateDto;
import com.springEdu.techcareer.week4.Sunday.dto.requestDto.StudentSaveRequestDto;
import com.springEdu.techcareer.week4.Sunday.dto.responseDto.StudentListByNameResponseDto;
import com.springEdu.techcareer.week4.Sunday.model.Student;
import com.springEdu.techcareer.week4.Sunday.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;



    public boolean saveStudent(StudentSaveRequestDto studentSaveRequestDto) {
        Student student = convertToStudentFromStudentSaveRequestDto(studentSaveRequestDto);
        studentRepository.save(student);
        return true;
    }

   // @SneakyThrows
    public boolean saveStudent1(StudentSaveRequestDto studentSaveRequestDto) throws Exception {
        Student student = convertToStudentFromStudentSaveRequestDto(studentSaveRequestDto);
        try {
            studentRepository.save(student);
        }catch (Exception e){
            throw new Exception("Bir hata ile karşılaşıldı");
        }
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
        Student student = modelMapper.map(studentSaveRequestDto, Student.class);
        return student;
    }

    public String updateStudentAddress(StudentAddressUpdateDto studentAddressUpdateDto) {
        Long id = studentAddressUpdateDto.getId();
        String address = studentAddressUpdateDto.getAddress();


        try {
            Optional<Student> studentById = studentRepository.findById(id);
            if(studentById.isPresent()) {
                Student student = studentById.get();
                student.setAddress(address);
                studentRepository.save(student);
                return "Güncelleme başarılı";
            }
            return "Bu Id'ye sahip kullanıcı bulunmamaktadır.";

        } catch (Exception e) {
            e.printStackTrace();
            return "Bir hata ile karılaşıldı! Tekrar deneyin.";
        }

    }

    public List<StudentListByNameResponseDto> getAllStudentByName(String studentName) {
        List<StudentListByNameResponseDto> studentListByNameResponseDtoList = new ArrayList<>();

        List<Student> allStudentsByName = studentRepository.findAllByStudentName(studentName);

        for (Student student : allStudentsByName) {
            StudentListByNameResponseDto studentListByNameResponseDto = modelMapper.map(student, StudentListByNameResponseDto.class);
            studentListByNameResponseDtoList.add(studentListByNameResponseDto);
        }
        return studentListByNameResponseDtoList;
    }


    public List<StudentListByNameResponseDto> getAllStudentByName1(String studentName) {
        List<Student> allStudentsByName = studentRepository.findAllByStudentName(studentName);
       return allStudentsByName.stream()
                .map(student -> modelMapper.map(student, StudentListByNameResponseDto.class))
                .toList();
    }



}
