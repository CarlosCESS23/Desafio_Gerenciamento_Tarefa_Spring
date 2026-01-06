package com.carloscess.gerenc_tarefa.controller;


// Aqui é a criação de rotas para tipo de tarefa, onde temos que utilizar algumas anotações que são dadas por Spring

import com.carloscess.gerenc_tarefa.model.Task;
import com.carloscess.gerenc_tarefa.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller // O Spring entende que esse arquivo tipo java é um Controller
@RestController("/tarefa") //O Caminho onde ele vai levar para esse caminho pela URLs
public class TaskController {

    // Injeção de Dependência, Padrão de Projeto

    private final TaskService taskService; // Podemos utilizar anotação de @Autowire, que é o mesmo de criação de construtor ali

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    public List<Task> getAll(){
        return taskService.getAll();
    }
}
