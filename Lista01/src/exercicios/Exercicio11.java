//Escreva um algoritmo para ler as dimens�es de um trap�zio (base maior, base menor e altura), calcular e escrever a �rea do trap�zio. a=(B+b).h/2  

package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float Bmaior, Bmenor, altura, area;
		
		System.out.println("Digite a base maior do trap�zio: ");
		Bmaior = sc.nextFloat();
		
		System.out.println("Digite a base menor do trap�zio: ");
		Bmenor = sc.nextFloat();
		
		System.out.println("Digite a altura do trap�zio: ");
		altura = sc.nextFloat();
		
		area = (Bmaior + Bmenor) * altura / 2;
		
		System.out.println("A �rea do trap�zio � igual a: " + area);
		sc.close();
	}
}
