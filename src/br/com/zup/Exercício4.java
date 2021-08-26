package br.com.zup;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Criando o console

        System.out.println("Bem vindo ao sistema que te dirá qual será seu aumento");
        System.out.println("Para começarmos, por favor digite aqui seu salário");
        double salario = leitor.nextDouble();

        if (salario > 0 & salario <= 280) {
            String porcentagem = "20%";
            double novoSalario = salario + (salario * 0.2);
            System.out.println("Seu salário subiu de R$" + salario + " para R$" + novoSalario + ". Foi um aumento de " + porcentagem +". Parabéns pela nova remuneração!");
        }
        else if (salario > 280 & salario <= 700) {
            String porcentagem = "15%";
            double novoSalario = salario + (salario * 0.15);
            System.out.println("Seu salário subiu de R$" + salario + " para R$" + novoSalario + ". Foi um aumento de " + porcentagem +". Parabéns pela nova remuneração!");
        }
        else if (salario > 700 & salario <= 1500) {
            String porcentagem = "10%";
            double novoSalario = salario + (salario * 0.1);
            System.out.println("Seu salário subiu de R$" + salario + " para R$" + novoSalario + ". Foi um aumento de " + porcentagem +". Parabéns pela nova remuneração!");
        }
        else if (salario > 1500) {
            String porcentagem = "5%";
            double novoSalario = salario + (salario * 0.05);
            System.out.println("Seu salário subiu de R$" + salario + " para R$" + novoSalario + ". Foi um aumento de " + porcentagem +". Parabéns pela nova remuneração!");
        }
        else {
            System.out.println("O valor que você inseriu é inválido, por favor corrija-o");
        }

    }
}
