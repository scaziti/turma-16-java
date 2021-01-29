package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SoccerLeague 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		char resultadoRodada = ' ';
		
		String[] vetorTimes = {"Corinthians", "Palmeiras", "Santos", "São Paulo"};
		int[] vetorPontos = new int[4];
		
		for (int i = 0; i < vetorPontos.length; i++)
		{
			System.out.println((i + 1) + "ª rodada: ");
			for (int j = 0; j < vetorPontos.length; j++)
			{
				System.out.print(vetorTimes[j] + "  \t[G - Ganhou, E - Empatou, P - Perdeu ]: ");
				resultadoRodada = leitor.next().toUpperCase().charAt(0);
				if (resultadoRodada == 'G') 
				{
					vetorPontos[j] += 3;
				}
				else if (resultadoRodada == 'E')
				{
					vetorPontos[j] += 1;
				}
				else if (resultadoRodada == 'P')
				{
					vetorPontos[j] += 0;
				}
				
			}
			pulaLinha();
			
		}
		
		
		System.out.println("\nO resultado final dessas rodas ficou assim: \n");
		for (int i = 0; i < vetorPontos.length; i++)
		{
			System.out.println(vetorTimes[i] + "\t\t " + vetorPontos[i] + " pontos");
		}
		pulaLinha();
	}
	
	public static void pulaLinha ()
	{
		for (int i = 0; i < 80; i++)
		{
			System.out.print("=");
			
		}
		System.out.println("\n");
	}
}
