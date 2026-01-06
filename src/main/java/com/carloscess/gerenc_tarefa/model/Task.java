package com.carloscess.gerenc_tarefa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//Criação de modelo Tarefa, onde ele vai ser transformado em uma tabela de Entidade
@Entity
@Table(name="task_table") // Nomeando o nome da tabela
@Data // Aqui ele gera automáticamente o uso do GETTER, SETTER, Construtores e entre outros
public class Task {


    @Id // Aqui é uma anotação de Chave primária
    @GeneratedValue // Aqui automáticamente acrescenta o id para cada tarefa criada
    private Long id;
    private String name;
    private String description;
    private boolean finish;
    private boolean priority;


}
