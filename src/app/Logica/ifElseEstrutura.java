package app.Logica;

public class ifElseEstrutura {
    public static void main(String[] args) {
         // colocar o scaner para perguntar o numero ao usuario
        //java.util.Scanner scanner = new java.util.Scanner(System.in);
        //System.out.print("Digite um número inteiro: ");
        //int numero = scanner.nextInt();
        //scanner.close();
//
        //if (numero > 0) {
        //    System.out.println(numero + " é um número positivo.");
        //} else if (numero < 0) {
        //    System.out.println(numero + " é um número negativo.");
        //} else {
        //    System.out.println("O número é zero.");
        //}

        var temDinheiro = true;
        var temCartao = false;

        var mensagem = (temDinheiro || temCartao) ? "Pode comprar o produto" : "Não pode comprar nada";
        System.out.println(mensagem);
        if(temDinheiro && temCartao){
            System.out.println("Pode comprar o produto  e um brinde");
        }else if (temDinheiro || temCartao){
            System.out.println("Pode comprar o produto");
        }else{
            System.out.println("Não pode comprar nada");
        }
    }
}
