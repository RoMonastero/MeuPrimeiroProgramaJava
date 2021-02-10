
package meuPrimeiroProgramaJava;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		//Saldaçao e pergunta nome
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		// Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Saldação especifica para o nome lido
		System.out.printf("Olá %s!\n", nome);
		in.close();

	}

}
