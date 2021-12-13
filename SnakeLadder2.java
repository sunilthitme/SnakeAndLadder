package com.snakeladder;

public class SnakeLadder2 {
	

		public static void main(String[] args) {
			int position = 0;
			int diceRollCount = 0;
			System.out.println("Welcome into Snake and Ladder program !! ");
			System.out.println("position is " + position);
			
			Choice ch = new Choice();
			ch.playOption(position, diceRollCount);

		}
	}

	class Choice {

		public void playOption(int position, int diceRollCount) {

			while (position <= 99) {
				int diceValue = (int) (Math.random() * 10) % 6 + 1;
				int optionValue = (int) (Math.random() * 10) % 3 + 1;
				diceRollCount++;

				switch (optionValue) {
				case 1:
					System.out.println("No Play....You are in the same position");
					break;

				case 2:
					position = (position + diceValue);
					if (position > 100) {
						position = (position - diceValue);
						continue;
					}
					System.out.println("your position after ladder is :" + position);
					break;

				case 3:
					position = (position - diceValue);

					if (position < 0) {
						position = 0;
					}
					System.out.println("Your Position after snake is" + position);
					break;
				}
			}
			System.out.println("dice play number:: " + diceRollCount);
		}

	}

