package lista2;

import java.util.Scanner;

public class Exercise04 
{
	public static void main(String[] args)
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos 
		 * indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
		 * - o número de pessoas calmas; 
		 * - o número de mulheres nervosas; 
		 * - o número de homens agressivos; 
		 * - o número de outros calmos;
		 * - o número de pessoas nervosas com mais de 40 anos; 
		 * - o número de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		String nomeInformado = " ";
		
		int qtdePessoas = 0, sexoInformado, comportamentoInformado,
				qtdeFem = 0, qtdeMasc = 0, qtdeOutros = 0,
				qtdeCalmo = 0, qtdeNervoso = 0, qtdeAgressivo = 0;
		
		while (qtdePessoas < 3)
		{
			System.out.print("Informe a idade da pessoa nº" + (qtdePessoas + 1) + ": ");
			nomeInformado = leitor.next();
			do
			{
					System.out.print("Informe o sexo da pessoa nº" + (qtdePessoas + 1) + " [1 (F) - 2 (M) - 3 (Outros)]: ");
					sexoInformado = leitor.nextInt();
					
					if (sexoInformado == 1)
					{
						qtdeFem++;
					}
					else if(sexoInformado == 2)
					{
						qtdeMasc++;
					}
					else if (sexoInformado == 3)
					{
						qtdeOutros++;
					}
					else
					{
						System.out.println("Valor inválido. Digite novamente.");
					}
			} while (sexoInformado != 1 && sexoInformado != 2 && sexoInformado != 3);
			
			do
			{
					System.out.print("Informe o comportamento da pessoa nº" + (qtdePessoas + 1) + " [1 (calmo) - 2 (nervoso) - 3 (agressivo)]: ");
					comportamentoInformado = leitor.nextInt();
					
					if (comportamentoInformado == 1)
					{
						qtdeCalmo++;
					}
					else if(comportamentoInformado == 2)
					{
						qtdeNervoso++;
					}
					else if (comportamentoInformado == 3)
					{
						qtdeAgressivo++;
					}
					else
					{
						System.out.println("Valor inválido. Digite novamente.");
					}
			} while (comportamentoInformado != 1 && comportamentoInformado != 2 && comportamentoInformado != 3);
			
			
			qtdePessoas++;
		}
		
		System.out.println("A quantidade de pessoas calma: " + qtdeCalmo);
	}
}
