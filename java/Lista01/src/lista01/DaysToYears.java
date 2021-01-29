package lista01;

import java.util.Scanner;

public class DaysToYears 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in); // Instanciando e criando objeto scanner
		
		int idadeEmDias, idadeAnos, idadeMeses, resto; // Declarando variáveis
		
		System.out.println("*** Seja bem-vinde ***\n");
		System.out.println("Informe sua idade em dias: ");
		idadeEmDias = ler.nextInt();
		
		idadeAnos = idadeEmDias / 365;
		resto = idadeEmDias % 365;
		idadeMeses = resto / 30;
		resto = resto % 30;
		
		System.out.println("\nSua idade é de " + idadeAnos + " anos, " + idadeMeses + " meses e " + resto + " dias");
	}
}
