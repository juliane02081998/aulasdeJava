package JavaPOO;

public class ClasseTeste {

	public static void main(String[] args) {
		ClassePessoa aluno01 = new ClassePessoa();
		ClassePessoa aluno02 = new ClassePessoa();
		aluno01.nome = "Wellington";
		aluno01.comer();
		System.out.println();
		aluno01.andar();
		aluno01.falar();
		aluno01.pararDeAndar();
		aluno01.pararDeComer();
		aluno01.pararDeFalar();
		
	}

}
