package com.todo.task.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    // @OneToOne
    // @MapsId
    // private User user;

    @Column
    private String title;

    @Column
    private String description;
}
