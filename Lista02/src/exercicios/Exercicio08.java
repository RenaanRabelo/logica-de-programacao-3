/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro.
 *  Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem.
 *   Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância,
 *    basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTÂNCIA/12. 
 *     Ao final, o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem
 *      (TEMPO), a distância percorrida iSTÂNCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem. 
 */


package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float tempo, distancia, combustivel, velocidade;
		
		System.out.println("Informe o tempo gasto durante a viagem: ");
		tempo = sc.nextFloat();
		
		System.out.println("Digite a velocidade media da viagem: ");
		velocidade = sc.nextFloat();
		
		distancia = tempo * velocidade;
		combustivel = distancia / 12;
		
		System.out.printf("A velocidade media da viagem foi %.0f \n", velocidade);
		System.out.printf("O tempo gasto na viagem foi %.2f \n", tempo);
		System.out.printf("A distância percorrida foi %.0f \n", distancia);
		System.out.printf("A quantidade de litros utilizados foi %.0f \n", combustivel);
		sc.close();
		
	}

}
