package lista1;

import java.util.Scanner;

public class AscendingOrder 
{
	public static void main(String[] args)
	{
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int tamanhoVetor, numAuxiliar = 0;
		
		System.out.println("Informe o tamanho do vetor: ");
		tamanhoVetor = leitor.nextInt();
		
		int[] vetorCrescente = new int[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++)
		{
			System.out.println("Informe o n�mero que deseja: ");
			vetorCrescente[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < tamanhoVetor; i++)
		{
			for(int j = 0; j< tamanhoVetor - 1; j++)
			{
				if(vetorCrescente[j] > vetorCrescente[j + 1])
				{
					numAuxiliar = vetorCrescente[j];
					vetorCrescente[j] = vetorCrescente[j + 1];
					vetorCrescente[j + 1] = numAuxiliar;
				}
			}
		}
		
		System.out.println("\nOs n�meros ser�o em ordem crescente: "); 
		for (int i = 0; i < tamanhoVetor; i++) 
		{
			System.out.println(vetorCrescente[i]);
		}
	}
}
