package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TomatoesTax 
{
	public static void main(String[] args)
	{
		/*
		 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
		 * rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o 
		 * estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 
		 * por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) 
		 * e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa 
		 * que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.println("Portanto, o valor total a ser pago da multa, ser� de R$" + formatar.format(valorFinal));
		}
		else
		{
			System.out.println("N�o houveram excessos registrados no tranporte de tomates.");
			System.out.println("O valor total a ser pago da multa, ser� de " + formatar.format(valorFinal));
		}
		
		
		
	}
}
