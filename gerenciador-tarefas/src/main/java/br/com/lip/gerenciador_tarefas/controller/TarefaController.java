package br.com.lip.gerenciador_tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lip.gerenciador_tarefas.model.Tarefa;

@RestController
public class TarefaController {

    @GetMapping("/tarefas")
    public Tarefa listarTarefas() {

        Tarefa tarefa = new Tarefa();

        tarefa.setId(1L);
        tarefa.setTitulo("Estudar Spring Boot");
        tarefa.setDescricao("Criar API de gerenciamento de tarefas");

        return tarefa;
    }
}
