//Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2 

package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float Dmaior, Dmenor, area;
		
		System.out.println("Digite o valor da diagonal maior do losango: ");
		Dmaior = sc.nextFloat();
		
		System.out.println("Digite o valor da diagonal menor: ");
		Dmenor = sc.nextFloat();
		
		area = Dmaior * Dmenor / 2;
		
		System.out.println("A área do losango é: " + area);
		sc.close();
	}
}
