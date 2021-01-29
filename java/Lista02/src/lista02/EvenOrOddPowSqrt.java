package lista02;

import java.util.Scanner;
import java.text.*;

public class EvenOrOddPowSqrt 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat arredondar = new DecimalFormat("0.00");
		
		double numDigitado;
		
		System.out.println("Informe o n�mero que deseja: ");
		numDigitado = leitor.nextDouble();
		
		if (numDigitado % 2 == 0)
		{
			System.out.println("N�mero Par. A ra�z quadrada ser� de " + arredondar.format(Math.sqrt(numDigitado)));
		}
		else if (numDigitado % 2 == 1)
		{
			System.out.println("N�mero �mpar. Esse n�mero elevado a 2 ser� de " + arredondar.format(Math.pow(numDigitado, 2)));
		}
	}
}
