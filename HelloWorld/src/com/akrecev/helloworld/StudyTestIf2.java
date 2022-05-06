package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf2 {

	public static void main(String[] args) {

		int x;

		System.out.println("Лотерея! Лотерея!! Лотерея!!!");
		System.out.println("Введите число от 0 до 100");
		Scanner number = new Scanner(System.in);
		x = number.nextInt();
		number.close();
		switch (x) {
		case 4:
			System.out.println("Поздравляем! Вы выиграли сто тыщ миллионов!");
			break;
		case 10:
			System.out.println("Поздравляем! Вы выиграли тыщу миллионов!");
			break;
		case 40:
			System.out.println("Поздравляем! Вы выиграли сто миллионов!");
			break;
		case 89:
			System.out.println("Поздравляем! Вы выиграли миллион!");
			break;

		default:
			System.out.println("Не беда, попробуйте еще раз");
			break;
		}

	}

}
