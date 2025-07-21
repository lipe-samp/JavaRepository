import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String recebendoTexto, nome, sobrenome, apelido;
        int recebendoNumero;
        double recebendoNumeroQuebrado;
        char recebendoUmaLetra;

        System.out.print("Digite o que desejar: ");
        recebendoTexto = sc.nextLine();
        System.out.println("Você digitou: " + recebendoTexto);

        System.out.print("Digite o número inteiro que desejar: ");
        recebendoNumero = sc.nextInt();
        System.out.println("Você digitou: " + recebendoNumero);

        System.out.print("Digite o número decimal que desejar: ");
        recebendoNumeroQuebrado = sc.nextDouble();
        System.out.println("Você digitou: " + recebendoNumeroQuebrado);

        System.out.print("Digite a letra que desejar: ");
        recebendoUmaLetra = sc.next().charAt(0); // charAt(0) é para pegar o 1º caractere da string digitada.
        System.out.println("Você digitou: " + recebendoUmaLetra);

        // sc.next(); > só lê uma palavra, se der espaço entre palavras dá erro
        // sc.NextLine(); > lê a linha completa, pode dar espaço entre as palavras

        // Usando next.line() podemos fazer o input de dados até a quebra de linha, sem separar por espaços.

        System.out.println("Digite nome, sobrenome e apelido. Ao terminar cada parte, aperte enter: ");
        sc.nextLine(); // limpando as pendências do next anterior, ela armazenou um "espaço vazio" que ocuparia a prox.

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.print("Apelido: ");
        apelido = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Apelido: " + apelido);

        sc.close();
        }
    }
