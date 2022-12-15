// Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula PRESTACAO=VALOR+((VALOR*TAXA/100) *TEMPO).

package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float prestacao, taxa, valor;
		int tempo;
		
		System.out.println("Informe o valor da presta��o: ");
		valor = sc.nextFloat();
		
		System.out.println("Informe o valor do juros: ");
		taxa = sc.nextFloat();
		
		System.out.println("Informe o tempo em atraso: ");
		tempo = sc.nextInt();
		
		prestacao = valor + (valor * taxa / 100) * tempo;
		
		System.out.printf("O valor da presta��o ser�: R$ %.2f", prestacao);
		sc.close();
	}
}
