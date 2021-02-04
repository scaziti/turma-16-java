

public class TestaEmpregado 
{
	public static void main(String[] agrs)
	{
		Funcionario colaborador1 = new Funcionario("Raphael", "Rua 123", "(11) 21" , 2, 1250.00, 25.0);
		
		colaborador1.setSalarioBase(3500.50);
		System.out.print("SALÁRIO BASE: ");
		System.out.print(colaborador1.getSalarioBase());
		
		double salarioFinal = colaborador1.calculaSalario();
		System.out.print("\nSALÁRIO APÓS IMPOSTOS DE 25%: " + salarioFinal);
		
	}
}
