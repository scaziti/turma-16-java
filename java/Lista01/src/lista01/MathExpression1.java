package lista01;

import java.util.Scanner;
import java.lang.Math;

public class MathExpression1 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in); // Instanciação e criação do objeto Scanner
		
		int numA, numB, numC, expressaoD;
		
		System.out.println("*** Seja Bem-Vinde ***\n");
		System.out.println("Informe o número A: ");
		numA = ler.nextInt();
		System.out.println("Informe o número B: ");
		numB = ler.nextInt();
		System.out.println("Informe o número C: ");
		numC = ler.nextInt();
		
		expressaoD = ((numA + numB) * (numA + numB) + (numB + numC) * (numB + numC)) / 2;
		
		System.out.println("O resultado dessa expressão será de " + expressaoD);
		
	}
}
