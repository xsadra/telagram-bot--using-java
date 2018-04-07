package de.sadrab.telagrambotusingjava.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Reciver {
    @PostMapping
    void getPost(@RequestBody String data){
        System.out.println(data);
    }
@GetMapping
    void getGet(@RequestBody String data){
        System.out.println(data);
    }
}
