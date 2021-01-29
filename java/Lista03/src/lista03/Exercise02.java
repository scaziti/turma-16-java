package lista03;

import java.util.Scanner;

public class Exercise02 
{
	static void paresImpares() 
	{
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int numInformado = 0, qtdePares = 0, qtdeImpares = 0;
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Informe o " + (i + 1) + "º número: ");
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
		System.out.println("Quantidade de ímpares: " + qtdeImpares);
		
		
	}
	
	public static void main(String[] args)
	{
		
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 */
		
		paresImpares(); // Chamo função que calcula a quantida de pares e ímpares
		
		
	}
}
