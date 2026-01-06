package com.carloscess.gerenc_tarefa.service;

import com.carloscess.gerenc_tarefa.model.Task;
import com.carloscess.gerenc_tarefa.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    // Injenção de Dependência
    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAll(){
        return taskRepository.findAll(); // A interface de JPA ajuda bastante
    }
}
