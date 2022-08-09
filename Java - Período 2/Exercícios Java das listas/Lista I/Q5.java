/* 1. Faça um programa que calcule e mostre a área de um círculo. Nota: sabe-se que a área é A = π*r */

import java.util.Scanner;
 
/**
 * App
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* declarando variáveis para calcular a área de um circulo */
        double a = 0, pi = 3.14, raio = 0;
 
        System.out.print("Digite o valor do raio = ");
        raio = in.nextDouble();
        a = pi*(raio*raio);
 
        System.out.println("A área do cículo é: " + a);
 
    }
 
   
}
