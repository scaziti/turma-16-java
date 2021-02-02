package lista05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aviao 
{
	public String modeloAviao;
	public String codigoAviao;
	public double velocidade;
	public int numPassageiros;
	
	public void informacaoAeronave()
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("BEM VINDE A MAIOR COMPANHIA AEREA DO MUNDO");
		System.out.print("\nINFORME O MODELO DA AERONAVE: ");
		modeloAviao = leitor.nextLine();
		System.out.print("INFORME O C�DIGO DESTA AERONAVE: ");
		codigoAviao = leitor.nextLine();
	}
	
	public double acelerarAviao(double acelerar)
	{
		return velocidade = acelerar;
	}
	
	public double desacelerarAviao(double desacelarar)
	{
		return velocidade = desacelarar;
	}
	
	public int preencherAviao(int incluir)
	{
		return numPassageiros = incluir;
	}
	
	public int esvaziarAviao(int remover)
	{
		return numPassageiros = remover;
	}
	
	public void saidaDadosVoo()
	{
		DecimalFormat formatar = new DecimalFormat("0.00");
		pulaLinha();
		System.out.printf("\nMODELO AVI�O: %s", modeloAviao);
		System.out.printf("\nC�DIGO AVI�O: %s", codigoAviao);
		System.out.printf("\nVELOCIDADE ATUAL: " + formatar.format(velocidade));
		System.out.printf("\nN� PASSAGEIROS: " + numPassageiros);
		pulaLinha();
	}
	
	public void pulaLinha()
	{
		System.out.println("\n");
		for (int i = 0; i < 70; i++)
		{
			System.out.print("=");
		}
		System.out.println("\n");
	}
}
