package lista03;

import java.util.Scanner;

public class Exercise02 
{
	static void paresImpares() 
	{
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int numInformado = 0, qtdePares = 0, qtdeImpares = 0;
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Informe o " + (i + 1) + "� n�mero: ");
			numInformado = leitor.nextInt();
			
			if (numInformado % 2 == 0)
			{
				qtdePares++;
			} 
			else 
			{
				qtdeImpares++;
			}
			
		}
		
		System.out.println("Quantidade de pares: " + qtdePares);
		System.out.println("Quantidade de �mpares: " + qtdeImpares);
		
		
	}
	
	public static void main(String[] args)
	{
		
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		 */
		
		paresImpares(); // Chamo fun��o que calcula a quantida de pares e �mpares
		
		
	}
}
