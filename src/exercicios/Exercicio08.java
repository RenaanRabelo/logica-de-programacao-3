//Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2 

package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main (String[]args) {
		
		float base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo");
		base = sc.nextFloat();
		System.out.println("Digite a altura do triângulo");
		altura = sc.nextFloat();
		area = base * altura / 2;
		
		System.out.println("A área do triângulo é " + area);
		sc.close();
	}
}
