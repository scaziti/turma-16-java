package praticando;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankingAccount03 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		int contadorTelaInicial = 0, voltaTelaInicial = 1;
		double saldo = 1000.00;
		
		pulaLinha();
		System.out.println("\n\t\t\t\t Seja muito Bem-Vinde ao JURASSIC BANK \n");
		
		do
		{
			while (contadorTelaInicial < 3)
			{
				pulaLinha();
				System.out.println("\nEscolha a conta que deseja acessar: \n");
				System.out.println("\n1 - Saldo"
						+ "\n2 - Conta Corrente"
						+ "\n3 - Conta poupança"
						+ "\n4 - conta investimento"
						+ "\n5 - Sair");
				voltaTelaInicial = leitor.nextInt();
				
				if (voltaTelaInicial == 1)
				{
					System.out.println("Seu saldo atual é de R$ " + formatar.format(saldo));	
				}
				else if (voltaTelaInicial == 2)
				{
					saldo = contaCorrente(saldo);
					System.out.println("Seu saldo atual R$ " + formatar.format(saldo));
				}
				else if (voltaTelaInicial == 3)
				{
					System.out.println("poupança");
				}
				else if(voltaTelaInicial == 4)
				{
					System.out.println("investimento");
				}
				else if (voltaTelaInicial == 5)
				{
					break;
				}
				else
				{
					System.out.println("\nOpção inválida. Escolha uma opção válida");
				}
				
				contadorTelaInicial++;
				if (contadorTelaInicial == 3)
				{
					System.out.println("\nSessão Expirada");
					break;
				}
			}
			
			if (contadorTelaInicial == 3)
			{
				break;
			}
			
		} while (voltaTelaInicial != 5);
		
		pulaLinha();
		System.out.println("\nJurassic Bank agradece. Volte Sempre!");
		
	}
	
	static double contaCorrente(double a)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		int opcaoEscolhida = 1;
		double saldoMovimentado = 0.00, valorMovimentado = 0.00;
		
		while (opcaoEscolhida >= 1 && opcaoEscolhida <= 2) 
		{
			pulaLinha();
			System.out.println("Seu saldo atual é de R$ " + formatar.format(a));
			System.out.println("\nEscolha a operação que deseja realizar: "
					+ "\n1 - Saque"
					+ "\n2 - Depósito"
					+ "\n3 - Encerrar");
			opcaoEscolhida = leitor.nextInt();
			if (opcaoEscolhida == 1)
			{
				System.out.print("Informe o valor do saque: R$ ");
				valorMovimentado = leitor.nextDouble();
				a -= valorMovimentado;
				
			}
			else if (opcaoEscolhida == 2)
			{
				System.out.print("Informe o valor do depósito: R$ ");
				valorMovimentado = leitor.nextDouble();
				a -= valorMovimentado;
			}
		}
		return a;
	}
	
	static void pulaLinha()
	{
		System.out.println();
		for (int i = 0; i < 100; i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
	
	
}
