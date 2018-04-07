package de.sadrab.telagrambotusingjava.endpoint;

import de.sadrab.telagrambotusingjava.controller.SendMessage;
import de.sadrab.telagrambotusingjava.persistence.model.Message;
import de.sadrab.telagrambotusingjava.persistence.model.Update;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Reciver {

    private RestTemplate restTemplate;

    private SendMessage sendMessage;
    public Reciver(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Reciver(RestTemplate restTemplate, SendMessage sendMessage) {
        this.restTemplate = restTemplate;
        this.sendMessage = sendMessage;
    }

    @PostMapping
    void getPost(@RequestBody Update data){
        System.out.println("Post: "+data);
        Message message = data.getMessage();
        Message send_message = null;
        send_message.setChat(message.getChat());
        send_message.setMessage_id(message.getFrom().getId());
        send_message.setText("Answer: "+message.getText());
        sendMessage.send(send_message);
    }
}
