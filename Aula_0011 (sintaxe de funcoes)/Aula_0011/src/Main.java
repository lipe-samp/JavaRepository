import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // O que são Funções?
        // Representam um processamento que possui um significado
        // Exemplos:
        // Math.sqrt(double) é uma função que calcula a raiz quadrada de um valor;
        // System.out.println("string") é uma função que mostra o valor no terminal;

        // Vantagens de Funções:
        // Modularização = Dividir o programa em vários módulos
        // Delegação = Delega a lógica de calcular ou executar alguma coisa para outro lugar
        // Reaproveitamento = Reaproveitar a função várias vezes

        // Dados de entrada e saída:
        // Funções podem receber dados de entradas (parâmetros ou argumentos)
        // Funções podem ou não retornar uma saída

        // Em LPOO, as Funções em classes recebem o nome de "métodos"

        // Problema exemplo:

        // Fazer um programa para ler números inteiros e mostrar o maior deles

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com três números inteiros: ");
        System.out.print(" >> ");
        int valor1 = sc.nextInt();
        System.out.print(" >> ");
        int valor2 = sc.nextInt();
        System.out.print(" >> ");
        int valor3 = sc.nextInt();

        int higher = funcaoDescobrindoValorMaior(valor1, valor2, valor3);
        // Chamei a função pelo nome, as variáveis genéricas foram substituídas pelas variáveis que coloquei como parâmetro nos parênteses

        funcaoImprimirValorMaior(higher);
        // Chamei a função pelo nome, objetivo dela é somente imprimir, não retornou nada

        int lower = funcaoDescobrindoValorMenor(valor1, valor2, valor3);
        funcaoImprimirValorMenor(lower);

        sc.close();
    }

    // CRIANDO FUNÇÃO int
    // Ela retorna o valor máximo de acordo com lógica
    public static int funcaoDescobrindoValorMaior(int inteiro1, int inteiro2, int inteiro3){

        int valorMaior; // Vai armazenar o valor com base na lógica com as variáveis genéricas que só funcionam nessa função

        if (inteiro1 > inteiro2 && inteiro1 > inteiro3){
            valorMaior = inteiro1;
        } else if (inteiro2 > inteiro3) {
            valorMaior = inteiro2;
        } else {
            valorMaior = inteiro3;
        }

        return valorMaior;
        // Isso que diferencia uma função ser void, essa não é void, pois tem um retorno final
    }

    // CRIANDO FUNÇÃO int
    // Ela retorna o valor mínimo de acordo com lógica
    public static int funcaoDescobrindoValorMenor(int inteiro1, int inteiro2, int inteiro3){

        int valorMenor; // Vai armazenar o valor com base na lógica com as variáveis genéricas que só funcionam nessa função

        if (inteiro1 < inteiro2 && inteiro1 < inteiro3){
            valorMenor = inteiro1;
        } else if (inteiro2 < inteiro3) {
            valorMenor = inteiro2;
        } else {
            valorMenor = inteiro3;
        }

        return valorMenor;
        // Isso que diferencia uma função ser void, essa não é void, pois tem um retorno final
    }

    // CRIANDO FUNÇÃO void - é void, pois não retorna nada, apenas imprime
    // Ela só imprime (atalho para usar o System.out.println())
    public static void funcaoImprimirValorMaior(int valorMaior){
        System.out.println("Valor maior é: " + valorMaior);
    }

    // CRIANDO FUNÇÃO void - é void, pois não retorna nada, apenas imprime
    // Ela só imprime (atalho para usar o System.out.println())
    public static void funcaoImprimirValorMenor(int valorMenor){
        System.out.println("Valor menor é: " + valorMenor);
    }

}