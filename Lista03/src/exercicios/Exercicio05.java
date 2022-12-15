/*Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real. O programa deve solicitar o
 *  valor da cotação do dólar e também a quantidade de reais disponível com o usuário, para que seja apresentado o valor em moeda americana.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float cotacao, dolares, reais;
		
		System.out.println("Digite a cotação atual do dólar: ");
		cotacao = sc.nextFloat();
		
		System.out.println("Digite a quantidade de reais que você tem: ");
		reais = sc.nextFloat();
		
		dolares = reais / cotacao;
		
		System.out.printf("Você tem: U$%.2f", dolares);
		sc.close();
	}

}
