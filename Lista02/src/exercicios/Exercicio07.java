//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura 

package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, altura, volume;
		
		
		System.out.println("Digite a altura da lata de óleo: ");
		altura = sc.nextFloat();
		
		System.out.println("Digite o valor do raio da lata de óleo: ");
		raio = sc.nextFloat();
		
		float quadradoRaio = (float)Math.pow(raio, 2);
		
		volume = 3.14 * quadradoRaio * altura;
		
		System.out.println("O volume da lata de óleo é: " + volume);
		sc.close();
		
	}
}
