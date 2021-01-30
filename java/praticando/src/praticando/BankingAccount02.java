package praticando;

public class BankingAccount02 
{
	static void pulaLinha()
	{
		for (int i = 0; i < 40; i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
	
	static void imprimeTexto() // creating a Method
	{
		System.out.println("Olá, mundo!");
	}
	
	static void somaDoisNumeros(int numA, int numB) // creating a Method with Parameters
	{
		System.out.println(numA + numB);
	}
	
	static int multiplicaDoisNumeros(int numA, int numB) // creating a Method with return
	{
		return numA * numB;
	}
	
	// Method Overloading (Multiple Methods with the same name, but different parameters)
	static int divisaoDoisNumeros(int firstNumb, int secondNumb)
	{
		return firstNumb / secondNumb;
	}
	
	static double divisaoDoisNumeros(double firstNumb, double secondNumb)
	{
		return firstNumb / secondNumb;
	}
	
	
	public static void main(String[] args)
	{
		int resultadoMultiplicacao;
		
		imprimeTexto(); // Calling Method "imprimeTexto"
		
		somaDoisNumeros(10, 5); // Calling Method "somaDoisNumeros" with 2 arguments
		
		resultadoMultiplicacao = multiplicaDoisNumeros(10, 20);
		System.out.println(resultadoMultiplicacao); // Calling Method "multiplicaDoisNumeros" with 2 arguments
		
		// Using two Method with the same name, but different types
		int resultadoDivisaoInteiros = divisaoDoisNumeros(10, 5);
		double resultadoDivisaoDouble = divisaoDoisNumeros(50.0, 20.0);
		
		pulaLinha();
		
		System.out.println(resultadoDivisaoDouble);
		System.out.println(resultadoDivisaoInteiros);
	}
}
