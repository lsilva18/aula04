package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Produto>  produtos = new ArrayList<Produto> ();

        produtos.add(new Produto(1, "pera"));
        produtos.add(new Produto(2, "calculadora"));

        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        Compra compra = new Compra();
        String escolha;


        System.out.println("Informe seu nome");
        pessoa.setNome(keyboard.nextLine());

        System.out.println("Informe o nome da rua em que você mora:");
        endereco.setLogradouro(keyboard.nextLine());
        System.out.println("Informe o nome da sua cidade:");
        endereco.setCidade(keyboard.nextLine());
        System.out.println("Informe o nome do seu estado:");
        endereco.setEstado(keyboard.nextLine());

        System.out.println("Digite o nome do produto que deseja:");
        for (Produto p: produtos ) {
            System.out.println(p.consultaNome());
        }
        escolha = keyboard.next();

        switch (escolha) {
            case "pera":
                compra.comprar(pessoa, produtos.get(0));
                System.out.println(compra.verificarCompra());
                break;
            case "calculadora":
                compra.comprar(pessoa, produtos.get(1));
                System.out.println(compra.verificarCompra());
                break;
            default:
                System.out.println("Digite um nome válido");

        }
    }
}

