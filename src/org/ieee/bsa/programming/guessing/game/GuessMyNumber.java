package org.ieee.bsa.programming.guessing.game;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SecureRandom random = new SecureRandom();

		int choice = random.nextInt(100);
		
		System.out.println("I am guessing a number between 1 and 100");
		System.out.println("Your guess: ");
		
		int guess = -1;
		
		do {
			guess = scanner.nextInt();
		
			if (choice == guess) {
				System.out.println("Congratulations you got it!!!");
			}
			else if (guess < choice){
				System.out.println("Try higher");
			}
			else {
				System.out.println("Try lower");
			}
		}
		
		while (guess != choice);
		
		scanner.close();
	}

}
