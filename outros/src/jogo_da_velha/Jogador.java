package jogo_da_velha;

import java.util.Scanner;

public class Jogador {

	public String x;
	public String o;

	Scanner teclado = new Scanner(System.in);

	public void jogada1() {

		System.out.print("Jogador 01 (x) - digite a casa: ");
		System.out.println();

		x = teclado.nextLine();

		if (x.equalsIgnoreCase(Tabuleiro.linha1_0)) {
			Tabuleiro.linha1_0 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha1_1)) {
			Tabuleiro.linha1_1 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha1_2)) {
			Tabuleiro.linha1_2 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha2_0)) {
			Tabuleiro.linha2_0 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha2_1)) {
			Tabuleiro.linha2_1 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha2_2)) {
			Tabuleiro.linha2_2 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha3_0)) {
			Tabuleiro.linha3_0 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha3_1)) {
			Tabuleiro.linha3_1 = "x";
		}

		else if (x.equalsIgnoreCase(Tabuleiro.linha3_2)) {
			Tabuleiro.linha3_2 = "x";
		}

		else {
			System.out.println("!!!! casa inexistente - programa finalizado !!!");
			System.exit(0);
		}

	}

	public void jogada2() {

		System.out.println();
		System.out.println();
		System.out.print("Jogador 02 (o) - digite a casa: ");
		System.out.println();

		o = teclado.nextLine();

		if (o.equalsIgnoreCase(Tabuleiro.linha1_0)) {
			Tabuleiro.linha1_0 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha1_1)) {
			Tabuleiro.linha1_1 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha1_2)) {
			Tabuleiro.linha1_2 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha2_0)) {
			Tabuleiro.linha2_0 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha2_1)) {
			Tabuleiro.linha2_1 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha2_2)) {
			Tabuleiro.linha2_2 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha3_0)) {
			Tabuleiro.linha3_0 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha3_1)) {
			Tabuleiro.linha3_1 = "o";
		}

		else if (o.equalsIgnoreCase(Tabuleiro.linha3_2)) {
			Tabuleiro.linha3_2 = "o";
		} else {
			System.out.println("!!!! casa inexistente - programa finalizado !!!");
			System.exit(0);
		}

	}

}
