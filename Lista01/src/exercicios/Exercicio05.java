//Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a multiplicação dos valores. 

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[]args) {
			
		int numero1, numero2, resultado;
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um número:");
		numero1 = sc.nextInt();
		System.out.println("Digite outro número:");
		numero2 = sc.nextInt();
		resultado = numero1 * numero2;
			
		System.out.println("A multiplicação de " + numero1 + " X " + numero2 + " é " + resultado);
		sc.close();
	}
}