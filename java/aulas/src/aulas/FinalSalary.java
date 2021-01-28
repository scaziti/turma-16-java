package aulas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FinalSalary 
{
	public static void main(String[] args)
	{
		/*
		 * Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas 
		 * trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel 
		 * E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o sal�rio total e o sal�rio excedente.
		 */
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		int codFuncionario;
		double salarioFinal, horasTrabalhadas, horasExtras;
		
		System.out.println("Informe o c�digo do funcion�rio: ");
		codFuncionario = leitor.nextInt();
		System.out.println("Agora informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = leitor.nextInt();
		
		if (horasTrabalhadas > 50.0)
		{
			salarioFinal = (50 * 10.0) + ((horasTrabalhadas - 50.0) * 20.0);
			System.out.println("O funcion�rio " + codFuncionario + " ter� um sal�rio total de R$ " 
			+ formatar.format(salarioFinal));
		} 
		else 
		{
			salarioFinal = horasTrabalhadas * 10.0;
			System.out.println("O funcion�rio " + codFuncionario + " ter� um sal�rio total de R$ " 
					+ formatar.format(salarioFinal));;
		}
	}
}
