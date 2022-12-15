//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h 

package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
		
		float base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retângulo: ");
		base = sc.nextFloat();
		System.out.println("Digite a altura do retângulo: ");
		altura = sc.nextFloat();
		area = base * altura;
		
		System.out.println("A área do retângulo é: " + area);
		sc.close();
	}
}