package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

	/*
		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor 
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("How many numbers will you type: ");
		int numb = s.nextInt();
		
		double[] vect = new double[numb];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = s.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("Values: ");
		for(double i : vect) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Sum: ");
		double sum = 0;
		for(int i = 0;i < vect.length;i++) {
			sum += vect[i];
		}
		System.out.print(sum);
		
		System.out.println();
		
		System.out.print("Average: ");
		double average = 0;
		for(int i = 0;i < vect.length;i++) {
			average += vect[i];
		}
		average = average / vect.length;
		System.out.println(average);
		
		s.close();
	}

}
