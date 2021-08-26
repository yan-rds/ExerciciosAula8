package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando o console
        System.out.println("Olá! Esse sistema irá te dizer qual é o produto mais barato dos três que você me informar");
        System.out.println("Vamos começar? Quanto estiver pronto, insira o preço do primeiro produto");
        double primeiroPreco = leitor.nextDouble();
        System.out.println("Recebi! Pode inserir o segundo");
        double segundoPreco = leitor.nextDouble();
        System.out.println("Ok, agora o último");
        double terceiroPreco = leitor.nextDouble();

        // Criando a condicional
        if (primeiroPreco < segundoPreco & primeiroPreco < terceiroPreco) {
            System.out.println("O primeiro produto é o mais barato!");
        }
        else if (segundoPreco < primeiroPreco & segundoPreco < terceiroPreco) {
            System.out.println("O segundo produto é o mais barato!");
        }
        else if (terceiroPreco < primeiroPreco & terceiroPreco < segundoPreco) {
            System.out.println("O terceiro produto é o mais barato!");
        }
        else if (primeiroPreco == segundoPreco & primeiroPreco < terceiroPreco){
            System.out.println("O primeiro e segundo produtos têm o mesmo preço e são os mais baratos!");
        }
        else if (segundoPreco == terceiroPreco & segundoPreco < primeiroPreco) {
            System.out.println("O segundo e o terceiro produto têm o mesmo preço e são os mais baratos!");
        }
        else if (primeiroPreco == terceiroPreco & primeiroPreco < segundoPreco){
            System.out.println("O primeiro e segundo produto têm o mesmo preço e são os mais baratos!");
        }
        else if (primeiroPreco == segundoPreco & segundoPreco == terceiroPreco) {
            System.out.println("Todos os produtos possuem o mesmo preço!");
        }
        else {
            System.out.println("Você inseriu algum valor que eu não consegui identificar D:");
            System.out.println("Poderia tentar de novo?");
        }



    }
}
