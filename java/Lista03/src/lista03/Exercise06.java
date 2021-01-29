package lista03;

import java.util.Scanner;

public class Exercise06 
{
	public static void main(String[] args)
	{
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero)
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int contador = 0;
		double numDigitado = 0.0, soma = 0.0, media = 0.0;
		
		do 
		{
			System.out.print("Informe o n�mero: ");
			numDigitado = leitor.nextDouble();
			
			if (numDigitado % 3 == 0 && numDigitado != 0 && numDigitado > 0)
			{
				soma += numDigitado;
				contador++;
			}
			
		} while (numDigitado != 0);
		
		media = soma / contador;
		System.out.print("\nA m�dia dos n�meros digitados: " + media);
		
	}
}
