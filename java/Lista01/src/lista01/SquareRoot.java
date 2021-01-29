package lista01;

import java.util.Scanner;

public class SquareRoot 
{
	public static void main(String[] args)
	{
		/*
		 * Desenvolva um sistema em que:
		 * Leia 4 (quatro) números;
		 * Calcule o quadrado de cada um;
		 * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		 * Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		double[] vetNumDigitado = new double[4];
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Informe o " + (i + 1) + "º número: ");
			vetNumDigitado[i] = leitor.nextDouble();
			vetNumDigitado[i] = Math.pow(vetNumDigitado[i], 2);
		}
		
		for (int i = 0; i < vetNumDigitado.length; i++)
		{
			if (vetNumDigitado[2] >= 1000.0)
			{
				System.out.println("\nvetor[" + i + "]: "+ vetNumDigitado[2]);
				break;
			}
			else
			{
				System.out.println("\nvetor[" + i + "]: "+ vetNumDigitado[i]);
			}
		}
		
	}
}
