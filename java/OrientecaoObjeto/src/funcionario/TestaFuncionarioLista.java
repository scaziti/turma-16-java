package funcionario;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TestaFuncionarioLista 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		List <Empregado> lista = new ArrayList<>();
		
		String nome;
		int numeroFunc, matricula, horas;
		double valorHora, acrescimo;
		char opcaoTerceiro;
		
		
		System.out.print("INFORME O NÚMERO DE FUNCIONÁRIOS: ");
		numeroFunc = leitor.nextInt();
		for (int i = 0; i < numeroFunc; i++)
		{
			System.out.println("\nFUNCIONÁRIO Nº " + (i + 1));
			System.out.print("INFORME O NOME DO FUNCIONARIO: \t\t");
			nome = leitor.next();
			System.out.print("INFORME O Nº MATRÍCULA: \t\t");
			matricula = leitor.nextInt();
			System.out.print("INFORME A QUANTIDADE DE HORAS: \t\t");
			horas = leitor.nextInt();
			System.out.print("INFORME O VALOR RECEBIDO POR HORAS: R$ \t");
			valorHora = leitor.nextDouble();
			System.out.print("FUNCIONARIO É TERCEIRO? [S/N]: \t\t");
			opcaoTerceiro = leitor.next().toUpperCase().charAt(0);
			if (opcaoTerceiro == 'S')
			{
				System.out.print("INFORME O VALOR DE ACRESCIMO (%): \t");
				acrescimo = leitor.nextDouble();
				lista.add(new Terceiro(nome, matricula, horas, valorHora, acrescimo));
			}
			else if (opcaoTerceiro == 'N')
			{
				lista.add(new Empregado(nome, matricula, horas, valorHora));
			}
		}
		
		pulaLinha();
		System.out.print("\nFUNCIONÁRIO \t\t MATRÍCULA \t\t SALÁRIO");
		for(Empregado emp : lista) 
		{
            System.out.println("\n" + emp.getNome() + " \t\t " +
            		emp.getMatricula() + " \t\t\t " +
            		"R$ " + formatar.format(emp.salarioFinal()));
        }
		pulaLinha();
	
	}
	

	static void pulaLinha()
	{
		for (int i = 0; i < 70; i++)
		{
			System.out.print("=");
		}
	}
}