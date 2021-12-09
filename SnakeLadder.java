package com.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println("Welcome into Snake and Ladder game");
		int position=0;
		System.out.println("Your Starting position is::" + position);
		
		int Die=(int)Math.floor(Math.random()*10)%6+1;
		System.out.println("Your Die is :" +Die);
		int playerCheck=(int)Math.floor(Math.random()*10)%3+1;
		
		switch (playerCheck) {
		case 1:
			System.out.println("No Play You are in the same position");
			break;
		case 2:
			position=position+Die;
			System.out.println("your position after ladder is ::" + position);
			break;
			
		case 3:
			position=position-Die;
			System.out.println("your position get back by::" + position);
			
			if (position<0) {
					  position = 0;
				  }
					 System.out.println( "Your current Position is::" + position );
				   break;
			
		}
		
	}

}
