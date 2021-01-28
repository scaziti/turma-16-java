package desafios;

import java.util.Scanner;

public class LoopWithDoWhile 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		int numDigitado, contador = 0, soma = 0;
		
		System.out.print("Informe o número que deseja: ");
		numDigitado = leitor.nextInt();
		
		do
		{
			System.out.println(contador);
			soma += contador;
			contador++;
			
		} while (contador <= numDigitado);
		
		System.out.println("\nO total foi de: " + soma);
	}
}
