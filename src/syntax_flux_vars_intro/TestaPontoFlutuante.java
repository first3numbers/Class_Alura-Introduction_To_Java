package syntax_flux_vars_intro;

public class TestaPontoFlutuante {

	// learning floating point vars

	public static void main(String[] args) {

		double salario;
		salario = 1250.70;

		System.out.println("meu salário é " + salario);

		double idade = 37;

		// double vars can be used for operations
		double divisao = 3.14 / 2;
		System.out.println(divisao);

		// if result of a int is a floating point number, it will truncate it
		int OutraDivisao = 5 / 2;
		System.out.println(OutraDivisao);

		// in order for this operation to work, you have to declare the exponent as a
		// floating point number
		double NovaTentativa = 5.0 / 2;
		System.out.println(NovaTentativa);

	}

}
