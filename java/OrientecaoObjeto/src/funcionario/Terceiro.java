package funcionario;

public class Terceiro extends Empregado
{
	private double acrescimo;
	
	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo)
	{
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}
	
	public double getAcrescimo()
	{
		return this.acrescimo;
	}
	
	public void setAcrescimo(double acrescimo)
	{
		this.acrescimo = acrescimo;
	}

	@Override
	public double salarioFinal() 
	{
		//double salarioTerceiro = this.salarioFinal() + (this.salarioFinal() * (this.acrescimo / 100));
		//return salarioTerceiro;
		
		return super.salarioFinal() + (super.salarioFinal() * (this.acrescimo / 100));
	}
	
	
	
}
