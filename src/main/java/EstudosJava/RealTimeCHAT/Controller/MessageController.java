package EstudosJava.RealTimeCHAT.Controller;

import EstudosJava.RealTimeCHAT.Model.Message;
import EstudosJava.RealTimeCHAT.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private MessageService MessageService;
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @GetMapping("/message")
    public ResponseEntity<List<Message>> messageGet(Model model) {
         return new ResponseEntity<>(MessageService.getAllMessages(), HttpStatus.OK);
    }
    @PostMapping("/message")
    public ResponseEntity<Message> messagePost(@RequestBody Message message) {
        if (message == null || message.getContent() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Message savedMessage = MessageService.saveMessage(message);
        return new ResponseEntity<>(savedMessage, HttpStatus.OK);
    }

}
