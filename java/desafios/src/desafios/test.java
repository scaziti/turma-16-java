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
		System.out.println("DEPRESS�O BANKING G16");
		System.out.println("N�O VAI DAR BOM");
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
		System.out.println("1 CONTA POUPAN�A,2 - CONTA CORRENTE,3 - CONTA ESPECIAL ,4 - CONTA EMPRESA,5 - SAIR");
		contaSelecionada = leia.nextInt();
		
		while(contaSelecionada < 1 || contaSelecionada > 5)
		{
			System.out.println("Voce digitou errado , tente novamente");
			System.out.println("1 CONTA POUPAN�A,2 - CONTA CORRENTE,3 - CONTA ESPECIAL ,4 - CONTA EMPRESA,5 - SAIR");
			contaSelecionada = leia.nextInt();
		}
		
		do 
		{
			if (contaSelecionada == 1) 
			{
				do // in�cio c�d Rapha
				{
					System.out.print("Qual transa��o deseja realizar? [1 - D / 2 - C] ");
					escolhadaTransacao = leia.nextInt();
					
					while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
					{
						System.out.println("Voce digitou errado , tente novamente");
						System.out.println("Sua transa��o � 1-Debito ou 2- Credito");
						escolhadaTransacao = leia.nextInt();
					}
					
					if (escolhadaTransacao == 1)
					{
						if (saldo <= 0.0) 
						{
							System.out.println("Saldo insuficiente. Opera��o n�o realizada");
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
					
					System.out.println("\nSeu saldo atual com rendimento da poupan�a (0.05%) R$ " 
					+ (formatar.format(((saldo * 0.05) / 100) + saldo)));
					
					System.out.println("Deseja continuar? [S / N]");
					continuarSimNao = leia.next().charAt(0);
					
					if (continuarSimNao == 'n' || continuarSimNao == 'N')
					{
						contagem = 10;
					}

					contagem++;
				} while (contagem < 3);
			} // fim c�d. Rapha
			else if (contaSelecionada == 2)
			{
					System.out.println("Voce escolheu conta corrente"); // inicio c�d. Tati
					System.out.println("Voce tem direto a 10 transa��es de debito ou credito");
				
					do	
					{
					
						System.out.println("Sua transa��o � 1-Debito ou 2- Credito");
						escolhadaTransacao = leia.nextInt();
						while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
						{
							System.out.println("Voce digitou errado , tente novamente");
							System.out.println("Sua transa��o � 1-Debito ou 2- Credito");
							escolhadaTransacao = leia.nextInt();
						}
					
					
					
							if (escolhadaTransacao == 1)
							{	
						
									System.out.println("Digite o valor: " );
									valor = leia.nextInt();
									saldoTemporario = saldo;
									System.out.println("Sua transa��o foi debito e no valor de " + valor);
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
								System.out.println("Sua transa��o foi credito e no valor de " + valor);
								saldo = saldo +valor;
							}
					
							contagem++;
						
						
					
					}while (contagem !=2);
					
					
						System.out.println("Voce deseja emitir tal�o S/N" );
						escolhaTalao = leia.next().charAt(0);
						if(escolhaTalao != 'N' )
						{
							System.out.println("quantas vezes parcelados 1 - 3" );
							parcelaTalao = leia.nextInt();
							saldocomTalao = saldo/parcelaTalao;
							System.out.println("******************************");
							System.out.println("DEPRESS�O BANKING G16");
							System.out.println("******************************");
							System.out.println("Conta corrente 01");
							System.out.println("Seu saldo �  " + saldo);
							System.out.println("Voce decidiu por tal�o e suas parcelas foram " + parcelaTalao);
							System.out.println("Baseado no seu saldo, suas parcelas precisam ser em torno de  " + saldocomTalao);
							
							
						}
						else
						{
							System.out.println("Suas tarefas foram finalizadas");
						} // fim c�d. Tati
						
						
						
			}
			else if (contaSelecionada == 3)
			{
					System.out.println("'CONTA ESPECIAL' - Seleciona o movimento [1 - D/ 2 - C]"); // inicio c�d. Victor
					escolhadaTransacao = leia.nextInt();
					
					while(escolhadaTransacao != 1 && escolhadaTransacao != 2 )
					{
						System.out.println("Voce digitou errado , tente novamente");
						System.out.println("Sua transa��o � 1-Debito ou 2- Credito");
						escolhadaTransacao = leia.nextInt();
					}
					
					if(escolhadaTransacao == 1)
					{
						System.out.print("Digite o Valor: ");
						valor = leia.nextDouble();
						System.out.printf("Digite a Descri��o: ");
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
						System.out.printf("Voc� est� sem limite disponivel ");
					}
					else
					{
						System.out.printf("voc� utilizou o limite de " +formatar.format(limiteUtilizado));
						System.out.println("\nSeu saldo Atual � de: " +formatar.format(saldoAtual));
						System.out.println("\nLimite disponivel � de: " +formatar.format(limiteDisponivel));
					}
			} // fim c�d. Victor
			
			System.out.println("SELECIONE O TIPO DE CONTA");
			System.out.println("1 CONTA POUPAN�A,2 - CONTA CORRENTE,3 - CONTA ESPECIAL ,4 - CONTA EMPRESA,5 - SAIR");
			contaSelecionada = leia.nextInt();
			
			
		} while (contaSelecionada != 5);
		
		System.out.println("Sess�o Encerrada");
	}	
}
