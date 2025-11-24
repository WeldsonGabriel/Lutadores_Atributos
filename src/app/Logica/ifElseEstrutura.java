package app.Logica;

import java.util.Scanner;

public class ifElseEstrutura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt(); scanner = new Scanner(System.in);

        String categoria = (numero <= 3) ?"medio": "avancado";
        System.out.println("O numero digitado foi: " + numero + " e a categoria é: " + categoria);
        //var nome = "João";
        //var altura = 1.95;
        //var peso = 92.0;
//
        //if (peso <= 60 || altura <= 1.75) {
        //    System.out.println(nome + " esta categoria é: Peso leve");
        //} else if (peso > 60 && peso <= 90 || altura > 1.75 && altura <= 1.90) {
        //    System.out.println(nome + " esta categoria é: Peso médio");
        //} else {
        //    System.out.println(nome + " esta categoria é: Peso pesado");
        //}
//
        //var idade = 20;
        //if (idade < 18) {
        //    System.out.println(nome + " é menor de idade.");
        //} else {
        //    System.out.println(nome + " é maior de idade.");
        //}
        //var salarioGerente = 2500;
        //var salarioLider = 2000;
        //var salarioPeao = 1500;
        //var salarioDono = 3000;
//
        //var maiorSalario = 2000;
//
        //    if (maiorSalario == salarioPeao) {
        //        System.out.println("O funcionário é um Peão.");
        //    } else if (maiorSalario == salarioLider) {
        //        System.out.println("O funcionário é um Líder.");
        //    } else if (maiorSalario == salarioGerente) {
        //        System.out.println("O funcionário é um Gerente.");
        //    } else {
        //        System.out.println("O funcionário é o Dono.");
        //    }
        }
    }

