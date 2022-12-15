//Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor. 

package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		int sucessor = numero + 1;
		System.out.println("O sucessor do número " + numero + " é " + sucessor);
		sc.close();
	}
}
