package desafios;

import java.util.Scanner;

public class LoopWithFor 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado, soma = 0;
		
		System.out.print("Informe o número que deseja: ");
		numDigitado = leitor.nextInt();
		
		for (int i = 0; i <= numDigitado; i++)
		{
			System.out.println(i);
			soma += i;
		}
		
		System.out.println("\nO valor total foi de: " + soma);
		
		System.out.println(numDigitado * 101);
	}
	
	
}
