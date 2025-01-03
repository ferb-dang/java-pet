package com.todo.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.task.dto.request.TaskCreateRequest;
import com.todo.task.entity.Task;
import com.todo.task.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    List<Task> getTasks(){
        return taskService.getTask();
    }

    @GetMapping("/{task_id}")
    Task getTaskById(@PathVariable("task_id") String taskId){
        return taskService.getTaskById(taskId);
    }

    @PostMapping
    public Task createTask(@RequestBody TaskCreateRequest request){
        return taskService.createTask(request);
    }
}
