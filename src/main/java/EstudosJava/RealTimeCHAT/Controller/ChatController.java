package EstudosJava.RealTimeCHAT.Controller;

import EstudosJava.RealTimeCHAT.Model.Message;
import EstudosJava.RealTimeCHAT.Model.mens;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(@Payload Message chatMessage) {
        System.out.println("Mensagem recebida do frontend: " + chatMessage.getContent());

        // Lógica de processamento da mensagem
        return chatMessage;
    }


}
