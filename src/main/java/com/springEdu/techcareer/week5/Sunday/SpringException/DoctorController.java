package com.springEdu.techcareer.week5.Sunday.SpringException;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {

    @Qualifier("drService")
    private final DoctorService doctorService;

    @GetMapping("/getDoctorByName")
    public ResponseEntity<String> getDoctorByName(@RequestParam String name){
        String doctorByName = doctorService.getDoctorByName(name);
        return new ResponseEntity<>(doctorByName, HttpStatus.OK);
    }

    @GetMapping("/getDoctorByName1")
    public ResponseEntity<String> getDoctorByName1(@RequestParam String name) throws BusineessException {
        String doctorByName = doctorService.getDoctorByName1(name);
        return new ResponseEntity<>(doctorByName, HttpStatus.OK);
    }


}
