package objetos;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TelaInicial 
{
	public static void main(String[] agrs)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		ProdutosEstoque meusProdutos = new ProdutosEstoque(null, null, 0, 0);
		CadastroCliente cliente01 = new CadastroCliente(null, null, null, null, 0);
		ItemCarrinho carrinhoCliente01 = new ItemCarrinho(0, 0);
		
		List<ItemCarrinho> listaCarrinho = new ArrayList<>();
		
		String nomeCliente, cpfCliente, enderecoCliente;
		int escolhaOpcao, generoCliente, idadeCliente, codProdutoCarrinho, quantidadeProdutoCarrinho;
		
		System.out.println("\t\t\t SEJA BEM VINDE\n");
		meusProdutos.exibeProdutos();
	
		System.out.println("\n\nSELECIONE UMA OPÇÃO: "
				+ "\n\n1 - CADASTRO"
				+ "\n2 - CARRINHO");
		escolhaOpcao = leitor.nextInt();
		while (escolhaOpcao != 1 && escolhaOpcao != 2)
		{
			System.err.println("\nOPÇÃO INVÁLIDA");
			System.out.println("\nSELECIONE UMA OPÇÃO: "
					+ "\n\n1 - CADASTRO"
					+ "\n2 - CARRINHO");
			escolhaOpcao = leitor.nextInt();
		}
		if (escolhaOpcao == 1)
		{
			cliente01.introduzDados();
			System.out.println("OBRIGADO! CADASTRO REALIZADO COM SUCESSO.");
		}
		if (escolhaOpcao == 2)
		{
			do
			{
				System.out.println("\nSELECIONE A OPÇÃO: "
						+ "\n1 - Adicionar itens"
						+ "\n2 - Remover Itens"
						+ "\n3 - Concluir compra");
				escolhaOpcao = leitor.nextInt();
				if (escolhaOpcao == 1)
				{
					System.out.print("\nINFORME O CÓDIGO DO PRODUTO: ");
					codProdutoCarrinho = leitor.nextInt();
					System.out.print("INFORME A QUANTIDADE: ");
					quantidadeProdutoCarrinho = leitor.nextInt();
					listaCarrinho.add(new ItemCarrinho(codProdutoCarrinho, quantidadeProdutoCarrinho));
				}
				else if (escolhaOpcao == 2)
				{
					System.out.print("\nINFORME O CÓDIGO DO PRODUTO QUE DESEJA REMOVER:");
					escolhaOpcao = leitor.nextInt();
					listaCarrinho.remove(listaCarrinho.indexOf(escolhaOpcao));
					
				}
				
				// Exibe carrinho Parcial
				System.out.println("CARRINHO ATUAL");
				System.out.println("\nCÓD. PRODUTO \t\t QUANTIDADE \t\t SUBTOTAL");
				for (ItemCarrinho listar : listaCarrinho)
				{
					System.out.println(listar.getCodProdCarrinho() + " \t\t\t\t " + listar.getQuantidadeProdutoCarrinho());
				}
				
				
			} while (escolhaOpcao != 3);
			
			// Exibe carrinho Total
			System.out.println("\nCÓD. PRODUTO \t\t QUANTIDADE \t\t TOTAL");
			for (ItemCarrinho listar : listaCarrinho)
			{
				System.out.println(listar.getQuantidadeProdutoCarrinho() + " \t\t\t\t " + listar.getCodProdCarrinho());
			}
			
			
		}
	}

}
