package lista05;

public class TesteAviao 
{
	public static void main(String[] args)
	{
		/*
		 * Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as 
		 * informa��es deste objeto no console.
		 */
		
		Aviao aeronave = new Aviao();
		
		aeronave.informacaoAeronave();
		aeronave.acelerarAviao(655.40);
		aeronave.preencherAviao(320);
		aeronave.saidaDadosVoo();
		System.out.println("CHEGADA AO DESTINO");
		aeronave.desacelerarAviao(0);
		aeronave.esvaziarAviao(0);
		aeronave.saidaDadosVoo();
		
	}
}

