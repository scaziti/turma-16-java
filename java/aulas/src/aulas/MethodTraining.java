package aulas;

public class MethodTraining 
{
	static void calculaSequencia (int numInformado)
	{
		int soma = 0;
		for (int i = 0; i < numInformado; i++)
		{
			System.out.println(i);
			soma += i;
		}
		System.out.println("\nA soma é de: " + soma);
	}
	
	static int soma(int x, int y) 
	{
		int resultado = x + y;
		System.out.println("A soma é de: " + resultado);
		return resultado;
	}
	
	public static void main(String[] args)
	{
		calculaSequencia(100);
		soma(10, 20);
	}
}
