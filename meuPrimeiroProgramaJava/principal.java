
package meuPrimeiroProgramaJava;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		//Salda�ao e pergunta nome
		System.out.println("Ol� amigo!\nQual � o seu nome?");
		
		// Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Salda��o especifica
		System.out.printf("Ol� %s!\n", nome);
		in.close();

	}

}
