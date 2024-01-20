package EstudosJava.RealTimeCHAT.Service;

import EstudosJava.RealTimeCHAT.Model.Chat;
import EstudosJava.RealTimeCHAT.Model.Repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatService {
    @Autowired
    private ChatRepository repository;
    public Chat GetChatById(Long id){
        return repository.getReferenceById(id);
    }
}
