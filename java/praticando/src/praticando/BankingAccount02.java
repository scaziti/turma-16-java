package praticando;

public class BankingAccount02 
{
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
	
	public static void main(String[] args)
	{
		imprimeTexto(); // Calling Method "imprimeTexto"
		somaDoisNumeros(10, 5); // Calling Method "somaDoisNumeros" with 2 arguments
		System.out.println(multiplicaDoisNumeros(10, 2)); // Calling Method "multiplicaDoisNumeros" with 2 arguments
	}
}
