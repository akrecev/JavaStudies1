package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("¬ведите строку");
		String s = scan.nextLine();
		System.out.println(s);
		scan.close();

	}

}
