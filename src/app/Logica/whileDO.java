package app.Logica;

public class whileDO {
    public static void main(String[] args) {
        // Exemplo de uso do while
        int contadorWhile = 1;
        while (contadorWhile <= 5) {
            System.out.println("While Contador: " + contadorWhile);
            contadorWhile++;
        }

        // Exemplo de uso do do-while
        int contadorDoWhile = 1;
        do {
            System.out.println("Do-While Contador: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 5);
    }
}
