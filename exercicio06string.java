package basico03;

public class exercicio06string {

	public static void main(String[] args) {
		String[] palavras = {"a", "vida", "é", "bela"};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palavras.length; i++) {
            String palavraMaiuscula = palavras[i].toUpperCase();
            resultado.append(palavraMaiuscula).append(" ");
        }

       String textoFinal = resultado.toString().trim();
       System.out.println(textoFinal);lç

	}

}
