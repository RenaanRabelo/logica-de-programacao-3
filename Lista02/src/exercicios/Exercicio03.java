//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.  

package exercicios;

import java.util.Scanner;

public class Exercicio03{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario, reajuste, novoSalario;
		
		System.out.println("Informe o salário atual do funcionário: ");
		salario = sc.nextFloat();
		
		System.out.println("Informe o reajuste desse salário: ");
		reajuste = sc.nextFloat();
		
		novoSalario = salario + (salario * reajuste / 100);
		
		System.out.printf("Considerando o reajuste, o novo salário será de: R$%.2f", novoSalario);
		sc.close();
	}
}
