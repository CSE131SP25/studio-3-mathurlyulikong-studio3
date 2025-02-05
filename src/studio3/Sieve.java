package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Please choose a number to find prime numbers up till: ");
		int n = in.nextInt();
		int[] array = new int [n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+2;
		}
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i]!= 0) {
				for (int j = 2; array[i]*j <= array.length + 1 ; j++) {
					array[array[i]*j - 2] = 0;
				}
			}
				
		}
		for (int i =0 ; i < array.length ; i++) {
			if (array[i] != 0) {
				System.out.println(array[i]);
			}
		}
	}

}
