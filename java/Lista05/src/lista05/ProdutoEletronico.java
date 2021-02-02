package lista05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProdutoEletronico 
{
	public String nomeProduto;
	public String descricaoProduto;
	public double valorProduto;
	public boolean funcionamento;
	
	public void informacoesProduto()
	{
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("INFORME O NOME DO PRODUTO: ");
		nomeProduto = leitor.nextLine();
		System.out.print("\nINFORME A DESCRIÇÃO DO PRODUTO: ");
		descricaoProduto = leitor.nextLine();
		System.out.print("\nINFORME O VALOR DO PRODUTO: R$ ");
		valorProduto = leitor.nextDouble();
	}
	
	public boolean ativarProduto(boolean ligado)
	{	
		if (ligado)
		{
			return funcionamento = ligado;
		} 
		else
		{
			return funcionamento = ligado;
		}
		
	}
	
	public void exibeStatus()
	{
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		System.out.println(nomeProduto);
		System.out.println(descricaoProduto);
		System.out.println(formatar.format(valorProduto));
		System.out.println("PRODUTO EM FUNCIONAMENTO: " + funcionamento);
	}
}
