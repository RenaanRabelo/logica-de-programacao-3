/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (C/5)*9+32,
 *  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
 */

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grausC, grausF;
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		grausC = sc.nextInt();
		
		grausF = (grausC / 5) * 9 + 32;
		
		System.out.println(grausC + "ºC convertidos em graus Fahrenheit é igual a: " + grausF + "ºF");
		sc.close();
	}
}
