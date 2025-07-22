import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Estrutura opcional ao if-else quando se deseja incluir um VALOR com base em uma condição

        // Exemplo:
        //   ( if )     ( else if )   ( else )
        // (condição) ? valor true : valor false

        // (2 > 4) ? 50 : 80
        // No caso acima temos a condição (2 é maior que 4) ? Se true = 50 : Se false = 80
        // Ou seja, a resposta será false e valerá 80

        // Demonstração comum de if else

        double preco;
        double desconto;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço para verificar o desconto: ");
        preco = sc.nextDouble();

        if (preco > 80.0){
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);

        // Demonstração da forma condicional ternária (simplificada)

        System.out.print("Digite o preço para verificar o desconto: ");
        preco = sc.nextDouble();

        desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}