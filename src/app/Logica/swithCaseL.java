package app.Logica;

import java.util.Scanner;

public class swithCaseL {
    public static void main(String[] args) {
        // scanner para ler o dia da semana
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do dia da semana (1-7): ");
        int dia = scanner.nextInt(); scanner = new Scanner(System.in);

        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia da semana é: " + nomeDia);
    }
}
