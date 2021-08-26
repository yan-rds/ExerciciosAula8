package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando o console
        System.out.println("Olá! Hoje te falaremos o maior entre dois números");
        System.out.println("Por favor, insira abaixo o primeiro número");
        double primeiroNumero = leitor.nextDouble();
        System.out.println("Obrigado! Já pode inserir o próximo");
        double segundoNumero = leitor.nextDouble();

        // Criando as condicionais
        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número (" + primeiroNumero + ") é o maior!");
        }
        else if (segundoNumero > primeiroNumero) {
            System.out.println("O segundo número (" + segundoNumero + ") é o maior!");
        }
        else if (primeiroNumero == segundoNumero) {
            System.out.println("Os números " + primeiroNumero + " e " + segundoNumero + " são iguais.");
        }
        else {
            System.out.println("Você inseriu algum caracter inválido. Por favor tente novamente usando apenas números");
        }
    }
}
