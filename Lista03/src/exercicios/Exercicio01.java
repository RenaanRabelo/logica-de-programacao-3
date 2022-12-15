/*Ler quatro n�meros inteiros e apresentar o resultado da adi��o e multiplica��o, baseando-se na utiliza��o do conceito da propriedade
 *  distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D.
 *  Depois B com C, B com D e por fim C com D. Perceba que ser� necess�rio efetuar seis opera��es de adi��o e seis opera��es de multiplica��o
 *  e apresentar doze resultados de sa�da.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, somaAB, somaAC, somaAD, somaBC, somaBD, somaCD, multAB, multAC, multAD, multBC, multBD, multCD;
		
		System.out.println("Digite um n�mero para A");
		A = sc.nextInt();
		
		System.out.println("Digite um n�mero para B");
		B = sc.nextInt();
		
		System.out.println("Digite um n�mero para C");
		C = sc.nextInt();
		
		System.out.println("Digite um n�mero para D");
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
		System.out.println("Multiplica��es: " + multAB + ' ' + multAC + ' ' + multAD + ' ' + multBC + ' ' + multBD + ' ' + multCD);
		sc.close();
	}
}
