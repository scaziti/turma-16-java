import java.util.Scanner;
import java.text.DecimalFormat;


public class TestaFornecedor 
{
	public static void main(String[] agrs)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		String nome, endereco, telefone;
		double valorDivida, valorCredito;
		
		System.out.print("INFORME O NOME DO FORNECEDOR:");
		nome = leitor.nextLine();
		System.out.print("INFORME O ENDEREÇO DO FORNECEDOR:");
		endereco = leitor.nextLine();
		System.out.print("INFORME O TELEFONE DO FORNECEDOR:");
		telefone = leitor.nextLine();
		System.out.print("INFORME O VALOR DA DIVIDA DO FORNECEDOR:");
		valorDivida = leitor.nextDouble();
		System.out.print("INFORME O VALOR DE CRÉDITO DO FORNECEDOR:");
		valorCredito = leitor.nextDouble();
		
		Fornecedor unilever = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
		
		System.out.print("\nSALDO FINAL: R$ ");
		System.out.print(formatar.format(unilever.obterSaldo()));
	}
}
