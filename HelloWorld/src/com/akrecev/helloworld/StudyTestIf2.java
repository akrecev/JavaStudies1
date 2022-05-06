package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf2 {

	public static void main(String[] args) {

		/*
		 * // Лотерея
		 * 
		 * int z; System.out.println("Лотерея! Лотерея!! Лотерея!!!");
		 * System.out.println("Введите число от 0 до 100"); Scanner number = new
		 * Scanner(System.in); z = number.nextInt(); number.close(); switch (z) { case
		 * 4: System.out.println("Поздравляем! Вы выиграли сто тыщ миллионов!"); break;
		 * case 10: System.out.println("Поздравляем! Вы выиграли тыщу миллионов!");
		 * break; case 40:
		 * System.out.println("Поздравляем! Вы выиграли сто миллионов!"); break; case
		 * 89: System.out.println("Поздравляем! Вы выиграли миллион!"); break;
		 * 
		 * default: System.out.println("Не беда, попробуйте еще раз"); break; }
		 */

		/*
		 * // Число в диапазоне
		 * 
		 * int x;
		 * 
		 * System.out.println("Введите целое число");
		 * 
		 * Scanner console = new Scanner(System.in); if (console.hasNextInt()) { x =
		 * console.nextInt(); } else { System.out.println("Нужно ввести число");
		 * console.close(); return; }
		 * 
		 * if (x == 6 || x == 9) { System.out.println("число равно 6 или 9"); } else if
		 * (x > -20 && x < 100) { System.out.println("число больше -20 и меньше 100"); }
		 * else if (x < 100 || x > 1000) {
		 * System.out.println("x меньше 100 или больше 1000"); } console.close();
		 */

		double a, b, c;
		int doubleA, doubleB, doubleC;
		
		System.out.println("Введите три дробных числа");
		Scanner console = new Scanner (System.in);
		a = console.nextDouble();
		b = console.nextDouble();
		c = console.nextDouble();
		
		doubleA = (int) a;
		doubleB = (int) b;
		doubleC = (int) c;
		
		System.out.println(doubleC);
		System.out.println(doubleB);
		System.out.println(doubleA);
		
		
		
		
		
	}

}
