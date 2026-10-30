package main.java.com.example.backend.model;



public class Maquina{
    int id;
    String nome;
    String tipo;
    String setor;
    String status;

    public Maquina(int id, String nome, String tipo, String setor, String status){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.setor = setor;
        this.status = status;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return setor;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }

    public void exibirMaquina(){
        System.out.println(Maquina);
    }


}