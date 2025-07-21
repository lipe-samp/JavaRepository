import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double x, y, z;
        double r, s, t;

        Scanner sc = new Scanner(System.in);

        x = 81;
        y = 2;
        z = -20;

        // RAIZ QUADRADA
        //r = Math.sqrt(x); // "a" recebe o valor da raiz quadrada de "x"
        //System.out.println("Raiz quadrada de " + x + " = " + r);

        // ELEVADO
        //s = Math.pow(x, y); // "b" recebe o valor de "x" elevado a "y"
        //System.out.println(x + " elevado à " + y + " = " + s);

        // VALOR ABSOLUTO (sem o negativo caso exista)
        //t = Math.abs(z);
        //System.out.println("Valor absoluto de " + z + " = " + t);

        // ****************************************************
        // ** FÓRMULA DE BHASKARA USANDO OS PRINCÍPIOS ACIMA **
        // ****************************************************

        double a, b, c; // Valores da equação de segundo grau
        double delta;
        double x1, x2; // respostas dos valores x possíveis

        System.out.println("--------------------------------------------");
        System.out.println("| Resolvendo a sua equação de segundo grau |");
        System.out.println("--------------------------------------------");

        System.out.print("Digite o valor de 'a': ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de 'b': ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de 'c': ");
        c = sc.nextDouble();

        System.out.println("Sua equação ficou assim: ");
        System.out.println("a = " + a +"²");
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Valor de delta: " + delta);
        System.out.println("Primeiro valor de x: " + x1);
        System.out.println("Segundo valor de x: " + x2);

        sc.close();
    }
}