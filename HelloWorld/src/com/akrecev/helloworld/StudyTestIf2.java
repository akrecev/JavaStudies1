package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf2 {

	public static void main(String[] args) {

		/*
		 * // �������
		 * 
		 * int z; System.out.println("�������! �������!! �������!!!");
		 * System.out.println("������� ����� �� 0 �� 100"); Scanner number = new
		 * Scanner(System.in); z = number.nextInt(); number.close(); switch (z) { case
		 * 4: System.out.println("�����������! �� �������� ��� ��� ���������!"); break;
		 * case 10: System.out.println("�����������! �� �������� ���� ���������!");
		 * break; case 40:
		 * System.out.println("�����������! �� �������� ��� ���������!"); break; case
		 * 89: System.out.println("�����������! �� �������� �������!"); break;
		 * 
		 * default: System.out.println("�� ����, ���������� ��� ���"); break; }
		 */

		/*
		 * // ����� � ���������
		 * 
		 * int x;
		 * 
		 * System.out.println("������� ����� �����");
		 * 
		 * Scanner console = new Scanner(System.in); if (console.hasNextInt()) { x =
		 * console.nextInt(); } else { System.out.println("����� ������ �����");
		 * console.close(); return; }
		 * 
		 * if (x == 6 || x == 9) { System.out.println("����� ����� 6 ��� 9"); } else if
		 * (x > -20 && x < 100) { System.out.println("����� ������ -20 � ������ 100"); }
		 * else if (x < 100 || x > 1000) {
		 * System.out.println("x ������ 100 ��� ������ 1000"); } console.close();
		 */

		double a, b, c;
		int doubleA, doubleB, doubleC;
		
		System.out.println("������� ��� ������� �����");
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
