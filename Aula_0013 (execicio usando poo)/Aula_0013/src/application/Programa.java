package application;

import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y; // >> Criei variáveis do tipo Triangulo (do tipo da classe Triângulo)

        x = new Triangulo(); // Instanciando
        y = new Triangulo(); // Instanciando

        System.out.println("Áreas do primeiro triângulo:");
        System.out.print(" >> ");
        x.areaA = sc.nextDouble(); // x foi instanciado // areaA veio da classe Triângulo
        System.out.print(" >> ");
        x.areaB = sc.nextDouble();
        System.out.print(" >> ");
        x.areaC = sc.nextDouble();

        System.out.println("Áreas do segundo triângulo:");
        System.out.print(" >> ");
        y.areaA = sc.nextDouble();
        System.out.print(" >> ");
        y.areaB = sc.nextDouble();
        System.out.print(" >> ");
        y.areaC = sc.nextDouble();

        double p = (x.areaA + x.areaB + x.areaC) / 2; // Fórmula para calcular área do triângulo
        double areaTrianguloX = Math.sqrt(p * (p - x.areaA) * (p - x.areaB) * (p - x.areaC)); // Fórmula pt.2

        p = (y.areaA + y.areaB + y.areaC) / 2; // Reutilizando a mesma variável para consumir menos memória
        double areaTrianguloY = Math.sqrt(p * (p - y.areaA) * (p - y.areaB) * (p - y.areaC)); // Usando para o Y


        System.out.printf("Área primeiro triângulo: %.4f%n", areaTrianguloX);
        System.out.printf("Área segundo triângulo: %.4f%n", areaTrianguloY);

        if (areaTrianguloX > areaTrianguloY) {
            System.out.println("Primeiro triângulo área maior!");
        } else if (areaTrianguloX < areaTrianguloY) {
            System.out.println("Segundo triângulo área maior!");
        } else if (areaTrianguloX == areaTrianguloY) {
            System.out.println("Triângulos de mesma área!");
        } else {
            System.out.println("Inválido!");
        }

        sc.close();
    }
}
