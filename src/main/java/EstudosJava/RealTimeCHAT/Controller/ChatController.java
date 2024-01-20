package EstudosJava.RealTimeCHAT.Controller;

import EstudosJava.RealTimeCHAT.Model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@CrossOrigin(origins = "*")
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message sendMessage(Message chatMessage) {
        // Lógica de processamento da mensagem
        return chatMessage;
    }
}
