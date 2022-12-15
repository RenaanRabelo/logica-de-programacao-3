/*Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o
 *  valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float cotacao, dolares, reais;
		
		System.out.println("Digite a cotação atual do dólar: ");
		cotacao = sc.nextFloat();
		
		System.out.println("Digite a quantidade de dólares que você tem: ");
		dolares = sc.nextFloat();
		
		reais = dolares * cotacao;
		
		System.out.printf("Você tem R$%.2f", reais);
		sc.close();
	}

}
