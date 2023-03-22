package jogo_da_velha;

public class Jogo {

	public static void main(String[] args) {

		Jogador jogador = new Jogador();
		Tabuleiro t1 = new Tabuleiro();

		System.out.println("O JOGO VAI COMEÇAR:");
		System.out.println();
		t1.tabuleiro();
		System.out.println();
		System.out.println();

		do {

			jogador.jogada1();
			t1.tabuleiro();
			t1.velhax();
			
			jogador.jogada2();
			t1.tabuleiro();
			t1.velhax();

			System.out.println();
			System.out.println("-------------------------------");

		} while (!t1.velhax);

	}

}
