package app.Logica;

public class operadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("AND (E): " + (a && b)); // false
        System.out.println("OR (OU): " + (a || b));  // true
        System.out.println("NOT (NÃO): " + (!a));     // false

        // ==, !=, >, <, >=, <=
        int x = 10;
        int y = 20;
        System.out.println("Igualdade (==): " + (x == y));       // false
        System.out.println("Desigualdade (!=): " + (x != y));
        System.out.println("Maior que (>): " + (x > y));         // false
        System.out.println("Menor que (<): " + (x < y));         //
        System.out.println("Maior ou igual (>=): " + (x >= y));  // false
        System.out.println("Menor ou igual (<=): " + (x <= y));
    }
}
