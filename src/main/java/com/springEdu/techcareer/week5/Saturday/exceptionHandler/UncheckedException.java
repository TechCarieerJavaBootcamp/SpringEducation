package com.springEdu.techcareer.week5.Saturday.exceptionHandler;

import com.springEdu.techcareer.week4.Sunday.model.Student;

public class UncheckedException {

    public static void main(String[] args) {

        Student student = null;
        student.setStudentName("Mahir");

        System.out.println(student.getStudentName());

    }
}
