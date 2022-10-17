package cokingPlant.cokeRun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getCokingTimeFromInput;
		int getCokingOvenAmountFromInput;
		
		System.out.println("Coke is flowing?");
		try {
			System.out.println("Please input coking time in full hous");
			getCokingTimeFromInput = input.nextInt();
			System.out.println("Please input amount of ovens participating");
			getCokingOvenAmountFromInput = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("To sie pierdol");
			input.close();
			return;
		}
		CokeOutput smelt = new CokeOutput();
		System.out.println(
				"Amount of coke produced in a day is : "
				+ smelt.ProcessCokeDefaultOven(getCokingTimeFromInput, getCokingOvenAmountFromInput));
		input.close();
	}
	
	// Checking for changes?

}
