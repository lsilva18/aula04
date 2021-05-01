package com.company;

public class Compra {
    Pessoa pessoa = new Pessoa();
    Produto produto = new Produto();

    public Compra() {
    }

    void comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
    }
    public String verificarCompra(){
        String a = "Parabéns, " + pessoa.consultaNome() + "!";
        String c = "\nSua compra foi concluída com sucesso.";
        String b = "\nVocê acabou de comprar um(a) " + produto.consultaNome();
        return a + b + c ;
    }

}
