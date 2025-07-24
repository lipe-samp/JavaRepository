import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Estrutura de repetição do-while
        // Ela se repete pelo menos uma vez, pois só verifica a condição após primeira execução

        // Exemplo:

        // do {
        //    comando1
        //    comando2
        // while (condição) -- Se a condição for falsa a repetição acaba

        // Vamos testar com um loop onde o usuário deseja sair alterando a condição através da estrutura do-while

        Scanner sc = new Scanner(System.in);

        double valorCelsius, valorFahrenheit, escolhaConversao;
        String converterNovamente, recomecarPrograma;

        // Fórmula de Cº para Fº >> Fº = (Cº * 9 / 5) + 32 <<
        // Fórmula de Fº para Cº >> Cº = (Fº - 32) * 5 / 9 <<

        do {
            System.out.print("[1] Para converter de Celsius para Fahrenheit\n[2] Para converter de Fahrenheit para Celsius\n >> ");
            escolhaConversao = sc.nextDouble();

            if (escolhaConversao == 1.0) {

                do {
                    System.out.print("Digite o valor em Celsius:\n >> ");
                    valorCelsius = sc.nextDouble();
                    valorFahrenheit = (valorCelsius * 9 / 5) + 32;
                    System.out.printf("%.2fºC é igual a %.2fºF\n", valorCelsius, valorFahrenheit); // Usando printf para formatar duas casas decimais
                    sc.nextLine(); // Apenas para limpar possíveis caracteres indesejados que sejam preenchidos no próximo sc.nextLine
                    System.out.print("Deseja converter novamente em Celsius? s/n\n >> ");
                    converterNovamente = sc.nextLine();
                } while (converterNovamente.equals("s"));

            } else if (escolhaConversao == 2.0) {

                do {
                    System.out.print("Digite o valor em Fahrenheit:\n >> ");
                    valorFahrenheit = sc.nextDouble();

                    valorCelsius = (valorFahrenheit - 32 ) * 5 / 9;
                    System.out.printf("%.2fºF é igual a %.2fºC\n", valorFahrenheit, valorCelsius); // Usando printf para formatar duas casas decimais
                    sc.nextLine(); // Apenas para limpar possíveis caracteres indesejados que sejam preenchidos no próximo sc.nextLine
                    System.out.print("Deseja converter novamente em Fahrenheit? s/n\n >> ");
                    converterNovamente = sc.nextLine();

                } while (converterNovamente.equals("s"));

            } else {
                sc.nextLine(); // Apenas para limpar possíveis caracteres indesejados que sejam preenchidos no próximo sc.nextLine
                System.out.println("Escolha não identificada! Escolha entre [1] e [2]");
            }

            System.out.print("Deseja recomeçar? s/n\n >> ");
            recomecarPrograma = sc.nextLine();

        } while (recomecarPrograma.equals("s"));

        System.out.println("Fim da execução");

        sc.close();
    }
}