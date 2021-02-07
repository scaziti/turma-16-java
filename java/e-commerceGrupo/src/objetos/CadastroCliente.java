package objetos;

import java.util.Scanner;

public class CadastroCliente 
{
	// Attributes
	private String nomeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	private String generoCliente;
	private int idadeCliente;
	
	// Constructor
	public CadastroCliente(String nomeCliente, String cpfCliente, String enderecoCliente, String generoCliente, int idadeCliente)
	{
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.generoCliente = generoCliente;
		this.idadeCliente = idadeCliente;
	}
	
	// Getters & Setters
	public String getNomeCliente()
	{
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() 
	{
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) 
	{
		this.cpfCliente = cpfCliente;
	}

	public String getEnderecoCliente() 
	{
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) 
	{
		this.enderecoCliente = enderecoCliente;
	}

	public String getGeneroCliente() 
	{
		return generoCliente;
	}

	public void setGeneroCliente(String generoCliente) 
	{
		this.generoCliente = generoCliente;
	}

	public int getIdadeCliente() 
	{
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) 
	{
		this.idadeCliente = idadeCliente;
	}
	
	// Methods
	public void introduzDados()
	{
		int generoCliente;
		Scanner leitor = new Scanner(System.in);
		System.out.print("NOME: ");
		this.nomeCliente = leitor.next();
		System.out.print("CPF: ");
		this.cpfCliente = leitor.next();
		System.out.print("ENDEREÇO: ");
		this.enderecoCliente = leitor.next();
		System.out.print("IDADE: ");
		this.idadeCliente = leitor.nextInt();
		System.out.print("GÊNERO: "
				+ "\n| 1 - Masculino |"
				+ "\n| 2 - Feminino  |"
				+ "\n| 3 - Outros    | \n");
		cordialidadeGenero(generoCliente = leitor.nextInt());
	}
	
	public void cordialidadeGenero(int genero)
	{
		if (genero == 1)
		{
			this.generoCliente = "Sr. ";
		}
		else if (genero == 2)
		{
			this.generoCliente = "Sra. ";
		}
		else if (genero == 3)
		{
			this.generoCliente = "Srx. ";
		}
	}
}
