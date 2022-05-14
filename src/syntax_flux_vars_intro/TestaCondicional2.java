package syntax_flux_vars_intro;

public class TestaCondicional2 {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = true;

		if (idade >= 18 || quantidadePessoas >= 2 && acompanhado == true) {
			System.out.println("você tem mais de 18 anos.");
		} else {
			System.out.println("você não pode entrar");
		}

	}

}
