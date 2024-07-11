package JavaPOO;

public class ClassePessoa {
	String nome;
	boolean estaComendo;
    boolean estaAndando;
    boolean estaFalando;
	
    public void comer() {
        if (!estaComendo && !estaAndando && !estaFalando) {
            System.out.printf("%s começou a comer\n", nome);
            estaComendo = true;
        } else {
            System.out.printf("%s pare de comer e\n", nome);
        }
	}
	public void andar() {
		 if (!estaAndando && !estaComendo && !estaFalando) {
	            System.out.printf("%s começou a andar\n", nome);
	            estaAndando = true;
	        } else {
	            System.out.printf("%s já está ocupado com outra atividade\n", nome);
	        }
	}
		 public void falar() {
		        if (!estaFalando && !estaComendo && !estaAndando) {
		            System.out.printf("%s começou a falar\n", nome);
		            estaFalando = true;
		        } else {
		            System.out.printf("%s já está ocupado com outra atividade\n", nome);
		        }
	}public void pararDeComer() {
	        if (estaComendo) {
	            System.out.printf("%s parou de comer\n", nome);
	            estaComendo = false;
	        } else {
	            System.out.printf("%s não está comendo\n", nome);
	        }
		
	}
		 public void pararDeAndar() {
		        if (estaAndando) {
		            System.out.printf("%s parou de andar\n", nome);
		            estaAndando = false;
		        } else {
		            System.out.printf("%s não está andando\n", nome);
		        }
	}
		public void pararDeFalar() {
	        if (estaFalando) {
	            System.out.printf("%s parou de falar\n", nome);
	            estaFalando = false;
	        } else {
	            System.out.printf("%s não está falando\n", nome);
	        }
	}
}
