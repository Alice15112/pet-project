package com.example.pet_project.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskConsumer {
    private final StringRedisTemplate redisTemplate;
    private final TaskProcessor processor;

    @KafkaListener(topics = "tasks", groupId = "my-group")
    public void listen(String message){
        redisTemplate.opsForList().leftPush("tasks", message);
        processor.process(message);
        System.out.println("\uD83D\uDCE5 [CONSUMER] Saved and processed: " + message);
    }
}
