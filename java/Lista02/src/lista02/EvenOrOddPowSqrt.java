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
		
		System.out.println("Informe o número que deseja: ");
		numDigitado = leitor.nextDouble();
		
		if (numDigitado % 2 == 0)
		{
			System.out.println("Número Par. A raíz quadrada será de " + arredondar.format(Math.sqrt(numDigitado)));
		}
		else if (numDigitado % 2 == 1)
		{
			System.out.println("Número ímpar. Esse número elevado a 2 será de " + arredondar.format(Math.pow(numDigitado, 2)));
		}
	}
}
