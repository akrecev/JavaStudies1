package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf1 {

	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);

		System.out.println("Привет!");
		System.out.println("Сколько будет 25*5 ?");

		int x = 0;
		x = myscan.nextInt(); // считать int с клавиатуры и записать в x

		if (x == 125) {
			System.out.println("Да, это круто!");
		} else {
			System.out.println("Абсолютная ложь!");
		}

		System.out.println("Назови столицу Парагвая");
		String capitalOfParaguay = myscan.next();
		if (capitalOfParaguay.equals("Асунсьон")) {
			System.out.println("Верно!");
		} else {
			System.out.println("Нет, это Асунсьон!");
		}

		System.out.println("Какая самая яркая звезда на небе ночью?");
		String brightStar = myscan.next().toLowerCase();
		if (brightStar.equals("сириус")) {
			System.out.println("Точно!");
		} else {
			System.out.println("Это точно не " + brightStar + "!");
		}

		myscan.close();

	}

}
