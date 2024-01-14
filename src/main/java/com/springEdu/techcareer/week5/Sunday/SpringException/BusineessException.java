package com.springEdu.techcareer.week5.Sunday.SpringException;

public class BusineessException extends Exception{

    public BusineessException(String message){
        super(message);
    }

    public BusineessException(String message, Throwable throwable){
        super(message, throwable);
    }
}
