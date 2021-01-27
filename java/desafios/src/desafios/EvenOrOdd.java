package desafios;

import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado = 0, qtdeNumeros;
		
		System.out.print("\nInforme quantos números deseja avaliar: ");
		qtdeNumeros = leitor.nextInt();
		
		for (int i = 0; i < qtdeNumeros; i++)
		{
			System.out.print("\nInforme o número que deseja avaliar: ");
			numDigitado = leitor.nextInt();
			if (numDigitado % 2 == 0 && numDigitado > 0)
			{
				System.out.println("\nNúmero digitado é PAR!");
			}
			else if (numDigitado % 2 == 1 && numDigitado > 0)
			{
				System.out.println("\nNúmero digitado é ÍMPAR!");
			}
			else if (numDigitado == 0)
			{
				System.out.println("\nNúmero zero é neutro!");
			}
			else if (numDigitado < 0)
			{
				System.out.println("\nNúmero negativo. Utilize apenas positivo!\n");
			}
			else
			{
				System.out.println("\nInforme um número válido!");
			}
		}
		
		System.out.println("\nFim do programa");
		
	}
}
