import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Operadores Comparativos");
        System.out.println("| > Maior |\n| < Menor |\n| >= Maior ou Igual |\n| <= Menor ou igual |\n| == Igual |\n| != Diferente |\n");

        System.out.println("Expressões Lógicas");
        System.out.println("| && E |\n| || OU |\n| ! NÃO |\n");

        System.out.println("Estrutura Condicional IF ELSE");
        int hora;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o horário (desconsidere minutos) para saber se é Manhã, Tarde, Noite ou Madrugada: ");
        hora = sc.nextInt();

        if (hora >= 5 && hora < 12 ){
            System.out.println("Bom dia!\n");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!\n");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite\n!");
        } else if (hora >= 0 && hora < 5) {
            System.out.println("Boa madrugada!\n");
        } else {
            System.out.println("Digite entre 0 e 23!\n");
        }

        int minutos;
        int valorPlano = 50;

        System.out.println("Plano Telefone: Até 100 minutos valor fixo de R$ 50,00. Cada minuto ultrapassado custará R$ 2,00.");
        System.out.print("Digite os minutos que utilizou no seu plano: ");
        minutos = sc.nextInt();

        if (minutos > 0 && minutos <= 100){
            System.out.println("Não ultrapassou 100 minutos");
            System.out.println("Valor fixo a ser pago: R$ " + valorPlano + ",00\n");
        } else if (minutos > 100) {
            System.out.println("Ultrapassou 100 minutos");
            valorPlano = ((minutos - 100) * 2) + valorPlano ;
            System.out.println("Valor a ser pago com acréscimo: R$ " + valorPlano + ",00\n");
        } else {
            System.out.println("Valor inferior a zero");
        }

        System.out.println("Estrutura Condicional SWITCH CASE");
        int numDiaSemana;
        String diaSemana;

        System.out.print("Digite o número para saber o dia da semana: ");
        numDiaSemana = sc.nextInt();

        switch (numDiaSemana) {
            case 1:
                diaSemana = "Domingo\n";
                break;
            case 2:
                diaSemana = "Segunda-feira\n";
                break;
            case 3:
                diaSemana = "Terça-feira\n";
                break;
            case 4:
                diaSemana = "Quarta-feira\n";
                break;
            case 5:
                diaSemana = "Quinta-feira\n";
                break;
            case 6:
                diaSemana = "Sexta-feira\n";
                break;
            case 7:
                diaSemana = "Sábado\n";
            default:
                diaSemana = "Valor inválido\n";
                break;
        }

        System.out.println(diaSemana);

        sc.close();
    }
}
