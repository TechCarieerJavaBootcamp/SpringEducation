package com.springEdu.techcareer.week5.Sunday.SpringException;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.print.Doc;

@Service("drService")
public class DoctorService {

    public String getDoctorByName(String name) {
        Doctor doctor = null;
        doctor.setName(name);

        return doctor.getName();
    }

    public String getDoctorByName1(String name) throws BusineessException {
        if(name.startsWith("A")){
            throw new BusineessException("İsmi A ile başlayan doktor bulunmamaktadır.");
        }

        Doctor doctor = new Doctor();
        doctor.setName(name);
        return doctor.getName();

//        try {
//            Doctor doctor = null;
//            doctor.setName(name);
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally bloğuna girdi.");
//        }



    }

}
