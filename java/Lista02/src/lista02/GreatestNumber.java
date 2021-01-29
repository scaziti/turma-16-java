package lista02;

import java.util.Scanner;

public class GreatestNumber 
{
	public static void main(String[] args) 
	{
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int num = 0, maiorNumero = 0;
		
		for (int i = 0; i < 3; i++) 
		{
			System.out.println("Digite o número: ");
			num = leitor.nextInt();
			if (num > maiorNumero) 
			{
				maiorNumero = num;
			}
		}
		
		System.out.printf("O maior número digitado foi %d", maiorNumero);
		
	}
}
