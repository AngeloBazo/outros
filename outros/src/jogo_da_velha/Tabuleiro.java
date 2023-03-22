package jogo_da_velha;

public class Tabuleiro {

	boolean velhax = false;

	public static String linha1_0 = "1-0";
	public static String linha1_1 = "1-1";
	public static String linha1_2 = "1-2";

	public static String linha2_0 = "2-0";
	public static String linha2_1 = "2-1";
	public static String linha2_2 = "2-2";

	public static String linha3_0 = "3-0";
	public static String linha3_1 = "3-1";
	public static String linha3_2 = "3-2";

	public void tabuleiro() {

		String[] linha1 = { linha1_0, linha1_1, linha1_2 };

		System.out.print("  |  ");

		for (String linha01 : linha1) {
			System.out.print(linha01 + "  |  ");
		}

		System.out.println();
		System.out.println("____________________________");

		String[] linha2 = { linha2_0, linha2_1, linha2_2 };

		System.out.print("  |  ");
		for (String linha02 : linha2) {
			System.out.print(linha02 + "  |  ");

		}

		System.out.println();
		System.out.println("____________________________");

		String[] linha3 = { linha3_0, linha3_1, linha3_2 };
		System.out.print("  |  ");
		for (String linha03 : linha3) {
			System.out.print(linha03 + "  |  ");

		}

	}

	public void velhax() {

		if (

		linha1_0 == "x" && linha1_1 == "x" && linha1_2 == "x" || linha2_0 == "x" && linha2_1 == "x" && linha2_2 == "x"
				|| linha3_0 == "x" && linha3_1 == "x" && linha3_2 == "x" ||

				linha1_0 == "x" && linha2_0 == "x" && linha3_0 == "x"
				|| linha1_1 == "x" && linha2_1 == "x" && linha2_2 == "x"
				|| linha1_2 == "x" && linha2_2 == "x" && linha3_2 == "x" ||

				linha1_0 == "x" && linha2_1 == "x" && linha3_2 == "x"
				|| linha1_2 == "x" && linha2_1 == "x" && linha3_0 == "x"

		)

		{

			velhax = true;
			System.out.println();
			System.out.println();
			System.out.println("GANHADOR!!! - JOGADOR x");
			System.exit(0);

		}

		if (

				linha1_0 == "o" && linha1_1 == "o" && linha1_2 == "o" || linha2_0 == "o" && linha2_1 == "o" && linha2_2 == "o"
						|| linha3_0 == "o" && linha3_1 == "o" && linha3_2 == "o" ||

						linha1_0 == "o" && linha2_0 == "o" && linha3_0 == "o"
						|| linha1_1 == "o" && linha2_1 == "o" && linha2_2 == "o"
						|| linha1_2 == "o" && linha2_2 == "o" && linha3_2 == "o" ||

						linha1_0 == "o" && linha2_1 == "o" && linha3_2 == "o"
						|| linha1_2 == "o" && linha2_1 == "o" && linha3_0 == "o"

				)

				{

					velhax = true;
					System.out.println();
					System.out.println();
					System.out.println("GANHADOR!!! - JOGADOR o");
					System.exit(0);

				}
		
	}

}
