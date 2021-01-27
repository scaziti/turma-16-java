package desafios;

import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado = 0, qtdeNumeros;
		
		System.out.print("\nInforme quantos n�meros deseja avaliar: ");
		qtdeNumeros = leitor.nextInt();
		
		for (int i = 0; i < qtdeNumeros; i++)
		{
			System.out.print("\nInforme o n�mero que deseja avaliar: ");
			numDigitado = leitor.nextInt();
			if (numDigitado % 2 == 0 && numDigitado > 0)
			{
				System.out.println("\nN�mero digitado � PAR!");
			}
			else if (numDigitado % 2 == 1 && numDigitado > 0)
			{
				System.out.println("\nN�mero digitado � �MPAR!");
			}
			else if (numDigitado == 0)
			{
				System.out.println("\nN�mero zero � neutro!");
			}
			else if (numDigitado < 0)
			{
				System.out.println("\nN�mero negativo. Utilize apenas positivo!\n");
			}
			else
			{
				System.out.println("\nInforme um n�mero v�lido!");
			}
		}
		
		System.out.println("\nFim do programa");
		
	}
}
