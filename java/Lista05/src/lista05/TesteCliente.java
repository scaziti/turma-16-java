package lista05;

import java.util.Scanner;

public class TesteCliente 
{
	public static void main(String[] args)
	{
		/*
		 * Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
		 * informações deste objeto no console.
		 */
		
		Scanner leitor = new Scanner(System.in);
		Cliente consumidor1 = new Cliente();
		
		System.out.println("**** SEJA BEM-VINDE ****");
		System.out.println("\nPOR FAVOR, INFORME SEU NOME: ");
		consumidor1.nomeCliente = leitor.nextLine();
		System.out.println("\nAGORA INFORME SEU GÊNERO: ");
		consumidor1.generoCliente = leitor.next().toUpperCase().charAt(0);
		System.out.println("\nINFORME TAMBÉM SUA IDADE: ");
		consumidor1.idadeCliente = leitor.nextInt();
		
		System.out.printf("Obrigado pelas informações, %s %s. Idade informada: %d anos", 
				consumidor1.tratamentoGenero(consumidor1.generoCliente), consumidor1.nomeCliente, consumidor1.idadeCliente);
		
	}
}
