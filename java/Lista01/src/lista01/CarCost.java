package lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CarCost 
{
	public static void main(String[] args)
	{
		Scanner numero = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double custoCarro, custoFinal;
		
		System.out.print("Informe o valor de f�brica: R$ ");
		custoCarro = numero.nextDouble();
		
		custoFinal = (custoCarro * 1.45) * 1.28;
		
		System.out.println("\nO custo final do carro para o usu�rio ser� de R$ " 
		+ formatador.format(custoFinal));
	}
}
