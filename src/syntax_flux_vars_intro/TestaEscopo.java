package syntax_flux_vars_intro;

public class TestaEscopo {

	public static void main(String[] args) {

		// testing variable range

		double salario = 2150.0;
		double aliquota1 = 142;
		double aliquota2 = 350;
		double aliquota3 = 636;

		if (salario >= 1900.00 && salario <= 2800.00) {
			salario = salario - aliquota1;
			System.out.println("A sua alíquota é de 7,5%.");
			System.out.println("Você pode reduzir até RS 142.00");
		}

		if (salario >= 2800.00 && salario <= 3751.00) {
			salario = salario - aliquota2;
			System.out.println("A sua alíquota é de 15%.");
			System.out.println("Você pode reduzir até RS 350.00");
		}

		if (salario >= 3751.00 && salario <= 4664.00) {
			System.out.println("A sua alíquota é de 22,5%.");
			System.out.println("Você pode reduzir até RS 636.00");
			salario = salario - aliquota3;
		}

		if (salario >= 5000.00) {
			System.out.println("Por favor insira um valor entre R$ 1.00 e R$ 4664.00");
		}

		System.out.println("salário com IR = " + salario);
	}

}
