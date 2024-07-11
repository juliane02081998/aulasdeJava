package metodos;

public class calculadora {

	public static void main(String[] args) {
		CalcularMetodos calcular = new CalcularMetodos();
		int resposta =	calcular.somar(6, 3);
		int resposta2 =	calcular.multiplicar(4, 6, 10);
		int resposta3 =	calcular.subtrair(4, 6, 10);
		int resposta4 =	calcular.dividir(4, 6, 10);
			System.out.println(resposta);
			System.out.println(resposta2);
			System.out.println(resposta3);
			System.out.println(resposta4);

	}

}
