package com.springEdu.techcareer.week5.Saturday.exceptionHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {


      //     FileReader fileReader = new FileReader("C:\\\\test\\\\a.txt");

        try {
            FileReader fileReader = new FileReader("C:\\\\test\\\\a.txt");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Dosya bulunamadı!");
        }


    }


}
