package com.springEdu.techcareer.week5.Saturday.exceptionHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) throws IOException {

        FileReader file = null;
        BufferedReader fileInput =null;

        try {
            file = new FileReader("C:\\\\test\\\\a.txt");
            fileInput = new BufferedReader(file);
        } catch (Exception e) {
            System.out.println("Dosya bulunamadı.");
        } finally {
            if(file != null){
               file.close();
            }
            if(fileInput != null){
                fileInput.close();
            }
        }


    }
}
