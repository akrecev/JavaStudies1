package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf2 {

	public static void main(String[] args) {

		int x;

		System.out.println("�������! �������!! �������!!!");
		System.out.println("������� ����� �� 0 �� 100");
		Scanner number = new Scanner(System.in);
		x = number.nextInt();
		number.close();
		switch (x) {
		case 4:
			System.out.println("�����������! �� �������� ��� ��� ���������!");
			break;
		case 10:
			System.out.println("�����������! �� �������� ���� ���������!");
			break;
		case 40:
			System.out.println("�����������! �� �������� ��� ���������!");
			break;
		case 89:
			System.out.println("�����������! �� �������� �������!");
			break;

		default:
			System.out.println("�� ����, ���������� ��� ���");
			break;
		}

	}

}
