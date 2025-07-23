import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Estrutura de repetição while (enquanto)

        // while (condição) {
        //  comandos se condição for true
        // }

        Scanner sc = new Scanner(System.in);

        // int x;
        // int soma = 0;

        // System.out.print("Valor inicial da somatória: ");
        // x = sc.nextInt();

        // while (x != 0) {
            // soma = soma + x;
            // System.out.print("Próximo valor da somatória ou 0 para sair: ");
            // x = sc.nextInt();
        // }

        // System.out.println("Valor total das somas: " + soma);

        String senhaSalva;
        String senhaTentativa;
        int tentativasRestantes;

        System.out.print("Registre sua senha: ");
        senhaSalva = sc.nextLine();
        System.out.println("Senha registrada!");

        System.out.print("Digite o número tentativas que você permite para validar a senha: ");
        tentativasRestantes = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua senha para consulta: ");
        senhaTentativa = sc.nextLine();

        // Pensei em usar (senhaTentativa != senhaSalva) mas é uma expressão em Python.
        // Para comparar String em java, é necessário usar:
        // string1.equals(string2) para ver se são iguais
        // !string1.equals(string2) para ver se são diferentes

        while (!senhaTentativa.equals(senhaSalva) && tentativasRestantes > 1){
            tentativasRestantes = tentativasRestantes - 1;
            System.out.print("Senha incorreta. Você tem mais (" + tentativasRestantes + ") tentativas: ");
            senhaTentativa = sc.nextLine();
        }

        if (senhaTentativa.equals(senhaSalva)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta. Acesso bloqueado!");
        }

        sc.close();
    }
}