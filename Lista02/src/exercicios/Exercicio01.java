/*
 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
 Considerar ano com 365 dias e mês com 30 dias. 
 */

package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, idadedias;
		
		System.out.println("Digite sua idade: ");
		anos = sc.nextInt();
		
		System.out.println("Digite quantos meses você tem: ");
		meses = sc.nextInt();
		
		System.out.println("informe quantos dias você tem: ");
		dias = sc.nextInt();
		
		idadedias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você tem " + anos + " anos " + meses + " meses e " + dias + " dias de idade");
		System.out.println("Sendo assim, você tem " + idadedias + " dias de vida");
		sc.close();
	}	
}
