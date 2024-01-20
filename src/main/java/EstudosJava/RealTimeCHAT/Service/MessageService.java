package EstudosJava.RealTimeCHAT.Service;

import EstudosJava.RealTimeCHAT.Model.Message;
import EstudosJava.RealTimeCHAT.Model.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> getAllMessages(){
        return repository.findAll();
    };

    public Message saveMessage(Message message){
        return repository.save(message);
    };

}
