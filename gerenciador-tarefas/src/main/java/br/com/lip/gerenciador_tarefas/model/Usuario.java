package br.com.lip.gerenciador_tarefas.model;

import java.util.ArrayList;

public class Usuario {

    private String nomeId;
    private long senha;
    private ArrayList<Tarefa> tarefas;

    public Usuario(String nome) {
        this.nomeId = nome;
        this.tarefas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nomeId = nome;
    }

    public String getNome() {
        return this.nomeId;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }

    public long getSenha() {
        return this.senha;
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return this.tarefas;
    }
}
