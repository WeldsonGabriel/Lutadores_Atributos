package app;

import model.Lutador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lutador lutador1 = new Lutador();
        Lutador lutador2 = new Lutador();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== 🥋 BATALHA DE LUTADORES =====");
            System.out.println("1️⃣ - Mostrar Lutadores");
            System.out.println("2️⃣ - Iniciar Luta");
            System.out.println("3️⃣ - Gerar Novos Lutadores");
            System.out.println("4️⃣ - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    lutador1.exibirAtributos();
                    lutador2.exibirAtributos();
                    break;

                case 2:
                    System.out.println("\n⚔️  LUTA COMEÇANDO!");
                    int poder1 = lutador1.getPoderTotal();
                    int poder2 = lutador2.getPoderTotal();

                    System.out.printf("%s: %d pontos%n", lutador1.getNome(), poder1);
                    System.out.printf("%s: %d pontos%n", lutador2.getNome(), poder2);

                    if (poder1 > poder2) {
                        System.out.println("🏆 " + lutador1.getNome() + " venceu!");
                    } else if (poder2 > poder1) {
                        System.out.println("🏆 " + lutador2.getNome() + " venceu!");
                    } else {
                        System.out.println("🤝 Empate!");
                    }
                    break;

                case 3:
                    lutador1 = new Lutador();
                    lutador2 = new Lutador();
                    System.out.println("🔄 Novos lutadores gerados!");
                    break;

                case 4:
                    continuar = false;
                    System.out.println("👋 Encerrando o jogo...");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
