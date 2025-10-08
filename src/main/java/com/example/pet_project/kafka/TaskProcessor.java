package com.example.pet_project.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskProcessor {

    public void process(String taskJson) {
        System.out.println("⚙️ [PROCESSOR] Processing task: " + taskJson);
        try {
            Thread.sleep(1000); // имитация длительной операции
            System.out.println("✅ [PROCESSOR] Task processed: " + taskJson);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
