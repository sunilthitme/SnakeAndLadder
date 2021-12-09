package com.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println("Welcome into Snake and Ladder game");
		int position=0;
		System.out.println("Your Starting position is::" + position);
		
		int Dice=(int)Math.floor(Math.random()*10)%6+1;
		System.out.println("Your Dice is :" +Dice);
		
	}

}
