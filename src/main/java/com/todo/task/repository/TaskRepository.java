package com.todo.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.task.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    
}
