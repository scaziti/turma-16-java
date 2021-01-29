package lista04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MultidimensionalArray03 
{
	public static void main(String[] args)
	{
		/*
		 * Escreva um programa que leia duas matrizes N1 (4,6) e N2(4,6) e cria:
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		 */
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double[][] matrizN1 = new double[4][6];
		double[][] matrizN2 = new double[4][6];
		
		double[][] matrizSomaM1 = new double[4][6];
		double[][] matrizDiferencaM2 = new double[4][6];
		
		for (int linha = 0; linha < 4; linha++) 
		{
			for (int coluna = 0; coluna < 6; coluna++) 
			{
				System.out.print("Informe o valor da MatrizN1[" + linha + "][" + coluna + "]: ");
				matrizN1[linha][coluna] = leitor.nextDouble();
				
				
				matrizSomaM1[linha][coluna] += matrizN1[linha][coluna] + matrizN2[linha][coluna];
				matrizDiferencaM2[linha][coluna] += matrizN1[linha][coluna] - matrizN2[linha][coluna];
			}
		}
		pulaLinha();
		
		for (int linha = 0; linha < 4; linha++) 
		{
			for (int coluna = 0; coluna < 6; coluna++) 
			{
				System.out.print("\nInforme o valor da MatrizN2[" + linha + "][" + coluna + "]: ");
				matrizN2[linha][coluna] = leitor.nextDouble();
				
				matrizSomaM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna];
				matrizDiferencaM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna];
			}
		}
		pulaLinha();
		
		for (int linha = 0; linha < 4; linha++)
		{
			for (int coluna = 0; coluna < 6; coluna++)
			{
				System.out.print("Matriz M1[" + linha + "][" + coluna + "]: " + formatar.format(matrizSomaM1[linha][coluna]));
			}
		}
		pulaLinha();
		
		for (int linha = 0; linha < 4; linha++)
		{
			for (int coluna = 0; coluna < 6; coluna++)
			{
				System.out.println("Matriz M2[" + linha + "][" + coluna + "]: " + formatar.format(matrizDiferencaM2[linha][coluna]));
			}
		}
		
	}
	
	public static void pulaLinha()
	{
		for (int i = 0; i < 50; i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
}
