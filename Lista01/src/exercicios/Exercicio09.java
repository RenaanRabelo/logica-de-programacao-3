//Escreva um algoritmo para ler as dimens�es de um quadrado (lado), calcular e escrever a �rea do quadrado. Dica a=ll� 

package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		
		float lado, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado:");
		lado = sc.nextFloat();
		area = (float)Math.pow(lado, 2);
		
		System.out.println(area);
		sc.close();
	}
}
