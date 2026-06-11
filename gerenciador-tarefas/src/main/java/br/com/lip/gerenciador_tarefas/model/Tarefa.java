package br.com.lip.gerenciador_tarefas.model;

public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private Status status;
    private Prioridade prioridade;

    public Long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public Status getStatus() {
    	return this.status;
    }
    
    public void setStatus( Status value) {
    	this.status = value;
    }
    
    public Prioridade getPrioridade() {
    	return this.prioridade;
    }
    
    public void setPrioridade(Prioridade value) {
    	this.prioridade = value;
    }
}
