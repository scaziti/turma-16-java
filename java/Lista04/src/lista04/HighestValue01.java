package lista04;

import java.util.Scanner;

public class HighestValue01 
{
	public static void main(String[] args)
	{
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o 
		 * escreva em seguida. Encontre após a maior pontuação e a apresente. 
		 */
		
		Scanner leitor = new Scanner(System.in); // Instanciação do objeto Scanner.
		
		int tamanhoVetor, maiorValor = 0;
		
		System.out.print("Informe o tamanho do vetor: ");
		tamanhoVetor = leitor.nextInt();
		
		int[] vetorInteiro = new int[tamanhoVetor];
		
		
		pulaLinha();
		for (int i = 0; i < vetorInteiro.length; i++)
		{
			System.out.print("Informe o número que deseja para vetorInteiro[" + i + "]: ");
			vetorInteiro[i] = leitor.nextInt();
			
			if (vetorInteiro[i] > maiorValor)
			{
				maiorValor = vetorInteiro[i];
			}
		}
		
		pulaLinha();
		System.out.printf("O maior valor digitado foi: %d", maiorValor);
	}
	
	public static void pulaLinha()
	{
		for (int i = 0; i < 40; i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
}
