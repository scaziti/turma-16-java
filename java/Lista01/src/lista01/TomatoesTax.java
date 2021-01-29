package lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TomatoesTax 
{
	public static void main(String[] args)
	{
		/*
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
		 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o 
		 * estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 
		 * por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
		 * e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa 
		 * que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double pesoTomate, pesoExcedente = 0.0, valorFinal = 0.0;
		
		System.out.print("Informe quantos kilos de tomate foram transportados: ");
		pesoTomate = leitor.nextDouble();
		
		if (pesoTomate > 50)
		{
			pesoExcedente = pesoTomate - 50;
			valorFinal = pesoExcedente * 4.0;
			System.out.println("Houve um excesso de " + pesoExcedente + " kg");
			System.out.println("Portanto, o valor total a ser pago da multa, será de R$" + formatar.format(valorFinal));
		}
		else
		{
			System.out.println("Não houveram excessos registrados no tranporte de tomates.");
			System.out.println("O valor total a ser pago da multa, será de " + formatar.format(valorFinal));
		}
		
		
		
	}
}
