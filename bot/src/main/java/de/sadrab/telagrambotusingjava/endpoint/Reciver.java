package de.sadrab.telagrambotusingjava.endpoint;

import de.sadrab.telagrambotusingjava.persistence.model.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Reciver {

    @Value("${TELEGRAM.URL}")
    private String URL;

//    @Value("${TELEGRAM.API_KEY}")
//    private  String API_KEY;
//
    private RestTemplate restTemplate;

    public Reciver(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    void getPost(@RequestBody Update data){
        System.out.println("Post: "+data);

    }
}
