/*Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos. Calcular e escrever
 * o percentual que cada um representa em rela��o ao total de eleitores.*/
 

package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		float eleitores, votosbrancos, votosnulos, votosvalidos;
		
		System.out.println("Informe o n�mero de eleitores: ");
		eleitores = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos: ");
		votosbrancos = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos nulos: ");
		votosnulos = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos v�lidos: ");
		votosvalidos = sc.nextInt();
		
		float percentualBrancos = votosbrancos / eleitores * 100;
		float percentualNulos = votosnulos / eleitores * 100;
		float percentualValidos = votosvalidos / eleitores * 100;
		
		System.out.printf("O percentual dos votos brancos � igual a: %.1f \n", percentualBrancos);
		System.out.printf("O percentual dos votos nulos � igual a: %.1f \n", percentualNulos);
		System.out.printf("O percentual dos votos validos � igual a: %.1f", percentualValidos);
		sc.close();
	}
}
