/*O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos 
(aplicados ao custo de f�brica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para
ler o custo de f�brica de um carro, calcular e escrever o custo final ao consumidor. */


package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float custocarro, distribuidor, imposto, custofinal;
		
		System.out.println("Digite o custo de f�brica de um carro");
		custocarro = sc.nextFloat();
		
		distribuidor = custocarro * 28 / 100;
		imposto = custocarro * 45 / 100;
		custofinal = custocarro + imposto + distribuidor;
		
		System.out.printf("O custo final do carro para o consumidor �: R$%.2f", custofinal);
		sc.close();
	}
}
