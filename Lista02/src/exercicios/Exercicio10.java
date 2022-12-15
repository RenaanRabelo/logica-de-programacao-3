/*Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe
 *  a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados. 
 */

package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, suporte;
		
		System.out.println("Digite um valor da valor para a variavel A: ");
		A = sc.nextInt();
		
		System.out.println("Digite um valor da valor para a variavel B: ");
		B = sc.nextInt();
		
		suporte = A;
		A = B;
		B = suporte;
		
		System.out.println("Novo valor da variavel A: " + A + "\n");
		System.out.println("Novo valor da variavel B: " + suporte + "\n");
		sc.close();
	}
}
