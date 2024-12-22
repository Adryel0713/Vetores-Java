package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	/*
		Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		bem como os nomes dessas pessoas caso houver. 

	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int num = s.nextInt();
		
		String[] name = new String[num];
		int[] old = new int[num];
		double[] height = new double[num];
		s.nextLine();
		
		double sum = 0;
		double totalHeight = 0;
		double minors = 0;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println("Dados da " +(i+1)+"° pessoa:");
			System.out.print("Nome: ");
			name[i] = s.nextLine();
			System.out.print("Idade: ");
			old[i] = s.nextInt();
			System.out.print("Altura: ");
			height[i] = s.nextDouble();
			s.nextLine();
		}
		for(int i = 0; i < name.length; i++) {
			if(old[i] < 16) {
				sum++;
			}
			totalHeight = totalHeight + height[i];
		}
		minors = sum * 100.0 / num;
		
		System.out.printf("Altura média: %.2f\n",(totalHeight/num));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",minors);
		
		for(int i = 0; i < num ; i++) {
			if(old[i] < 16) {
				System.out.println(name[i]);
			}
		}
		s.close();
	}

}
