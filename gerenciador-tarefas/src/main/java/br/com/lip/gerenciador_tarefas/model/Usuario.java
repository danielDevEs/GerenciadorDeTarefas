package br.com.lip.gerenciador_tarefas.model;
import java.util.ArrayList;


public class Usuario {
    private String id;
    private long senha;
    private ArrayList<Tarefa> tarefas;

    
    public Usuario(){
        this.id = "";
        this.senha = 0;
        tarefas = new ArrayList<Tarefa>();

    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public long getSenha(){
        return this.senha;
    }

    public void cadastrarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);

    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }




}
