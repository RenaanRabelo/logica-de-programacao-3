/*Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador e tamb�m o valor do percentual de reajuste (vari�vel PR) a ser
 * atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS).
 */

package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float SM, PR, NS;
		
		System.out.println("Digite o sal�rio mensal fixo: R$");
		SM = sc.nextFloat();
		
		System.out.println("Informe o percentual de reajuste: ");
		PR = sc.nextFloat();
		
		NS = SM + (SM * PR / 100);
		
		System.out.printf("O novo sal�rio ser� de: R$%.2f", NS);
		sc.close();
	}
}
