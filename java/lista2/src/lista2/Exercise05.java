package lista2;

import java.util.Scanner;

public class Exercise05 
{
	public static void main(String[] args)
	{
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.
		 * 
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado = 0, soma = 0;
		
		do
		{
			System.out.print("Informe o n�mero: ");
			numDigitado = leitor.nextInt();
			soma += numDigitado;
			
			
		} while (numDigitado != 0);
		
		System.out.println("\nO total da soma �: " + soma);
	}
}
