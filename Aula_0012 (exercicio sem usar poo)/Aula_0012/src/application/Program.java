package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Resolvendo uma situação sem usar LPOO

        // Ler medidas de dois triângulos e dizer qual dos dois possui maior área
        // Área do triângulo = Raiz Quadrada de (p(p-a)(p-b)(p-c))
        // Onde p = (a+b+c)/2

        double trianguloX1, trianguloX2, trianguloX3; // Triângulo X

        double trianguloY1, trianguloY2, trianguloY3; // Triângulo Y

        double areaTrianguloX, areaTrianguloY, calcularPX, calcularPY;

        System.out.println("Entre com as medidas do primeiro triângulo:");
        System.out.print(" >> ");
        trianguloX1 = sc.nextDouble();
        System.out.print(" >> ");
        trianguloX2 = sc.nextDouble();
        System.out.print(" >> ");
        trianguloX3 = sc.nextDouble();

        System.out.println("Entre com as medidas do segundo triângulo:");
        System.out.print(" >> ");
        trianguloY1 = sc.nextDouble();
        System.out.print(" >> ");
        trianguloY2 = sc.nextDouble();
        System.out.print(" >> ");
        trianguloY3 = sc.nextDouble();

        calcularPX = (trianguloX1 + trianguloX2 + trianguloX3) / 2;
        areaTrianguloX = Math.sqrt(calcularPX * (calcularPX - trianguloX1) * (calcularPX - trianguloX2) * (calcularPX - trianguloX3));

        calcularPY = (trianguloY1 + trianguloY2 + trianguloY3) / 2;
        areaTrianguloY = Math.sqrt(calcularPY * (calcularPY - trianguloY1) * (calcularPY - trianguloY2) * (calcularPY - trianguloY3));

        System.out.printf("Área do primeiro triângulo: %.4f%n", areaTrianguloX);
        System.out.printf("Área do segundo triângulo: %.4f%n", areaTrianguloY);

        if (areaTrianguloX > areaTrianguloY) {
            System.out.println("Primero triângulo tem área maior!");
        } else if (areaTrianguloX == areaTrianguloY) {
            System.out.println("Ambos triângulos tem a mesma área!");
        } else if (areaTrianguloX < areaTrianguloY) {
            System.out.println("Segundo triângulo tem área maior!");
        } else {
            System.out.println("Valor inválido!");
        }

        sc.close();
    }
}
