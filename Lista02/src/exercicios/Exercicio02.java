/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever
 * o percentual que cada um representa em relação ao total de eleitores.*/
 

package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		float eleitores, votosbrancos, votosnulos, votosvalidos;
		
		System.out.println("Informe o número de eleitores: ");
		eleitores = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos: ");
		votosbrancos = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos nulos: ");
		votosnulos = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos válidos: ");
		votosvalidos = sc.nextInt();
		
		float percentualBrancos = votosbrancos / eleitores * 100;
		float percentualNulos = votosnulos / eleitores * 100;
		float percentualValidos = votosvalidos / eleitores * 100;
		
		System.out.printf("O percentual dos votos brancos é igual a: %.1f \n", percentualBrancos);
		System.out.printf("O percentual dos votos nulos é igual a: %.1f \n", percentualNulos);
		System.out.printf("O percentual dos votos validos é igual a: %.1f", percentualValidos);
		sc.close();
	}
}
