package com.example.pet_project.producer;

import com.example.pet_project.model.Task;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void sendTask(Task task){
        try {
            String json = objectMapper.writeValueAsString(task);
            kafkaTemplate.send("tasks", json);
            System.out.println("\uD83D\uDCE4 [PRODUCER] Sent to Kafka: :" + json);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
