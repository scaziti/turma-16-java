package lista01;

import java.util.Scanner;

public class WeightedAverage 
{
	public static void main(String[] args)
	{
		/*
		 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double notaA, notaB, notaC, mediaFinal;
		
		System.out.println("*** Seja Bem-Vinde ***\n");
		System.out.println("Informe a primeira nota: ");
		notaA = ler.nextDouble();
		System.out.println("Informe a segunda nota: ");
		notaB = ler.nextDouble();
		System.out.println("Informe a terceira nota: ");
		notaC = ler.nextDouble();
		
		mediaFinal = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / 10;
		
		System.out.println("A m�dia ponderada final, ser� de: " + mediaFinal);
		
	}
}
