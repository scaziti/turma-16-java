package desafios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class test 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		System.out.println("******************************");
		System.out.println("DEPRESSÃO BANKING G16");
		System.out.println("NÃO VAI DAR BOM");
		System.out.println("******************************");
		int contagem = 0;
		int contaSelecionada;
		int escolhadaTransacao = 0;
		int parcelaTalao = 0;
		double saldocomTalao = 0.00;
		double saldo = 0.00;
		double valor = 0.00;
		double saldoTemporario = 0.00;
		double saldoAtual = 0.0;
		double limite = 1000.0;
		double limiteDisponivel = 0.0;
		double limiteUtilizado = 0.0;
		char escolhaTalao = 'S', continuarSimNao = ' ';
		String descricao = " ";
		
		System.out.println("SELECIONE O TIPO DE CONTA");
		System.out.println("1 CONTA POUPANÇA,2 - CONTA CORRENTE,3 - CONTA ESPECIAL ,4 - CONTA EMPRESA,5 - SAIR");
		contaSelecionada = leia.nextInt();
		
		while(contaSelecionada < 1 || contaSelecionada > 5)
		{
			System.out.println("Voce digitou errado , tente novamente");
			System.out.println("1 CONTA POUPANÇA,2 - CONTA CORRENTE,3 - CONTA ESPECIAL ,4 - CONTA EMPRESA,5 - SAIR");
			contaSelecionada = leia.nextInt();
		}
		
		do 
		{
			if (contaSelecionada == 1) 
			{
				do // início cód Rapha
				{
					System.out.print("Qual transação deseja realizar? [1 - D / 2 - C] ");
					escolhadaTransacao = leia.nextInt();
					
					while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
					{
						System.out.println("Voce digitou errado , tente novamente");
						System.out.println("Sua transação é 1-Debito ou 2- Credito");
						escolhadaTransacao = leia.nextInt();
					}
					
					if (escolhadaTransacao == 1)
					{
						if (saldo <= 0.0) 
						{
							System.out.println("Saldo insuficiente. Operação não realizada");
						}
						else
						{
							System.out.print("Informe o valor que deseja debitar: R$ ");
							valor = leia.nextDouble();
							saldo -= valor;
						}
				
					}
					else if (escolhadaTransacao == 2)
					{
						System.out.print("Informe o valor que deseja creditar: R$ ");
						valor = leia.nextDouble();
						saldo += valor;
					}
					
					System.out.println("\nSeu saldo atual com rendimento da poupança (0.05%) R$ " 
					+ (formatar.format(((saldo * 0.05) / 100) + saldo)));
					
					System.out.println("Deseja continuar? [S / N]");
					continuarSimNao = leia.next().charAt(0);
					
					if (continuarSimNao == 'n' || continuarSimNao == 'N')
					{
						contagem = 10;
					}

					contagem++;
				} while (contagem < 3);
			} // fim cód. Rapha
			else if (contaSelecionada == 2)
			{
					System.out.println("Voce escolheu conta corrente"); // inicio cód. Tati
					System.out.println("Voce tem direto a 10 transações de debito ou credito");
				
					do	
					{
					
						System.out.println("Sua transação é 1-Debito ou 2- Credito");
						escolhadaTransacao = leia.nextInt();
						while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
						{
							System.out.println("Voce digitou errado , tente novamente");
							System.out.println("Sua transação é 1-Debito ou 2- Credito");
							escolhadaTransacao = leia.nextInt();
						}
					
					
					
							if (escolhadaTransacao == 1)
							{	
						
									System.out.println("Digite o valor: " );
									valor = leia.nextInt();
									saldoTemporario = saldo;
									System.out.println("Sua transação foi debito e no valor de " + valor);
									saldo = saldo - valor;
									if (saldo<0)
									{
										System.out.println("Seu saldo esta negativo , vc nao pode fazer essa atividade");	
										saldo = saldoTemporario;
								
									}
							}
							if (escolhadaTransacao == 2)
							
							{
								System.out.println("Digite o valor: " );
								valor = leia.nextInt();
								System.out.println("Sua transação foi credito e no valor de " + valor);
								saldo = saldo +valor;
							}
					
							contagem++;
						
						
					
					}while (contagem !=2);
					
					
						System.out.println("Voce deseja emitir talão S/N" );
						escolhaTalao = leia.next().charAt(0);
						if(escolhaTalao != 'N' )
						{
							System.out.println("quantas vezes parcelados 1 - 3" );
							parcelaTalao = leia.nextInt();
							saldocomTalao = saldo/parcelaTalao;
							System.out.println("******************************");
							System.out.println("DEPRESSÃO BANKING G16");
							System.out.println("******************************");
							System.out.println("Conta corrente 01");
							System.out.println("Seu saldo é  " + saldo);
							System.out.println("Voce decidiu por talão e suas parcelas foram " + parcelaTalao);
							System.out.println("Baseado no seu saldo, suas parcelas precisam ser em torno de  " + saldocomTalao);
							
							
						}
						else
						{
							System.out.println("Suas tarefas foram finalizadas");
						} // fim cód. Tati
						
						
						
			}
			else if (contaSelecionada == 3)
			{
					System.out.println("'CONTA ESPECIAL' - Seleciona o movimento [1 - D/ 2 - C]"); // inicio cód. Victor
					escolhadaTransacao = leia.nextInt();
					
					while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
					{
						System.out.println("Voce digitou errado , tente novamente");
						System.out.println("Sua transação é 1-Debito ou 2- Credito");
						escolhadaTransacao = leia.nextInt();
					}
					
					if(escolhadaTransacao == 1)
					{
						System.out.print("Digite o Valor: ");
						valor = leia.nextDouble();
						System.out.printf("Digite a Descrição: ");
						descricao = leia.next();
						saldoAtual = saldo + valor;
						System.out.println("Saldo Atual "+saldoAtual );
						
						
					}
					else
					{
					
						System.out.println("Deseja usar o limite?, se sim quanto: ");
						limiteUtilizado = leia.nextDouble();
						saldoAtual = saldo + limiteUtilizado;
						limiteDisponivel = limite - limiteUtilizado;
					}
					if(limite == 0)
					{
						System.out.printf("Você está sem limite disponivel ");
					}
					else
					{
						System.out.printf("você utilizou o limite de " +formatar.format(limiteUtilizado));
						System.out.println("\nSeu saldo Atual é de: " +formatar.format(saldoAtual));
						System.out.println("\nLimite disponivel é de: " +formatar.format(limiteDisponivel));
					}
			} // fim cód. Victor
			
			System.out.println("SELECIONE O TIPO DE CONTA");
			System.out.println("1 CONTA POUPANÇA,2 - CONTA CORRENTE,3 - CONTA ESPECIAL ,4 - CONTA EMPRESA,5 - SAIR");
			contaSelecionada = leia.nextInt();
			
			
		} while (contaSelecionada != 5);
		
		System.out.println("Sessão Encerrada");
	}	
}
