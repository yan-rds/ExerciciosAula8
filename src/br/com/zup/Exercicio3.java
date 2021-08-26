package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando o console
        System.out.println("Olá! Calcularei sua média e te direi se você passou, ok?");
        System.out.println("Pra começarmos, insira abaixo sua primeira nota");
        double primeiraNota = leitor.nextDouble();
        System.out.println("Ok, computei. Insira agora a segunda nota");
        double segundaNota = leitor.nextDouble();

        //Calculando a média
        double media = (primeiraNota + segundaNota) / 2;

        //Condicionais
        if (media >= 0 & media < 7) {
            System.out.println("Sua média foi de " + media + ", e não é o suficiente pra ser aprovado");
            System.out.println("Reprovado.");
        }
        else if (media >= 7 & media <10){
            System.out.println("Sua média foi de " + media + ", e ela é o suficiente pra ser aprovado");
            System.out.println("Aprovado.");
        }
        else if (media == 10) {
            System.out.println("Sua média foi de " + media + ", é a nota máxima!");
            System.out.println("Aprovado com distinção. Parabéns!");
        }
        else {
            System.out.println("Você informou valores inválidos");
            System.out.println("Por favor, cheque as notas inseridas e tente novamente");
        }
    }
}
