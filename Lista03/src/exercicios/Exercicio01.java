/*Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade
 *  distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D.
 *  Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação
 *  e apresentar doze resultados de saída.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, somaAB, somaAC, somaAD, somaBC, somaBD, somaCD, multAB, multAC, multAD, multBC, multBD, multCD;
		
		System.out.println("Digite um número para A");
		A = sc.nextInt();
		
		System.out.println("Digite um número para B");
		B = sc.nextInt();
		
		System.out.println("Digite um número para C");
		C = sc.nextInt();
		
		System.out.println("Digite um número para D");
		D = sc.nextInt();
		
		somaAB = (A+B);
		somaAC = (A+C);
		somaAD = (A+D);
		somaBC = (B+C);
		somaBD = (B+D);
		somaCD = (C+D);
		   
		multAB = (A*B);
		multAC = (A*C);
		multAD = (A*D);
		multBC = (B*C);
		multBD = (B*D);
		multCD = (C*D);
		
		System.out.println("Somas: " + somaAB + ' ' + somaAC +  ' ' + somaAD + ' ' + somaBC + ' ' + somaBD + ' ' + somaCD + "\n");
		System.out.println("Multiplicações: " + multAB + ' ' + multAC + ' ' + multAD + ' ' + multBC + ' ' + multBD + ' ' + multCD);
		sc.close();
	}
}
