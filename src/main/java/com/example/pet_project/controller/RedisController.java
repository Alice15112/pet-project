package com.example.pet_project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class RedisController {
    private final StringRedisTemplate redisTemplate;

    @GetMapping("/tasks")
    public List<String> getTasksFromRedis() {
        return redisTemplate.opsForList().range("tasks", 0, -1);
    }
}
