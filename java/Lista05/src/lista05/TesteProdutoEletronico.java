package lista05;

public class TesteProdutoEletronico 
{
	public static void main(String[] args)
	{
		/*
		 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as 
		 * informa��es deste objeto no console.
		 */
		
		ProdutoEletronico aspirador = new ProdutoEletronico();
		
		aspirador.informacoesProduto();
		aspirador.ativarProduto(true);
		aspirador.exibeStatus();
	}
}
