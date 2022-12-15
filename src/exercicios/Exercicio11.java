//Escreva um algoritmo para ler as dimensões de um trapézio (base maior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2  

package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float Bmaior, Bmenor, altura, area;
		
		System.out.println("Digite a base maior do trapézio: ");
		Bmaior = sc.nextFloat();
		
		System.out.println("Digite a base menor do trapézio: ");
		Bmenor = sc.nextFloat();
		
		System.out.println("Digite a altura do trapézio: ");
		altura = sc.nextFloat();
		
		area = (Bmaior + Bmenor) * altura / 2;
		
		System.out.println("A área do trapézio é igual a: " + area);
		sc.close();
	}
}
