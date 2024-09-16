package controller;

import br.edu.fateczl.pilhaIntString.PilhaString;

public class PalindromoController {
	public PalindromoController() {
		super();
	}
	
	public void inverterPalavra(String palavra) {
		PilhaString pilhaString = new PilhaString();
		String palavraInvertida = "";
		
		for(int i = 0; i < palavra.length(); i++) {
			String letra = "" + palavra.charAt(i);
			pilhaString.push(letra);
		}
		
		while(!pilhaString.isEmpty()) {
			try {
				palavraInvertida += pilhaString.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		if(comparaPalavras(palavra, palavraInvertida)) {
			System.out.println("A palavra " + palavra + " é um palíndromo.");
		}else {
			System.out.println("A palavra " + palavra + " não é um palíndromo.");
		}
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if(palavra.equals(palavraInvertida)) {
			return true;
		}
		return false;
	}
}
