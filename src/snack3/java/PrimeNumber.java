package snack3.java;

import snack2.java.MiniGame;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = MiniGame.getRand(100);
		PrimeNumber.consoleResponse(PrimeNumber.isPrimeNumber(num), num);
	}
	
	public static void consoleResponse(boolean condition, int num) {
		if(condition) {
			System.out.println(num + " è un numero primo!");
		} else {
			System.out.println(num+ " non è un numero primo!");
		}
	}
	
	public static boolean isPrimeNumber(int number) {
		if(number == 0) {
			return false;
		}
		for (int i = 2; i < number; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
		return true;
	}

}
