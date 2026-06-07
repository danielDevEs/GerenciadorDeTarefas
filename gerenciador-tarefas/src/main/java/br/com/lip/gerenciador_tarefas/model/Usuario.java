package br.com.lip.gerenciador_tarefas.model;

// import java.util.ArrayList;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    // private ArrayList<Tarefa> tarefas;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }


    // public void addTarefa (Tarefa tarefa){
    //     tarefas.add(tarefa);
    // }

    // public ArrayList<Tarefa> getTarefas(){
    //     return tarefas;
    // }

}
