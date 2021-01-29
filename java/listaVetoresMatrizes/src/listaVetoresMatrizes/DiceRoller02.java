package listaVetoresMatrizes;

import java.util.Random;
import java.text.DecimalFormat;

public class DiceRoller02 
{
	public static void main(String[] args)
	{
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente 
		 * tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
