package internet;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com o 1º número: ");
		int n1 = teclado.nextInt();
		System.out.println("Entre com o 2º número: ");
		int n2 = teclado.nextInt();
		System.out.println("Entre com o 3º número: ");
		int n3 = teclado.nextInt();

		int maiorNumero = 0;

		if (n1 > maiorNumero) {
			maiorNumero = n1;
		}

		if (n2 > maiorNumero) {
			maiorNumero = n2;
		}

		if (n3 > maiorNumero) {
			maiorNumero = n3;
		}

		System.out.println("O maior nº digitado foi: " + maiorNumero);

	}

}
