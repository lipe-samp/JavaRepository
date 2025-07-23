import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Estrutura repetitiva "for"

        // Usamos quando sabemos previamente a quantidade de repetições que será executada.

        // Primero observando a sintaxe:

        // for ( início ; condição ; incremento ) {
        //      comando1
        //      comando2
        // }

        // início = executa somente na primeira vez (uma variável temporária, só para atender o for >> i
        // condição = se for true executa novamente e retorna, se for false para com a condição
        // incremento = altera o "início" >> i++

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite quantos números deseja somar: ");
        int repeticoes = sc.nextInt();
        System.out.println("Ok! Você poderá somar " + repeticoes + " números.");

        for (int i = 0; i < repeticoes; i++){
            System.out.print("Número a ser somado: ");
            int x = sc.nextInt(); // variável temporária que deixa de existir fora do "for"
            soma += x;
        }

        System.out.println("Você digitou todos os números a serem somados, resultado: " + soma);

        // Usando decremento (subtrair)

        System.out.println("Contagem regressiva usando 'for':");
        for (int i = 5; i >= 0 ; i--){
            System.out.println("Valor de i: " + i);
        }

        sc.close();
    }
}