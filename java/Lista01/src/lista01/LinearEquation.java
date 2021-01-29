package lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LinearEquation 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Informe A: ");
		a = entrada.nextDouble();
		System.out.print("Informe B: ");
		b = entrada.nextDouble();
		System.out.print("Informe C: ");
		c = entrada.nextDouble();
		System.out.print("Informe D: ");
		d = entrada.nextDouble();
		System.out.print("Informe E: ");
		e = entrada.nextDouble();
		System.out.print("Informe F: ");
		f = entrada.nextDouble();
		
		x = ((c * e) - (b - f)) / ((a * e) - (b * d));
		y = ((a * f) - (c - d)) / ((a * e) - (b * d));
		
		System.out.printf("O resultado de X: " + formatar.format(x) + " e Y: " + formatar.format(y));
	}
}
