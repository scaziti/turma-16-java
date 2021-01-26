package aulas;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class DistanceBetweenTwoPoints 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		double pontoX1, pontoY1, pontoX2, pontoY2, distancia;
		
		System.out.println("Digite X1: ");
		pontoX1 = ler.nextDouble();
		System.out.println("Digite Y1: ");
		pontoY1 = ler.nextDouble();
		System.out.println("Digite X2: ");
		pontoX2 = ler.nextDouble();
		System.out.println("Digite Y2: ");
		pontoY2 = ler.nextDouble();
		
		distancia = Math.sqrt((Math.pow(pontoX2 - pontoX1, 2) + Math.pow(pontoY2 - pontoY1, 2)));
		
		System.out.println("O distância será de " + formatador.format(distancia));
	}	
}
