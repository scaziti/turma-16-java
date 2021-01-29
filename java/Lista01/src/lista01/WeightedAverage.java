package lista01;

import java.util.Scanner;

public class WeightedAverage 
{
	public static void main(String[] args)
	{
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
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
		
		System.out.println("A média ponderada final, será de: " + mediaFinal);
		
	}
}
