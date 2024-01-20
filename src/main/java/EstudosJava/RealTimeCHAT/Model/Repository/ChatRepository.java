package EstudosJava.RealTimeCHAT.Model.Repository;

import EstudosJava.RealTimeCHAT.Model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {

}
