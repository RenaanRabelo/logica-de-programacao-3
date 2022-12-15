//Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.

package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int volume, comprimento, altura, largura;
		
		System.out.println("Informe o comprimento de uma determinada caixa retangular: ");
		comprimento = sc.nextInt();
		
		System.out.println("Informe a largura dessa caixa: ");
		largura = sc.nextInt();
		
		System.out.println("Informe a altura dessa caixa: ");
		altura = sc.nextInt();
		
		volume = comprimento * largura * altura;
		
		System.out.println("O volume dessa caixa é: " + volume);
		sc.close();
	}
}
