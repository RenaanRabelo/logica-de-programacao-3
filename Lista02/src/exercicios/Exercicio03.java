//Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. Calcular e escrever o valor do novo sal�rio.  

package exercicios;

import java.util.Scanner;

public class Exercicio03{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario, reajuste, novoSalario;
		
		System.out.println("Informe o sal�rio atual do funcion�rio: ");
		salario = sc.nextFloat();
		
		System.out.println("Informe o reajuste desse sal�rio: ");
		reajuste = sc.nextFloat();
		
		novoSalario = salario + (salario * reajuste / 100);
		
		System.out.printf("Considerando o reajuste, o novo sal�rio ser� de: R$%.2f", novoSalario);
		sc.close();
	}
}
