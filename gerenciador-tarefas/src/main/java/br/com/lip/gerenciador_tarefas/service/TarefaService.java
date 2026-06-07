package br.com.lip.gerenciador_tarefas.service;
//package br.com.lip.gerenciador_tarefas.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.lip.gerenciador_tarefas.model.Tarefa;
import br.com.lip.gerenciador_tarefas.model.Status;
import br.com.lip.gerenciador_tarefas.model.Prioridade;

@Service
public class TarefaService {
    List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> buscarTarefa(){
    	tarefas.clear();
        Tarefa tarefa1 = new Tarefa();

        tarefa1.setId(1L);
        tarefa1.setTitulo("Estudar Spring");
        tarefa1.setDescricao("Aprender camada Service");
        tarefa1.setStatus(Status.PENDENTE);
        tarefa1.setPrioridade(Prioridade.ALTA);

        tarefas.add(tarefa1);

        Tarefa tarefa2 = new Tarefa();

        tarefa2.setId(2L);
        tarefa2.setTitulo("Estudar Java");
        tarefa2.setDescricao("Aprender Spring Boot");
        tarefa2.setStatus(Status.CONCLUIDA);
        tarefa2.setPrioridade(Prioridade.BAIXA);

        tarefas.add(tarefa2);

        return tarefas;
    }


    public Tarefa buscarPorId(Long id){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId().equals(id)){
                return tarefa;
            }
        }
        return null;
    }

}
