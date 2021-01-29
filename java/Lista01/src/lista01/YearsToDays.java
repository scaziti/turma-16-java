package lista01;

import java.util.Scanner;

public class YearsToDays 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in); // Instanciando e criando um objeto Scanner
		
		int idadeAnos, idadeMeses, idadeDias, idadeFinal; // Declarando variáveis
		
		System.out.println("*** Seja Bem-Vinde ***"); 
		System.out.println("Informe quantos anos você têm: "); 
		idadeAnos = ler.nextInt(); // Armazenando o valor digitado pelo usuário na variável
		System.out.println("Agora informe quantos meses: ");
		idadeMeses = ler.nextInt();
		System.out.println("Por fim, informe quantos dias: ");
		idadeDias = ler.nextInt();
		
		idadeFinal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias; // Processamento da idade em dias
		
		System.out.println("A idade expressa em dias será de " + idadeFinal + " dias");
		
		
		
	}
}
