import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Operadores Bitwise >> Similar a circuitos lógicos
        // Operador & = E (bit a bit)
        // Operador | = OU (bit a bit)
        // Operador ^ = OU EXCLUSIVO (bit a bit) XOR >> Apenas uma condição precisa ser verdadeira para a condição ser verdadeira

        // Tabela Verdade:
        //
        //     C1   C2  C1 E C2         C1   C2  C1 OU C2       C1   C2  C1 XOR C2
        //     F    F      F            F    F      F           F    F       F
        //     F    V      F            F    V      V           F    V       V
        //     V    F      F            V    F      V           V    F       V
        //     V    V      V            V    V      V           V    V       F

        // Exemplo prático

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor 1:\n >> ");
        int valor1 = sc.nextInt();
        String binario1 = Integer.toBinaryString(valor1); // Convertendo o número inteiro para binário

        System.out.print("Digite o valor 2:\n >> ");
        int valor2 = sc.nextInt();
        String binario2 = Integer.toBinaryString(valor2); // Convertendo o número inteiro para binário

        System.out.println("Valor " + valor1 + " em binário é " + binario1);
        System.out.println("Valor " + valor2 + " em binário é " + binario2 + "\n");

        System.out.print("Operador & (E) - Comparando os dois valores binários bit a bit:\n >> ");
        String binarioE = Integer.toBinaryString(valor1 & valor2);
        System.out.println(binario1 + " & " + binario2 + " = " + binarioE + " Em decimal > " + (valor1 & valor2) + "\n");


        System.out.print("Operador | (OU) - Comparando os dois valores binários bit a bit:\n >> ");
        String binarioOU = Integer.toBinaryString(valor1 | valor2);
        System.out.println(binario1 + " | " + binario2 + " = " + binarioOU + " Em decimal > " + (valor1 | valor2) + "\n");


        System.out.print("Operador & (XOR) - Comparando os dois valores binários bit a bit:\n >> ");
        String binarioXOR = Integer.toBinaryString(valor1 ^ valor2);
        System.out.println(binario1 + " ^ " + binario2 + " = " + binarioXOR + " Em decimal > " + (valor1 ^ valor2));

        sc.close();
    }
}