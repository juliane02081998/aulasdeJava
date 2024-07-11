package metodos;

public class Carros {
	String cor;
	String modelo;
	double valor;
	boolean estado;
	
	public Carros() {
		
	}
	public Carros(String cor) {
		this.cor = cor;
	}
	public void Modelo(String modelo) {
		this.modelo = modelo;
	}
	public void Valor(double valor) {
		this.valor = valor;
	}
	public void Ligar() {
		if (estado ==false) {
		estado = true;
		System.out.println("Carro ligado com sucesso" );
		}else {
			System.out.println("o carro ja encontra-se ligado");
		}
	}
	
	
		public void Desligar() {
			if (estado ==true) {
				estado = false;
			System.out.println("Carro desligado com sucesso" );
			}else {
				System.out.println("o carro ja encontra-se desligado");
			}
		}
		public void Status() {
	        if (estado == true) {
	            System.out.println("o carro esta ligado");
	        } else {
	            System.out.println("o carro esta desligado");
	        }

}
	}
