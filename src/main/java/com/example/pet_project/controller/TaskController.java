package com.example.pet_project.controller;

import com.example.pet_project.model.Task;
import com.example.pet_project.producer.TaskProducer;
import com.example.pet_project.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskRepository repository;
    private final TaskProducer producer;

    @GetMapping
    public List<Task> getAll(){
        return repository.findAll();
    }

    @PostMapping
    public Task create(@RequestBody Task task){
        Task saved = repository.save(task);
        producer.sendTask(saved);
        return saved;
    }
}
