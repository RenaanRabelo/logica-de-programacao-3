/*Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a apuração dos votos foram computados
 * votos nulos e votos em branco, além dos votos válidos para cada candidato. Deve ser criado um programa de computador que efetue a
 * leitura da quantidade de votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e votos em branco
 * Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual correspondente
 * de votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade
 * de eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente
 * de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade 
 * de eleitores; e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, vBrancos, vNulos, totalValidos, totalEleitores, percentualValidos, percentualA, percentualB, percentualC;
		int percentualNulos, percentualBrancos;
		
		System.out.println("Informe a quantidade de votos do candidato A: ");;
		A = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos do candidato B: ");;
		B = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos do candidato C: ");;
		C = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos: ");;
		vBrancos = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos nulos: ");;
		vNulos = sc.nextInt();
		
		totalValidos = A + B + C;
		totalEleitores = totalValidos + vBrancos + vNulos;
		
		percentualValidos = (totalValidos * 100) / totalEleitores;
		percentualA = (A * 100) / totalEleitores;
		percentualB = (B * 100) / totalEleitores;
		percentualC = (C * 100) / totalEleitores;
		percentualNulos = (vNulos * 100) / totalEleitores;
		percentualBrancos = (vBrancos * 100) / totalEleitores;
		
		System.out.println("Total de eleitores: " + totalEleitores);
		System.out.println("Percentual de votos válidos para a quantidade de eleitores: " + percentualValidos + "%");
		System.out.println("Percentual de votos válidos do candidato A: " + percentualA + "%");
		System.out.println("Percentual de votos válidos do candidato B: " + percentualB + "%");
		System.out.println("Percentual de votos válidos do candidato B: " + percentualC + "%");
		System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
		System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
		sc.close();
	}
}
