package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf3 {

	public static void main(String[] args) {

		double a, b, c, d, result, result2, result3;
		String action;

		Scanner console = new Scanner(System.in);

		System.out.println("����� ���� ������� �����������. ������� ����������� �������. ��� ������ ������� ������� Q");
		System.out.println("������� ������ �����:");
		if (console.hasNextInt()) {
			a = console.nextInt();
			System.out.println("������� ������ �����:");
			if (console.hasNextInt()) {
				b = console.nextInt();
				System.out.println("������� ��������, ������� ��������� ��������� � ������� (+, -, *, /)");
				action = console.next();
				if (action.equals("+")) {
					result = a + b;
					System.out.println("��������� ���������� a + b = " + result);
				} else if (action.equals("-")) {
					result = a - b;
					System.out.println("��������� ���������� a - b = " + result);
				} else if (action.equals("*")) {
					result = a * b;
					System.out.println("��������� ���������� a * b = " + result);
				} else if (action.equals("/")) {
					result = a / b;
					System.out.println("��������� ���������� a / b = " + result);
				} else {
					System.out.println("����������� �������� �����������! ����� ������ ��������,"
							+ " ������� ��������� ��������� � ������� (+, -, *, /). ��������� �������.");
					console.close();
					return;
				}

				System.out.println("������� ������ ����� ��� ������� � ����������� ������� ����������");

				if (console.hasNextInt()) {
					c = console.nextInt();
					System.out.println("������� ��������, ������� ��������� ��������� (+, -, *, /)");
					action = console.next();
					if (action.equals("+")) {
						result2 = result + c;
						System.out.println("��������� ���������� - " + result2);
					} else if (action.equals("-")) {
						result2 = result - c;
						System.out.println("��������� ���������� - " + result2);
					} else if (action.equals("*")) {
						result2 = result * c;
						System.out.println("��������� ���������� - " + result2);
					} else if (action.equals("/")) {
						result2 = result / c;
						System.out.println("��������� ���������� - " + result2);
					} else {
						System.out.println("����������� �������� �����������! ����� ������ ��������,"
								+ " ������� ��������� ��������� � ������� (+, -, *, /). ��������� �������.");
						console.close();
						return;
					}

					System.out.println("������� ��������� ����� ��� ������� � ����������� ������� ����������");

					if (console.hasNextInt()) {
						d = console.nextInt();
						System.out.println("������� ��������, ������� ��������� ��������� (+, -, *, /)");
						action = console.next();
						if (action.equals("+")) {
							result3 = result2 + d;
							System.out.println("��������� ���������� - " + result3);
						} else if (action.equals("-")) {
							result3 = result2 - d;
							System.out.println("��������� ���������� - " + result3);
						} else if (action.equals("*")) {
							result3 = result2 * d;
							System.out.println("��������� ���������� - " + result3);
						} else if (action.equals("/")) {
							result3 = result2 / d;
							System.out.println("��������� ���������� - " + result3);
						} else {
							System.out.println("����������� �������� �����������! ����� ������ ��������,"
									+ " ������� ��������� ��������� � ������� (+, -, *, /). ��������� �������.");
							console.close();
							return;
						}
						console.close();
					}
				}
			}
		}

		action = console.next();
		if (action.equalsIgnoreCase("q")) {
			System.out.println("��������� �������");
			return;
		} else {
			System.out.println("����������� �������� �����������! ���������� ������ �����. ��������� �������.");
			return;
		}
	}
}
