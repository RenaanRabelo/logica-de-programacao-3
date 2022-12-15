/*Em uma elei��o sindical concorreram ao cargo de presidente tr�s candidatos (A, B e C). Durante a apura��o dos votos foram computados
 * votos nulos e votos em branco, al�m dos votos v�lidos para cada candidato. Deve ser criado um programa de computador que efetue a
 * leitura da quantidade de votos v�lidos para cada candidato, al�m de efetuar tamb�m a leitura da quantidade de votos nulos e votos em branco
 * Ao final o programa deve apresentar o n�mero total de eleitores, considerando votos v�lidos, nulos e em branco; o percentual correspondente
 * de votos v�lidos em rela��o � quantidade de eleitores; o percentual correspondente de votos v�lidos do candidato A em rela��o � quantidade
 * de eleitores; o percentual correspondente de votos v�lidos do candidato B em rela��o � quantidade de eleitores; o percentual correspondente
 * de votos v�lidos do candidato C em rela��o � quantidade de eleitores; o percentual correspondente de votos nulos em rela��o � quantidade 
 * de eleitores; e por �ltimo o percentual correspondente de votos em branco em rela��o � quantidade de eleitores.
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
		System.out.println("Percentual de votos v�lidos para a quantidade de eleitores: " + percentualValidos + "%");
		System.out.println("Percentual de votos v�lidos do candidato A: " + percentualA + "%");
		System.out.println("Percentual de votos v�lidos do candidato B: " + percentualB + "%");
		System.out.println("Percentual de votos v�lidos do candidato B: " + percentualC + "%");
		System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
		System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
		sc.close();
	}
}
