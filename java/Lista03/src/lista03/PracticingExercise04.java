package lista03;

import java.util.Scanner;

public class PracticingExercise04 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		int qtdePacientes, contadorPacientes = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
				outrosCalmos = 0, acima40Nervosos = 0, menor18Calmo = 0;
		int idade[] = new int[5];
		int sexo[] = new int[5];
		int comportamento[] = new int[5];
		
		System.out.print("Informe a quantidade de pacientes a serem avaliados: ");
		qtdePacientes = leitor.nextInt();
		
		while (contadorPacientes < qtdePacientes)
		{
			System.out.println("\nPaciente nº " + (contadorPacientes + 1) + ": ");
			System.out.print("Informe a idade: ");
			idade[contadorPacientes] = leitor.nextInt();
			System.out.print("Informe o sexo [1 - F, 2 - M, 3 - Outros]: ");
			sexo[contadorPacientes] = leitor.nextInt();
			System.out.print("Informe o comportamento [1 - Calmo, 2 - Nervoso, 3 - Agressivo]: ");
			comportamento[contadorPacientes] = leitor.nextInt();
			
			if (comportamento[contadorPacientes] == 1)
			{
				pessoasCalmas++;
			}
			if (sexo[contadorPacientes] == 1 && comportamento[contadorPacientes] == 2)
			{
				mulheresNervosas++;
			}
			if (sexo[contadorPacientes] == 2 && comportamento[contadorPacientes] == 3)
			{
				homensAgressivos++;
			}
			if (sexo[contadorPacientes] == 3 && comportamento[contadorPacientes] == 1)
			{
				outrosCalmos++;
			}
			if (idade[contadorPacientes] > 40 && comportamento[contadorPacientes] == 2)
			{
				acima40Nervosos++;
			}
			if (idade[contadorPacientes] < 18 && comportamento[contadorPacientes] == 1)
			{
				menor18Calmo++;
			}
			
			contadorPacientes++;
			
		}
		
		System.out.println("\nTotal pessoas calmas: " + pessoasCalmas);
		System.out.println("Total mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total homens agressivos: " + homensAgressivos);
		System.out.println("Total pessoas de outros sexos que são calmas: " + outrosCalmos);
		System.out.println("Total pessoas nervosas com mais de 40 anos: " + acima40Nervosos);
		System.out.println("Total pessoas calmas com menos de 18 anos: " + menor18Calmo);
	}
}
