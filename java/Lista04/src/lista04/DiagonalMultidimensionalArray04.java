package lista04;

import java.util.Scanner;

public class DiagonalMultidimensionalArray04 
{
	public static void main(String[] args)
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
		 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int somaGeral = 0, somaDiagonal = 0;
		
		int[][] matrizQuadrada = new int[3][3];
		
		pulaLinha();
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print("Informe o valor da Matriz[" + j + "][" + i + "]: ");
				matrizQuadrada[i][j] = leitor.nextInt();
				somaGeral += matrizQuadrada[i][j];
			}
		}
		pulaLinha();
		
		for (int i = 0; i < 3; i++)
		{
			somaDiagonal += matrizQuadrada[i][i]; 
		}
		pulaLinha();
		
		System.out.printf("A soma geral de todos os valores na Matriz é de %d", somaGeral);
		System.out.printf("\nA soma da diagonal principal da Matriz é de %d", somaDiagonal);
	}
	
	public static void pulaLinha()
	{
		for (int i = 0; i < 50; i++)
		{
			System.out.print("=");
		}
		System.out.println("\n");
	}
}
