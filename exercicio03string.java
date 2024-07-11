package basico03;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio03string {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String texto;
		StringTokenizer exemplo = new StringTokenizer("O mundo nãoé mais o mesmo, mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());
	
	}

}
