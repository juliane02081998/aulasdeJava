package metodos;

public class Aplicacao {

	public static void main(String[] args) {
		Carros c1 =new Carros();
		Carros c2 =new Carros("azul");
		c1.cor="preto";
		c1.modelo="";
		c2.modelo = "Fiat Toro";
		c2.cor="Azul";
		c2.valor= 135.000;
		c1.modelo = "Hilux";
		c1.valor = 150.000;
		
		System.out.printf("O carro modelo: %s é %S e custa %.3f",c1.modelo, c1.cor, c1.valor);
		System.out.println();
		System.out.printf("O carro modelo: %s é %S e custa %.3f",c2.modelo, c2.cor,c2.valor);
		System.out.println();
		c1.Ligar();
		c2.Ligar();
		c1.Desligar();
		c1.Status();
		
	}
	

}
