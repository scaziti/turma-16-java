package lista02;

import java.util.Scanner;

public class GreatestNumber 
{
	public static void main(String[] args) 
	{
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int num = 0, maiorNumero = 0;
		
		for (int i = 0; i < 3; i++) 
		{
			System.out.println("Digite o n�mero: ");
			num = leitor.nextInt();
			if (num > maiorNumero) 
			{
				maiorNumero = num;
			}
		}
		
		System.out.printf("O maior n�mero digitado foi %d", maiorNumero);
		
	}
}
