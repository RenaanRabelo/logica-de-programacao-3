//Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor. 

package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main (String[]args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		int antecessor = numero -1;
		System.out.println("O antecessor de " + numero + " é " + antecessor);
		sc.close();
	}
}
