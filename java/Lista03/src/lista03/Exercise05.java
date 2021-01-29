package lista03;

import java.util.Scanner;

public class Exercise05 
{
	public static void main(String[] args)
	{
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.
		 * 
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado = 0, soma = 0;
		
		do
		{
			System.out.print("Informe o número: ");
			numDigitado = leitor.nextInt();
			soma += numDigitado;
			
			
		} while (numDigitado != 0);
		
		System.out.println("\nO total da soma é: " + soma);
	}
}
