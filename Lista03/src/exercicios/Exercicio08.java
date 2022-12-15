/*Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar
 * o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma (variável S) do segundo com o quarto valor. 
 */

package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, P, S;
		
		System.out.println("Digite um valor: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		B = sc.nextInt();
		
		System.out.println("Digite mais um valor: ");
		C = sc.nextInt();
		
		System.out.println("Digite mais um valor: ");
		D = sc.nextInt();
		
		P = A * C;
		
		S = B + D;
		
		System.out.println("Resultado do produto do primeiro valor com o terceiro: " + P + "\n");
		System.out.println("Resultado da soma do segundo valor com o quarto: " + S + "\n");
		sc.close();
	}
}
