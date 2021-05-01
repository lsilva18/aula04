package com.company;

public class Pessoa {
    String nome;
    Endereco endereco;
    String numero;

    public Pessoa() {
    }

    public Pessoa(String nome, Endereco endereco, String numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Endereco consultaEndereco(){
        return endereco;
    }

    public String consultaNome(){
        return nome;
    }

}
