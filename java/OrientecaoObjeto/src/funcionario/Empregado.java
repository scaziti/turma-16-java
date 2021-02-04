package funcionario;

public class Empregado 
{
	private String nome;
	private int matricula;
	private int horas;
	private double valorHora;
	
	// construtor
	public Empregado(String nome, int matricula)
	{
		this.nome = nome;
		this.matricula = matricula;
	}
	
	// sobrecarga do construtor
	public Empregado(String nome, int matricula, int horas, double valorHora)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}

	public int getHoras() 
	{
		return horas;
	}

	public void setHoras(int horas) 
	{
		this.horas = horas;
	}

	public double getValorHora() 
	{
		return valorHora;
	}

	public void setValorHora(double valorHora) 
	{
		this.valorHora = valorHora;
	}
	
	public double salarioFinal()
	{
		double salarioFinal = this.horas * this.valorHora;
		return salarioFinal;
	}
	
}
