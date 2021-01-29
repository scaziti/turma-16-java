package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Test01Method 
{
	Scanner leitor = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");
	
	public static void operacaoPoupanca()
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		int opcaoConta;
		
		opcaoConta = leitor.nextInt();
	}
	
	public static void pularLinha(int tamanho)
	{
		for (int i = 0; i < tamanho; i++)
		{
			System.out.print("=");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		int opcaoConta;
		
		pularLinha(40);
 	}
}
