/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
(aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para
ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. */


package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float custocarro, distribuidor, imposto, custofinal;
		
		System.out.println("Digite o custo de fábrica de um carro");
		custocarro = sc.nextFloat();
		
		distribuidor = custocarro * 28 / 100;
		imposto = custocarro * 45 / 100;
		custofinal = custocarro + imposto + distribuidor;
		
		System.out.printf("O custo final do carro para o consumidor é: R$%.2f", custofinal);
		sc.close();
	}
}
