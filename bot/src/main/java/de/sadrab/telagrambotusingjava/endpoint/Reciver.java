package de.sadrab.telagrambotusingjava.endpoint;

import de.sadrab.telagrambotusingjava.controller.SendMessage;
import de.sadrab.telagrambotusingjava.persistence.model.Message;
import de.sadrab.telagrambotusingjava.persistence.model.MessageToSend;
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

    @PostMapping
    String getPost(@RequestBody Update data) {
        System.out.println("Post: " + data);
        Message message = data.getMessage();
        System.out.println("Message from: [" + message.getFrom().getFirst_name() + "] is < " + message.getText() + " >");
         MessageToSend send_message = new MessageToSend();
        System.out.println(message.getChat().getId());
       send_message.setChat_id(message.getChat().getId());
        send_message.setMessage_id(message.getFrom().getId());
        send_message.setText("Answer: "+message.getText());
        sendMessage.send(send_message);
        return "ok";
    }
}
