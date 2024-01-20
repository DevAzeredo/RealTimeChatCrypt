package EstudosJava.RealTimeCHAT.Model.Repository;

import EstudosJava.RealTimeCHAT.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

};

