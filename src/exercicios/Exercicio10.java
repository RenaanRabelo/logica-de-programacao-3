//Escreva um algoritmo para ler as dimens�es de um losango (diagonal maior, diagonal menor), calcular e escrever a �rea do losango. Dica a=D.d/2 

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
		
		System.out.println("A �rea do losango �: " + area);
		sc.close();
	}
}
