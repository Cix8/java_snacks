package snack2.java;

import java.util.Scanner;
import java.util.Random;

public class MiniGame {

	public static void main(String[] args) {
		MiniGame mg = new MiniGame();
		mg.run();
	}
	
	private void run() {
		int userNumb = MiniGame.askNumb(100);
		int n = MiniGame.getRand(100);
		int numb = MiniGame.getRand(100);
		System.out.println("User = " + userNumb);
		System.out.println("CPU = " + numb);
		System.out.println("Numero da indovinare = " + n);
		int result = MiniGame.getClosest(userNumb, numb, n);
		System.out.println("Risultato: " + result);
	}
	
	public static int getClosest(int a, int b, int n) {
		int aDiff = n - a;
		int bDiff = n - b;
		aDiff = Math.abs(aDiff);
		bDiff = Math.abs(bDiff);
		if(aDiff < bDiff) {
			return 1;
		}
		if(aDiff > bDiff) {
			return -1;
		}
		return 0;
	}
	
	public static int askNumb(int max) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci un numero da 1 a " + max);
		String userNum = scan.nextLine();
		
		int result = Integer.parseInt(userNum);
		
		return result;
	}
	
	public static int getRand(int max) {
		Random rand = new Random();
		int randNum = rand.nextInt(max);
		return randNum + 1;
	}

}
