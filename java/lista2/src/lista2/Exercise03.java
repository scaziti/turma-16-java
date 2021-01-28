package lista2;

import java.util.Scanner;

public class Exercise03 
{
	public static void main(String[] args)
	{
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. 
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int idadeInformada = 0, menos21 = 0, mais50 = 0;
		
		System.out.print("Informe a idade: ");
		idadeInformada = leitor.nextInt();
		
		while (idadeInformada != -99)
		{
			if (idadeInformada < 21 && idadeInformada > 0)
			{
				menos21++;
			}
			else if (idadeInformada > 50 && idadeInformada > 0) 
			{
				mais50++;
			}
			System.out.print("Informe a idade: ");
			idadeInformada = leitor.nextInt();
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos: " + menos21);
		System.out.println("A quantidade de pessoas com mais de 50 anos: " + mais50);
	}
}
