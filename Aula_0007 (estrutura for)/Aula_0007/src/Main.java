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

        // Mostrando os números ímpares ou pares dentro de dois valores inputados pelo usuário

        int valor1, valor2, min, max, escolha;
        int somandoImparesPares = 0;

        System.out.println("Vamos visualizar todos os números ímpares ou pares entre dois números que você desejar.");
        System.out.print("Digite [0] para ver os pares\nDigite [1] para ver os ímpares\n >> ");
        escolha = sc.nextInt();

        if (escolha == 0){
            System.out.println("Você escolheu visualizar os números pares.");
            System.out.print("Digite o primeiro número: ");
            valor1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            valor2 = sc.nextInt();

            if (valor1 < valor2) {
                min = valor1;
                max = valor2;
            } else {
                min = valor2;
                max = valor1;
            }

            System.out.println("Números pares de ["+min+"] até ["+max+"]");

            for (int i = min; i <= max; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    somandoImparesPares += i;
                }
            }

            System.out.println("A soma dos números pares de ["+min+"] até ["+max+"] é igual a " + somandoImparesPares);

        } else if (escolha == 1) {
            System.out.println("Você escolheu visualizar os números ímpares.");
            System.out.print("Digite o primeiro número: ");
            valor1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            valor2 = sc.nextInt();

            if (valor1 < valor2) {
                min = valor1;
                max = valor2;
            } else {
                min = valor2;
                max = valor1;
            }

            System.out.println("Números ímpares de ["+min+"] até ["+max+"]");

            for (int i = min; i <= max; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    somandoImparesPares += i;
                }
            }

            System.out.println("A soma dos números pares de ["+min+"] até ["+max+"] é igual a " + somandoImparesPares);

        } else {
            System.out.println("Digitem somente [0] ou [1]");
        }

        // Realizando uma tabuada usando for

        System.out.print("Deseja ver a tabuada no número \n >>");
        int valorTabuada = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " x " + valorTabuada + " = " + i * valorTabuada );
        }

        sc.close();
    }
}