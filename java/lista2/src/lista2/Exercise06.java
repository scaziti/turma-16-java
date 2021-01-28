package lista2;

import java.util.Scanner;

public class Exercise06 
{
	public static void main(String[] args)
	{
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado = 0, soma = 0, contador = 0, media;
		
		do 
		{
			System.out.print("Informe o número: ");
			numDigitado = leitor.nextInt();
			
			if (numDigitado % 3 == 0 && numDigitado != 0)
			{
				soma += numDigitado;
				contador++;
			}
			
		} while (numDigitado != 0);
		
		media = soma / contador;
		System.out.print("\nA média dos números digitados: " + media);
		
	}
}
