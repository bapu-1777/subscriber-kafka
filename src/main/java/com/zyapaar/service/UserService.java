package com.zyapaar.service;

import com.zyapaar.model.User;
import com.zyapaar.util.KafkaConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @KafkaListener(topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
    public User listener(User c) {
        System.out.println("***Msg recieved from Kafka Topic ::" + c);
        return c;
    }

}
