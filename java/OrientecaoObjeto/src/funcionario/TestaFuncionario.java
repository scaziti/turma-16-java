package funcionario;

public class TestaFuncionario 
{
	public static void main(String[] args)
	{
		
		Empregado efetivado1 = new Empregado("Raphael", 34, 160, 30.50);
		Terceiro tercerizado1 = new Terceiro("Batman", 12, 120, 30.00, 10);
		
		System.out.println(efetivado1.getHoras());
		efetivado1.setHoras(180);
		System.out.println(efetivado1.getHoras());
		
		System.out.printf("SALÁRIO FINAL DO %s FOI DE R$ %.2f", efetivado1.getNome(), efetivado1.salarioFinal());
		System.out.printf("\nSALÁRIO FINAL DO %s FOI DE R$ %.2f", tercerizado1.getNome(), tercerizado1.salarioFinal());

	}
}
