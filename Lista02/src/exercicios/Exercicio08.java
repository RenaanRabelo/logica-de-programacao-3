/*Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz 12 Km por litro.
 *  Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto (TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem.
 *   Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da dist�ncia,
 *    basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula LITROS_USADOS=DIST�NCIA/12. 
 *     Ao final, o programa deve apresentar os valores da velocidade m�dia (VELOCIDADE), tempo gasto na viagem
 *      (TEMPO), a dist�ncia percorrida iST�NCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem. 
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
		System.out.printf("A dist�ncia percorrida foi %.0f \n", distancia);
		System.out.printf("A quantidade de litros utilizados foi %.0f \n", combustivel);
		sc.close();
		
	}

}
