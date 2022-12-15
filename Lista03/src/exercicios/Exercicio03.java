//Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, quadrado, diferenca;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		
		diferenca = A - B;
		quadrado = (int)Math.pow(diferenca, 2);
		
		System.out.println("O quadrado da diferença é: " + quadrado);
		sc.close();
		
	}
}
