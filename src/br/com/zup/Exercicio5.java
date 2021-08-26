package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando o console
        System.out.println("Olá! Meu trabalho é te dizer um dia da semana referente ao número que você me disser");
        System.out.println("Digite um número de 1 a 7, por favor");
        int numero = leitor.nextInt();
        System.out.println("Recebi seu número!");

        if (numero == 1) {
            System.out.println("O dia da semana referente a esse número é: Domingo!");
        }
        else if (numero == 2) {
            System.out.println("O dia da semana referente a esse número é: Segunda!");
        }
       else if (numero == 3) {
            System.out.println("O dia da semana referente a esse número é: Terça!");
        }
       else if (numero == 4) {
            System.out.println("O dia da semana referente a esse número é: Quarta!");
        }
        else if (numero == 5) {
            System.out.println("O dia da semana referente a esse número é: Quinta!");
        }
        else if (numero == 6) {
            System.out.println("O dia da semana referente a esse número é: Sexta!");
        }
        else if (numero == 7) {
            System.out.println("O dia da semana referente a esse número é: Sábado!");
        }
        else {
            System.out.println("Você não me disse um número de 1 a 7 :(");
            System.out.println("Tente mais uma vez, por favor.");
        }
    }
}
