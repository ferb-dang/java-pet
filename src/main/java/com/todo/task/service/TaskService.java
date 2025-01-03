package com.todo.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.task.dto.request.TaskCreateRequest;
import com.todo.task.entity.Task;
import com.todo.task.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTask(){
        return taskRepository.findAll();
    }

    public Task getTaskById(String id){
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Error when calling this id!"));
    }

    public Task createTask(TaskCreateRequest request){
        Task task = new Task();

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());

        return taskRepository.save(task);
    }
}
