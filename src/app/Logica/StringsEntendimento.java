package app.Logica;

public class StringsEntendimento {
    public static void main(String[] args) {
        String saudacao = "Olá, Mundo!";
        String nome = "João";
        String mensagem = saudacao + " Meu nome é " + nome + ".";
        System.out.println(mensagem);

        // Métodos comuns de String
        int tamanho = mensagem.length();
        String maiusculo = mensagem.toUpperCase();
        String minusculo = mensagem.toLowerCase();
        String subString = mensagem.substring(0, 10);

        System.out.println("Tamanho da mensagem: " + tamanho);
        System.out.println("Mensagem em maiúsculas: " + maiusculo);
        System.out.println("Mensagem em minúsculas: " + minusculo);
        System.out.println("Substring da mensagem: " + subString);
    }
}
