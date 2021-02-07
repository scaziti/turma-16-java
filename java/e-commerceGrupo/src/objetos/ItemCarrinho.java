package objetos;

public class ItemCarrinho 
{
	// Attributes
	private int codProdCarrinho;
	private int quantidadeProdutoCarrinho;
	private double totalCarrinho;
	
	// Constructor
	public ItemCarrinho(int codProdCarrinho, int quantidadeProdutoCarrinho)
	{
		this.codProdCarrinho = codProdCarrinho;
		this.quantidadeProdutoCarrinho = quantidadeProdutoCarrinho;
	}
	
	// Getters & Setters
	public int getQuantidadeProdutoCarrinho()
	{
		return this.quantidadeProdutoCarrinho;
	}
	
	public void setQuantidadeProdutoCarrinho(int quantidadeProdutoCarrinho)
	{
		this.quantidadeProdutoCarrinho = quantidadeProdutoCarrinho;
	}

	public int getCodProdCarrinho() 
	{
		return codProdCarrinho;
	}

	public void setCodProdCarrinho(int codProdCarrinho) 
	{
		this.codProdCarrinho = codProdCarrinho;
	}

	public double getTotalCarrinho() 
	{
		return totalCarrinho;
	}

	public void setTotalCarrinho(double totalCarrinho) 
	{
		this.totalCarrinho = totalCarrinho;
	}
	
	// Methods
	public double calculaTotalCarrinho()
	{
		return this.totalCarrinho;
	}
}
