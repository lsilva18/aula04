package com.company;

public class Produto {
    long codigo;
    String nome;

    public Produto() {
    }

    public Produto(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String consultaNome() {
        return nome;
    }
}
