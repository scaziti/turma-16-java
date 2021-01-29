package lista01;

import java.util.Scanner;

public class SecondsToHours 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in); // Instancia��o e cria��o do objeto Scanner
		
		int duracaoSegundos, tempoHoras, tempoMinutos, resto; // Declara��o das vari�veis
		
		System.out.println(" *** Seja Bem-Vinde ***\n");
		System.out.println("Informe o tempo decorrido em segundos: ");
		duracaoSegundos = ler.nextInt(); // Entrada e armazanamento do valor na vari�vel
		
		tempoHoras = duracaoSegundos / 3600; // processamento dos dias para anos, meses e dias
		resto = duracaoSegundos % 3600;
		tempoMinutos = resto / 60;
		resto = resto % 60;
		
		System.out.println("O tempo decorrido foi de " + tempoHoras + " hora(s), " + tempoMinutos + " minuto(s) e " 
		+ resto + " segundo(s)"); // sa�da dos valores obtidos acima
	}
}
