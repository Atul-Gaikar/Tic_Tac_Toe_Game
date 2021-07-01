package com.bridgelabz.TicTacToeGame;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGameUC2 {
	private static final char empty = ' ';
	private static final char cross = 'X';
	private static final char round = 'O';
	private static char playerSymbol;
	private static char computerSymbol;

	private char[] board;

	TicTacToeGameUC2() {
		board = new char[10];
		for (int i = 0; i < board.length; i++)
			this.board[i] = empty;
	}

	private static int getIndex(int row, int col) {
		return 3 * (row - 1) + (col - 1);
	}

	public void choosePlayerSymbol(char playerSymbol) {
		if (playerSymbol == cross) {
			this.playerSymbol = cross;
			this.computerSymbol = round;
		} else if (playerSymbol == round) {
			this.playerSymbol = round;
			this.computerSymbol = round;
		} else
			System.out.println("Invalid Symbol");
	}

	public char getPlayerSymbol() {
		return playerSymbol;
	}

	public static void main(String[] args) {
		TicTacToeGameUC2 game = new TicTacToeGameUC2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a symbol X or O: ");
		String symbol = sc.next();
		game.choosePlayerSymbol(symbol.charAt(0));
		System.out.println("Player has chosen: " + game.getPlayerSymbol());

	}
}