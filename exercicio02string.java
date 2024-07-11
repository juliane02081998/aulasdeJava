package basico03;

import java.util.Scanner;

public class exercicio02string {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String texto;
		System.out.println("Digite um texto: ");
		texto = input.nextLine();
		String resultado = texto.trim();
		System.out.println(resultado);

	}

}
