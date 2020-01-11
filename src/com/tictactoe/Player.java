package com.tictactoe;

public enum Player {
	
	P1(1),P2(-1); 
	
	private int playerNumber;

	Player(int playerNumber) {
		this.playerNumber=playerNumber;
	}
	
	public int getValue() {
		return this.playerNumber;
	}
}
