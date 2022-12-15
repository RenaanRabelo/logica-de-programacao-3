/*Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de conversão é C=(F-32) *(5/9),
 *  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
 */

package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float grausF, grausC;
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		grausF = sc.nextFloat();
		
		grausC = (grausF - 32) * 5 / 9;
		
		System.out.printf("A temperatura digitada corresponde a: %.1fºF", grausC);
		sc.close();
	}

}
