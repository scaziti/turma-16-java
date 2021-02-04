
public class Pessoa 
{
	private String nome;
	private String endereco;
	private String telefone;
	
	// construtores
	public Pessoa (String nome, String endereco, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String endereco)
	{
		this.endereco = endereco;
		this.nome = nome;
	}
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	// getters and setters
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getEndereco()
	{
		return endereco;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getTelefone() 
	{
		return telefone;
	}
	
	public void setTelefone(String telefone)
	{
		this.endereco = telefone;
	}
}
