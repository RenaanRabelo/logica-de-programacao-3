//Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final o quadrado da soma dos tr�s valores lidos.

package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, quadrado, soma;
		
		System.out.println("Digite um valor: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		B = sc.nextInt();
		
		System.out.println("Digite mais um valor: ");
		C = sc.nextInt();
		
		soma = A + B + C;
		quadrado = (int)Math.pow(soma, 2);
		
		System.out.println("O quadrado da soma dos 3 valores lidos �: " + quadrado);
		sc.close();
	}
}
