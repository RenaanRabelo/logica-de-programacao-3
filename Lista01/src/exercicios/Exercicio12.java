//Escreva um algoritmo para ler as dimens�es de um c�rculo (raio), calcular e escrever a �rea do c�rculo. a=pi*r� 

package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float raio, quadradoraio;
		
		System.out.println("Digite o valor do raio do c�rculo: ");
		raio = sc.nextFloat();
		
		quadradoraio = (float)Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo �: " + quadradoraio * 3.14);
		
		sc.close();
	}
}
