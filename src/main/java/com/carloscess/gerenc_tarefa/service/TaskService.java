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

    //metódo de get que iremos utilizar no Control
    public List<Task> getAll(){
        return taskRepository.findAll(); // A interface de JPA ajuda bastante
    }
    // Metódo de post que iremos utilizar no Control
    public Task save(Task task){
        return taskRepository.save(task);
    }
    //metódo de Delete que iremos utilizar no Control
    public void delete(Long id){
        taskRepository.deleteById(id);
        return;
    }


}
