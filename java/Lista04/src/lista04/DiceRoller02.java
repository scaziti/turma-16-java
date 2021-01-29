package lista04;

import java.util.Random;
import java.text.DecimalFormat;

public class DiceRoller02 
{
	public static void main(String[] args)
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente 
		 * também quantas foram as ocorrências da maior pontuação.
		 */
		
		DecimalFormat formatar = new DecimalFormat("0.00");
		Random aleatorio = new Random();
		
		int maiorValor = 0, somaDado = 0, contador = 0;
		double mediaGeral;
		
		int[] vetorDado = new int[10];
		
		for (int i = 0; i < vetorDado.length; i++)
		{
			vetorDado[i] = aleatorio.nextInt(7);
			System.out.println("vetorDado[" + i + "]: " + vetorDado[i]);
			
			somaDado += vetorDado[i];
			
			if (vetorDado[i] >= maiorValor)
			{
			
			 	if (vetorDado[i] == maiorValor)
			 	{
			 		contador++;
				}
			 	else
				{
		 			contador = 1;
		 		}
			 	
			 	maiorValor = vetorDado[i];
			 }
		}
		
		
		mediaGeral = (somaDado * 1.0) / 10.0;
		
		System.out.println("\nA media geral foi de " + formatar.format(mediaGeral));
		System.out.printf("O maior valor foi o %d, aparecendo %d vezes", maiorValor, contador);
	}
}
