package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	 int[][] matrix;
	 Scanner sc;

	public TicTacToe() {
		matrix = new int[3][3];
		sc = new Scanner(System.in);
	}

	 boolean makeMove(int x, int y, Player player) {
		if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] != 0) {
			boolean val = true;

			while (val) {
				System.out.println("invalid input");
				System.out.println("please re enter " + player);
				System.out.println("enter the x co ordinate >> ");
				x = sc.nextInt();
				System.out.println("enter the y co ordinate >> ");
				y = sc.nextInt();

				if (x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length && matrix[x][y] == 0) {
					val = false;
				}

			}

		}
		matrix[x][y] = player.getValue();
		if (isGameOver()) {
			return true;
		}
		return false;

	}

	 void printBoard() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	 boolean isGameOver() {
		int rowSum[] = new int[3];
		int colSum[] = new int[3];
		int diagSum[] = new int[2];

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				if (i == j) {
					diagSum[0] = diagSum[0] + matrix[i][j];
				}

				if ((i + j) == (matrix.length - 1)) {
					diagSum[1] = diagSum[1] + matrix[i][j];
				}

				rowSum[i] = rowSum[i] + matrix[i][j];

				colSum[j] = colSum[j] + matrix[i][j];

				if (check(rowSum) || check(colSum) || check(diagSum)) {
					return true;
				}
			}

		}
		return false;
	}

	 boolean call(Player p) {
		System.out.println("please enter " + p);
		System.out.println("enter the x co ordinate >> ");
		int x = sc.nextInt();
		System.out.println("enter the y co ordinate >> ");
		int y = sc.nextInt();
		return makeMove(x, y, p);
	}

	 boolean check(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			if (matrix[i] == 3) {
				System.out.println("P1 is the winner");
				return true;
			}

			else if (matrix[i] == -3) {
				System.out.println("P2 is the winner");
				return true;
			}

		}
		return false;
	}
}