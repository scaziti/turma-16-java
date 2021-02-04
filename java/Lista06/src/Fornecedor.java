
public class Fornecedor extends Pessoa
{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor (String nome, String endereco, String telefone, double valorCredito, double valorDivida)
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito()
	{
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito)
	{
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida()
	{
		return valorCredito;
	}
	
	public void setValorDivida(double valorDivida)
	{
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo()
	{
		double saldo = this.valorCredito - this.valorDivida;
		return saldo;
	}
}
