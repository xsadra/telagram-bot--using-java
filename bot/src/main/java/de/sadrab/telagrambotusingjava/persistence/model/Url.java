package de.sadrab.telagrambotusingjava.persistence.model;

import org.springframework.beans.factory.annotation.Value;

public class Url {
    @Value("${TELEGRAM.URL}")
    private String URL;

//    @Value("${TELEGRAM.API_KEY}")
   private  String API_KEY;

   private String method;

    public String get(Methods method){
        return URL+API_KEY+ "/"+method.toString();
    }
}
