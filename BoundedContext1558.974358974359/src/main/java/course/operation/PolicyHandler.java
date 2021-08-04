package course.operation;

import course.operation.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired Repository Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverEnrolled_CollectData(@Payload Enrolled enrolled){

        if(!enrolled.validate()) return;

        System.out.println("\n\n##### listener CollectData : " + enrolled.toJson() + "\n\n");



        // Sample Logic //
        //   = new ();
        // Repository.save();

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
