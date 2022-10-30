package snack1.java;

public class Counter {

	public static void main(String[] args) {
		Counter.printCount(1235);
	}
	
	public static void printCount(int num) {
		String endStr = "cifre";
		if(num == 1) {
			endStr = "cifra";
		}
		String numStr = String.valueOf(num);
		String countStr = String.valueOf(Counter.count(num));
		System.out.println("Il numero " + numStr + " è di " + countStr + " " + endStr);
	}
	
	public static int count(int num) {
		String numStr = String.valueOf(num);
		String[] numArr = numStr.split("");
		return numArr.length;
	}

}
