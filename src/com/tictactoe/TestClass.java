package com.tictactoe;

public class TestClass {
	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe();
		int max = 9;
		int init = 1;
		boolean finalVal = false;
		do {
			if (init % 2 == 1) {
				finalVal = ticTacToe.call(Player.P1);
			} else {
				finalVal = ticTacToe.call(Player.P2);
			}
			init = init + 1;
			ticTacToe.printBoard();
		} while (init <= max && finalVal == false);
	}
}
