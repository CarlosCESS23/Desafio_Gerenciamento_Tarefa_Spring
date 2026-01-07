package com.carloscess.gerenc_tarefa.repository;

import com.carloscess.gerenc_tarefa.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// Não é uma classe e sim uma interface
public interface TaskRepository extends JpaRepository<Task,Long> { //É necessário que coloque a entidade ( que é a classe que criamos no model) e o 2° paramêtro é o identificador

}
