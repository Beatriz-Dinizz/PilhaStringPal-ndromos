package view;

import java.util.Scanner;
import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController palindromo = new PalindromoController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = ler.nextLine();
		
		palindromo.inverterPalavra(palavra);
		
		ler.close();
	}
}
