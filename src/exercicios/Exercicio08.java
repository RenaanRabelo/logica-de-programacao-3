//Escreva um algoritmo para ler as dimens�es de um tri�ngulo (base e altura), calcular e escrever a �rea do tri�ngulo. Dica a=b.h/2 

package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main (String[]args) {
		
		float base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo");
		base = sc.nextFloat();
		System.out.println("Digite a altura do tri�ngulo");
		altura = sc.nextFloat();
		area = base * altura / 2;
		
		System.out.println("A �rea do tri�ngulo � " + area);
		sc.close();
	}
}
