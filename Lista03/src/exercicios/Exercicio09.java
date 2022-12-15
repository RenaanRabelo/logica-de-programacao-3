/*Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser
 * atribuído. Apresentar o valor do novo salário (variável NS).
 */

package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float SM, PR, NS;
		
		System.out.println("Digite o salário mensal fixo: R$");
		SM = sc.nextFloat();
		
		System.out.println("Informe o percentual de reajuste: ");
		PR = sc.nextFloat();
		
		NS = SM + (SM * PR / 100);
		
		System.out.printf("O novo salário será de: R$%.2f", NS);
		sc.close();
	}
}
