package matching;

import matching.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired ClassStatusRepository ClassStatusRepository;
    @Autowired ClassRepository ClassRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverVisitAssigned_(@Payload VisitAssigned visitAssigned){

        if(visitAssigned.isMe()){
            System.out.println("##### listener  : " + visitAssigned.toJson());

            ClassStatus classStatus = new ClassStatus();

            classStatus.setId(visitAssigned.getMatchId());
            classStatus.setTeacher(visitAssigned.getTeacher());
            classStatus.setVisitDate(visitAssigned.getVisitDate());
            ClassStatusRepository.save(classStatus);

        }

    }

}
