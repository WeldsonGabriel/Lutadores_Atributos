package model;

import java.util.Random;

public class Lutador {
    private String nome;
    private int[][] atributos; // [4][2] -> [0][0] força, [1][0] agilidade, etc.
    private static final String[] NOMES = {"Ryu", "Ken", "SubZero", "Scorpion", "Liu Kang", "Zangief"};
    private static final String[] TIPOS = {"Força", "Agilidade", "Resistência", "Inteligência"};

    public Lutador() {
        Random random = new Random();
        this.nome = NOMES[random.nextInt(NOMES.length)];
        this.atributos = new int[TIPOS.length][1];

        for (int i = 0; i < TIPOS.length; i++) {
            this.atributos[i][0] = random.nextInt(51) + 50; // gera entre 50 e 100
        }
    }

    public String getNome() {
        return nome;
    }

    public int[][] getAtributos() {
        return atributos;
    }

    public void exibirAtributos() {
        System.out.println("🧠 Atributos de " + nome + ":");
        for (int i = 0; i < TIPOS.length; i++) {
            System.out.printf("  %s: %d%n", TIPOS[i], atributos[i][0]);
        }
    }

    public int getPoderTotal() {
        int total = 0;
        for (int[] atributo : atributos) {
            total += atributo[0];
        }
        return total;
    }
}
