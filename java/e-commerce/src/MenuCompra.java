import java.util.Scanner;

public class MenuCompra {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		System.out.println("Resultado: " + soma(10, 20));
		
		do
		{
			
		
			System.out.println("\t ||MENU|| \t");
			System.out.println("\n1 - Cadastro ");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.println("4 - ");
			System.out.println("5 - ");
			System.out.printf("Selecione a op��o que deseja: ");
			opcao = leia.nextInt();
			switch (opcao) 
			{
			case 1:
				cadastro();
				break;
			case 2:
				
				break;
			case 3:
				adicionarCarrinho();
				break;
			case 4:
				
				break;
			default:
				System.out.println("Op��o invalida, tente novamente! ");
				break;
			}
			return;
		} while (true);
	
	}
	
	public static void cadastro() {
		Scanner leia = new Scanner(System.in);
		String nome;
		char sexo;
		System.out.println("Informe Primeiro Nome: ");
		nome = leia.next();
		
		System.out.println("Informe o Genero que se identifica: M - Mulher / H - Homem / E - outros ");
		sexo = leia.next().toUpperCase().charAt(0);
		
		while (sexo != 'M' && sexo != 'H' && sexo != 'E')
		{
			System.out.println("Incorreto, informe:  M - Mulher / H - Homem / E - outros");
			sexo = leia.next().toUpperCase().charAt(0);
		}
		if(sexo == 'M')
		{
			System.out.printf("Ol� Sra %s Escolha uma op��o a seguir: ", nome);
		}
		
		else if(sexo == 'H')
		{
			System.out.printf("Ol� Sr %s: ", nome);
		}
		else
		{
			System.out.printf("Ol� SrE %s: ", nome);
			
		}
		
		leia.close();
	}
	
	public static void adicionarCarrinho()
	{
		final int add = 10;
		int [] addProduto = new int [add];
		
		for(int i=0;i<add;i++)
		{
			carrinho();
		}
	}
	
	public static void carrinho() {
		int produto = 10;
	}
	
	static int soma(int x, int y)
	{
		int soma  = x + y;
		return soma;
	}

}
