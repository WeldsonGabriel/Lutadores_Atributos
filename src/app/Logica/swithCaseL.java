package app.Logica;

import java.util.Scanner;

public class swithCaseL {
    public static void main(String[] args) {
        // scanner para ler o dia da semana
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do dia da semana (1-7): ");
        int dia = scanner.nextInt(); scanner = new Scanner(System.in);

        // switch case simplificado usando expressão switch
        // mais simples e limpo

        //String poderAvatar = switch (dia) {
        //    case 1,2 -> "Àgua";
        //    case 3 -> "Fogo";
        //    case 4 -> "Ar";
        //    case 5,6 -> "Terra";
        //    case 7 -> "Espírito";
        //    default -> "Poder desconhecido";
        //};

        var listaPersonagens = new java.util.HashMap<Integer, String>();
        listaPersonagens.put(1, "Aang");
        listaPersonagens.put(2, "Katara");
        listaPersonagens.put(3, "Zuko");
        listaPersonagens.put(4, "Toph");
        listaPersonagens.put(5, "Sokka");
        listaPersonagens.put(6, "Appa");
        listaPersonagens.put(7, "Momo");

        var listaDobras = new java.util.HashMap<String, String>();
        listaDobras.put("Aang", "Ar, Água, Terra, Fogo");
        listaDobras.put("Katara", "Água");
        listaDobras.put("Zuko", "Fogo");
        listaDobras.put("Toph", "Terra");
        listaDobras.put("Sokka", "Nenhuma");
        listaDobras.put("Appa", "Nenhuma");
        listaDobras.put("Momo", "Nenhuma");

        var escolhaPersonagem = listaPersonagens.get(dia);
        var dobraPersonagem = listaDobras.get(escolhaPersonagem);
        System.out.println("O personagem do dia é: " + escolhaPersonagem + " que dobra: " + dobraPersonagem);

        //String nomeDia = switch (dia) {
        //    case 1 -> "Domingo";
        //    case 2 -> "Segunda-feira";
        //    case 3 -> "Terça-feira";
        //    case 4 -> "Quarta-feira";
        //    case 5 -> "Quinta-feira";
        //    case 6 -> "Sexta-feira";
        //    case 7 -> "Sábado";
        //    default -> "Dia inválido";
        //};
        //switch (dia) {
        //    case 1:
        //        nomeDia = "Domingo";
        //        break;
        //    case 2:
        //        nomeDia = "Segunda-feira";
        //        break;
        //    case 3:
        //        nomeDia = "Terça-feira";
        //        break;
        //    case 4:
        //        nomeDia = "Quarta-feira";
        //        break;
        //    case 5:
        //        nomeDia = "Quinta-feira";
        //        break;
        //    case 6:
        //        nomeDia = "Sexta-feira";
        //        break;
        //    case 7:
        //        nomeDia = "Sábado";
        //        break;
        //    default:
        //        nomeDia = "Dia inválido";
        //        break;
        //}

        //System.out.println("O poder do Avatar " + dia + " é: " + poderAvatar);
    }
}
