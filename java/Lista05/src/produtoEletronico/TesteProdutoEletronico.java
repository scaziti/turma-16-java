package lista05;

public class TesteProdutoEletronico 
{
	public static void main(String[] args)
	{
		/*
		 * Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as 
		 * informações deste objeto no console.
		 */
		
		ProdutoEletronico aspirador = new ProdutoEletronico();
		
		aspirador.informacoesProduto();
		aspirador.ativarProduto(true);
		aspirador.exibeStatus();
	}
}
