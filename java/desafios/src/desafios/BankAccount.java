package desafios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccount 
{
	public static void main(String[] args)
	{
		// conta poupança - Rapha
		// conta corrente - tati
		// conta especial - victor
		// conta empresa - Osvaldo
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00"); 
		
		int contaSelecionada, contadorAcesso = 0;
		double saldo = 0.0, valorMovimentado = 0.0;
		char  debitoCredito = ' ', continuarSimNao = ' ';
		
		System.out.println("SEJA MUITO BEM-VINDE!");
		
		
		do 
		{
			System.out.print("Qual transação deseja realizar? [D / C] ");
			debitoCredito = leitor.next().charAt(0);
			
			if (debitoCredito == 'D' || debitoCredito == 'd')
			{
				if (saldo <= 0.0) 
				{
					System.out.println("Saldo insuficiente. Operação não realizada");
				}
				else
				{
					System.out.print("Informe o valor que deseja debitar: R$ ");
					valorMovimentado = leitor.nextDouble();
					saldo -= valorMovimentado;
				}
		
			}
			else if (debitoCredito == 'c' || debitoCredito == 'C')
			{
				System.out.print("Informe o valor que deseja creditar: R$ ");
				valorMovimentado = leitor.nextDouble();
				saldo += valorMovimentado;
			}
			
			System.out.println("\nSeu saldo atual com rendimento da poupança (0.05%) R$ " 
			+ (formatar.format(((saldo * 0.05) / 100) + saldo)));
			
			System.out.println("Deseja continuar? [S / N]");
			continuarSimNao = leitor.next().charAt(0);
			
			if (continuarSimNao == 'n' || continuarSimNao == 'N')
			{
				break;
			}
			
			contadorAcesso++;
		} while (contadorAcesso < 3);
		System.out.println("Sessão Finalizada");
		
	}		
}



		
