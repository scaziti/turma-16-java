package lista01;

import java.util.Scanner;

public class YearsToDays 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in); // Instanciando e criando um objeto Scanner
		
		int idadeAnos, idadeMeses, idadeDias, idadeFinal; // Declarando vari�veis
		
		System.out.println("*** Seja Bem-Vinde ***"); 
		System.out.println("Informe quantos anos voc� t�m: "); 
		idadeAnos = ler.nextInt(); // Armazenando o valor digitado pelo usu�rio na vari�vel
		System.out.println("Agora informe quantos meses: ");
		idadeMeses = ler.nextInt();
		System.out.println("Por fim, informe quantos dias: ");
		idadeDias = ler.nextInt();
		
		idadeFinal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias; // Processamento da idade em dias
		
		System.out.println("A idade expressa em dias ser� de " + idadeFinal + " dias");
		
		
		
	}
}
