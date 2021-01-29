package praticando;

public class PracticingForEach 
{
	public static void main(String[] args)
	{
		int[] vetorNumeros = {1, 2, 4, 8, 16, 32, 64};
		
		imprimeVetor(vetorNumeros);
	}
	
	public static void imprimeVetor(int[] nomeVetor)
	{
		for (int i : nomeVetor)
		{
			System.out.println(i);
		}
	}
}
