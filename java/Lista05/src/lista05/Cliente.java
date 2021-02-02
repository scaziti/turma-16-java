package lista05;

public class Cliente 
{
	public String nomeCliente;
	public int idadeCliente;
	public char generoCliente;
	
	public String tratamentoGenero(char genero)
	{
		String resultado;
		if (generoCliente == 'M' || generoCliente == 'm')
		{
			resultado = "Sr.";
		}
		else if (generoCliente == 'F' || generoCliente == 'f')
		{
			resultado = "Sra.";
		}
		else 
		{
			resultado = "SrE.";
		}
		return resultado;
	}
	
}
