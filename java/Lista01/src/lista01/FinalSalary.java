package lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FinalSalary 
{
	public static void main(String[] args)
	{
		/*
		 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
		 * trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
		 * E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o salário total e o salário excedente.
		 */
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		int codFuncionario;
		double salarioFinal, horasTrabalhadas, horasExtras;
		
		System.out.println("Informe o código do funcionário: ");
		codFuncionario = leitor.nextInt();
		System.out.println("Agora informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = leitor.nextInt();
		
		if (horasTrabalhadas > 50.0)
		{
			salarioFinal = (50 * 10.0) + ((horasTrabalhadas - 50.0) * 20.0);
			System.out.println("O funcionário " + codFuncionario + " terá um salário total de R$ " 
			+ formatar.format(salarioFinal));
		} 
		else 
		{
			salarioFinal = horasTrabalhadas * 10.0;
			System.out.println("O funcionário " + codFuncionario + " terá um salário total de R$ " 
					+ formatar.format(salarioFinal));;
		}
	}
}
