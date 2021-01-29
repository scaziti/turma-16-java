package desafios;

import java.util.Scanner;

public class MonthlySchedule 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		
		char continuarSimNao, exibirAgenda;
		String nomeUsuario = " ";
		int dias = 31, horas = 24, diaDigitado = 0, horaDigitada = 0; 
		
		String[][] matrizAgenda = new String[dias][horas];
		
		pulaLinha();
		System.out.println("\t**** SEJA MUITO BEM-VINDE ***\n");
		pulaLinha();
		
		do
		{
			System.out.print("Informe o seu nome: ");
			nomeUsuario = leitor.next();
			System.out.print("\nInforme o dia que você deseja preencher [1 ao 31]: ");
			diaDigitado = leitor.nextInt();
			System.out.print("\nAgora informe o horário que deseja preencher [1 ao 24]: ");
			horaDigitada = leitor.nextInt();
			System.out.println("\nInforme o conteúdo do agendamento: ");
			matrizAgenda[diaDigitado][horaDigitada] = leitor.next();
			
			System.out.println("\nAgendamento Realizado!");
		
			System.out.println("\nDeseja exibir os eventos agendados? [S/N] ");
			exibirAgenda = leitor.next().toUpperCase().charAt(0);
			if (exibirAgenda == 'S')
			{
				for (int linha = 0; linha < dias; linha++)
				{
					for (int coluna = 0; coluna < horas; coluna++)
					{
						if (matrizAgenda[linha][coluna] != null)
						{
							System.out.println("\n | " + nomeUsuario +  "(Dia "+ linha + " às " + coluna + ":00): " 
									+ matrizAgenda[linha][coluna]);	
						}
					}
				}
			}
			
			System.out.println("Deseja adicionar mais algum evento? [S/N] ");
			continuarSimNao = leitor.next().toUpperCase().charAt(0);
			
		} while (continuarSimNao != 'n');	
	}
	
	public static void pulaLinha() 
	{
		for (int i = 0; i < 50; i++)
		{
			System.out.print("=");
		}
		System.out.println("\n");
	}
}
