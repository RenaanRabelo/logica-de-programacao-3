/*Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em real. O programa deve solicitar o
 *  valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel com o usu�rio, para que seja apresentado o valor em moeda americana.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float cotacao, dolares, reais;
		
		System.out.println("Digite a cota��o atual do d�lar: ");
		cotacao = sc.nextFloat();
		
		System.out.println("Digite a quantidade de reais que voc� tem: ");
		reais = sc.nextFloat();
		
		dolares = reais / cotacao;
		
		System.out.printf("Voc� tem: U$%.2f", dolares);
		sc.close();
	}

}
