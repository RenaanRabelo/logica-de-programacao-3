//Elaborar um programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final � soma dos quadrados dos tr�s valores lidos.

package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, quadradoA, quadradoB, quadradoC, soma;
		
		System.out.println("Digite um valor: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		B = sc.nextInt();
		
		System.out.println("Digite mais um valor: ");
		C = sc.nextInt();
		
		quadradoA = (int)Math.pow(A, 2);
		quadradoB = (int)Math.pow(B, 2);
		quadradoC = (int)Math.pow(C, 2);
		
		soma = quadradoA + quadradoB + quadradoC;
		
		System.out.println("A soma dos quadrados dos 3 valores digitados �: " + soma);
		sc.close();
	}
}
