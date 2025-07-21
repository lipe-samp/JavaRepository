import java.util.Locale; // Manter os números quebrados com ponto (USA) ao invés de vírgula (BR)

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double renda = 12.4354;
        String nome = "Felipe";
        String sobrenome = "Sampaio";
        int idade = 24;



        System.out.println("Hello and welcome!");
        System.out.println(renda);
        System.out.printf("%.2f%n", renda);
        System.out.println("Meu nome é " + nome + ", sobrenome " + sobrenome + ", renda " + renda + ", idade " + idade + ".");
        System.out.printf("Meu nome é %s, sobrenome %s, renda %.2f, idade %d.%n", nome, sobrenome, renda, idade);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}