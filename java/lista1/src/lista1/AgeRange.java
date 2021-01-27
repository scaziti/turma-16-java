package lista1;

import java.util.Scanner;

public class AgeRange 
{
	public static void main(String[] args)
	{
		/*
		 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
		 * 10-14 infantil
		 * 15-17 juvenil
		 * 18-25 adulto
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int idadeDigitada;
		
		System.out.println("Informe a idade: ");
		idadeDigitada = leitor.nextInt();
		
		if (idadeDigitada >= 10 && idadeDigitada <= 14)
		{
			System.out.println("\nFicar� na categoria entre 10 - 14 anos (Infantil)");
		}
		else if (idadeDigitada >= 15 && idadeDigitada <= 17)
		{
			System.out.println("\nFicar� na categoria entre 15 e 17 anos (juvenil)");
		}
		else if (idadeDigitada >= 18 && idadeDigitada <= 25)
		{
			System.out.println("\nFicar� na categoria entre 18 e 25 anos (Adulto)");
		}
		else if (idadeDigitada < 0)
		{
			System.out.println("Informe apenas idades v�lidas e positivas");
		}
		else 
		{
			System.out.println("Sua idade n�o � atendida em nenhuma categoria. Procure a dire��o para maiores informa��es");
		}
	}
}
