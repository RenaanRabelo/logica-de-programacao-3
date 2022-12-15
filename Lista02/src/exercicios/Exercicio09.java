// Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+((VALOR*TAXA/100) *TEMPO).

package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float prestacao, taxa, valor;
		int tempo;
		
		System.out.println("Informe o valor da prestação: ");
		valor = sc.nextFloat();
		
		System.out.println("Informe o valor do juros: ");
		taxa = sc.nextFloat();
		
		System.out.println("Informe o tempo em atraso: ");
		tempo = sc.nextInt();
		
		prestacao = valor + (valor * taxa / 100) * tempo;
		
		System.out.printf("O valor da prestação será: R$ %.2f", prestacao);
		sc.close();
	}
}
