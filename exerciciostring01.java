package basico03;

public class exerciciostring01 {

	public static void main(String[] args) {
		//faça um programa que, a partir do texto abaixo, 
		// " texto para retirar espaços no inicio e fim" e imprima
		// o texto removendo os espaços no inicio e fim do texto.
		
		String texto = "  texto para retirar espaços inicio e fim  ";
		String resultado = texto.trim();
		System.out.println(resultado);

	}

}
