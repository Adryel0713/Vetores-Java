package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
	
	/*
		Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("how many numbers you gonna type? ");
		int numb = s.nextInt();
		
		int[] vect = new int[numb];
		
		for(int i = 0; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = s.nextInt();
		}
		
		System.out.println("Negative Numbers: ");
		
		for(int i : vect) {
			if(i < 0)
			System.out.println(i);
		}
		
		
		s.close();
	}

}
