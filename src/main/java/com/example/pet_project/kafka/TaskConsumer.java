package com.example.pet_project.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskConsumer {
    private final StringRedisTemplate redisTemplate;

    @KafkaListener(topics = "tasks", groupId = "my-group")
    public void listen(String message){
        redisTemplate.opsForList().leftPush("tasks", message);
        System.out.println("📥 [CONSUMER] Received from Kafka and saved to Redis: " + message);
    }
}
