
public class Funcionario extends Pessoa 
{
	public int codigoSetor;
	private double salarioBase;
	public double impostosRetidos;
	
	public Funcionario (String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double impostosRetidos)
	{
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostosRetidos = impostosRetidos;
	}
	
	public int getCodigoSetor()
	{
		return codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor)
	{
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImpostosRetidos() {
		return impostosRetidos;
	}

	public void setImpostosRetidos(double impostosRetidos) {
		this.impostosRetidos = impostosRetidos;
	}
	
	
	public double calculaSalario()
	{
		double salarioFinal = (this.salarioBase - (this.salarioBase * this.impostosRetidos) / 100);
		return salarioFinal;
	}
	
}
