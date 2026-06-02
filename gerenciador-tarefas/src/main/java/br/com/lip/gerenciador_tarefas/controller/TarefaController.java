package br.com.lip.gerenciador_tarefas.controller;

import br.com.lip.gerenciador_tarefas.service.TarefaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.lip.gerenciador_tarefas.model.Tarefa;

import java.util.List;
@RestController
public class TarefaController {

    private final TarefaService tarefaService;

    TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping("/tarefas")
    public List<Tarefa> listarTarefas() {

        return tarefaService.buscarTarefa();
    }


    @GetMapping("/tarefas/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return tarefaService.buscarPorId(id);
    }
}
