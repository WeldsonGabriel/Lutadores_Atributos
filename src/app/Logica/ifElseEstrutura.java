package app.Logica;

public class ifElseEstrutura {
    public static void main(String[] args) {
        int numero = 15;

        if (numero > 0) {
            System.out.println(numero + " é um número positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é um número negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
