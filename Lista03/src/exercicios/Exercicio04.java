/*Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em d�lar. O programa deve solicitar o
 *  valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�vel com o usu�rio, para que seja apresentado o valor em moeda brasileira.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float cotacao, dolares, reais;
		
		System.out.println("Digite a cota��o atual do d�lar: ");
		cotacao = sc.nextFloat();
		
		System.out.println("Digite a quantidade de d�lares que voc� tem: ");
		dolares = sc.nextFloat();
		
		reais = dolares * cotacao;
		
		System.out.printf("Voc� tem R$%.2f", reais);
		sc.close();
	}

}
