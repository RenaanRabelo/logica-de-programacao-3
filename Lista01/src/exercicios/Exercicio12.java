//Escreva um algoritmo para ler as dimensões de um círculo (raio), calcular e escrever a área do círculo. a=pi*r² 

package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float raio, quadradoraio;
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio = sc.nextFloat();
		
		quadradoraio = (float)Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + quadradoraio * 3.14);
		
		sc.close();
	}
}
