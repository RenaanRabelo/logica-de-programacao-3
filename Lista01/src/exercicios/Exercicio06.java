//Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divis�o dos valores.  

package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
			
		float numero1, numero2, resultado;
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um n�mero:");
		numero1 = sc.nextInt();
		System.out.println("Digite outro n�mero:");
		numero2 = sc.nextInt();
		resultado = numero1 / numero2;
			
		System.out.println("A divis�o de " + numero1 + " / " + numero2 + " � " + resultado);
		sc.close();
	}
}