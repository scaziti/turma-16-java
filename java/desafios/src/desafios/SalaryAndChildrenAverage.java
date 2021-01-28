package desafios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalaryAndChildrenAverage 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		int qtdePessoas, pessoasMenos100 = 0;
		double salarioInformado = 0.0, mediaSalario = 0.0, maiorSalario = 0.0, qtdeFilhos = 0, mediaFilhos,
				somaSalario = 0.0, percentualMenos100;
		
		System.out.print("Informe a quantidade de pessoas: ");
		qtdePessoas = leitor.nextInt()
;		
		for (int i = 0; i < qtdePessoas; i++)
		{
			System.out.print("Informe o sal�rio da " + (i + 1) + "� pessoa: ");
			salarioInformado = leitor.nextDouble();
			System.out.print("Agora informe a quantidade de filhos: ");
			qtdeFilhos += leitor.nextInt();
			
			somaSalario += salarioInformado;
			
			if (maiorSalario < salarioInformado)
			{
				maiorSalario = salarioInformado;
			}
			if (salarioInformado < 100.00)
			{
				pessoasMenos100++;
			}
			System.out.println();
		}
		
		mediaSalario = somaSalario / qtdePessoas;
		mediaFilhos = qtdeFilhos / qtdePessoas;
		percentualMenos100 = (pessoasMenos100 * 100) / qtdePessoas;
		
		System.out.println("A m�dia de sal�rio foi de R$ " + formatar.format(mediaSalario));
		System.out.println("A m�dia de filhos foi de " + formatar.format(mediaFilhos));
		System.out.println("O maior sal�rio foi de R$ " + formatar.format(maiorSalario));
		System.out.println("A porcentagem de pessoas que recebem at� R$ 100,00 � de " + 
		formatar.format(percentualMenos100) + "%");
	}
}
