package objetos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ProdutosEstoque 
{
	// Attributes
	private String codigoProduto;
	private String descricaoProduto;
	private double valorProduto;
	private int quantidadeProduto;
	
	// Constructor
	public ProdutosEstoque(String codigoProduto, String descricaoProduto, double valorProduto, int quantidadeProduto)
	{
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.valorProduto = valorProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	// Getters & Setters
	public String getCodigoProduto()
	{
		return codigoProduto;
	}
	
	public void setCodigoProduto(String codigoProduto)
	{
		this.codigoProduto = codigoProduto;
	}
	
	public String getDescricaoProduto() 
	{
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) 
	{
		this.descricaoProduto = descricaoProduto;
	}

	public double getValorProduto() 
	{
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) 
	{
		this.valorProduto = valorProduto;
	}
	
	public int getQuantidadeProduto()
	{
		return this.quantidadeProduto;
	}
	
	public void setQuantidadeProduto(int quantidadeProduto)
	{
		this.quantidadeProduto = quantidadeProduto;
	}
	
	// Methods
	public void exibeProdutos()
	{
		DecimalFormat formatar = new DecimalFormat("0.00");
		List<ProdutosEstoque> listaEstoque = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
			listaEstoque.add(new ProdutosEstoque("#" + (1 + i), "Livro " + (1 + i), 10 + i, 10));
			
		}
		
		System.out.println("CÓDIGO \t\t DESCRIÇÃO \t\t VALOR \t\t ESTOQUE\n");
		for (ProdutosEstoque estoqueAtualizado : listaEstoque)
		{
			System.out.println(estoqueAtualizado.getCodigoProduto() + " \t\t " +
					estoqueAtualizado.getDescricaoProduto() + " \t\t " +
					formatar.format(estoqueAtualizado.getValorProduto()) + " \t\t " +
					estoqueAtualizado.getQuantidadeProduto() + " un");
		}
	}
	
}
