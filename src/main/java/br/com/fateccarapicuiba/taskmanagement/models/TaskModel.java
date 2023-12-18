package br.com.fateccarapicuiba.taskmanagement.models;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column(length = 45)
    private String task;

    @Enumerated(EnumType.STRING)
    private StatusTaskEnum status;

    @Enumerated(EnumType.STRING)
    private PriorityTaskEnum priority;

    private LocalDate dueDate;
}
