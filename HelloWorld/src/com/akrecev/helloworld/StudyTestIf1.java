package com.akrecev.helloworld;

import java.util.Scanner;

public class StudyTestIf1 {

	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);

		System.out.println("������!");
		System.out.println("������� ����� 25*5 ?");

		int x = 0;
		x = myscan.nextInt(); // ������� int � ���������� � �������� � x

		if (x == 125) {
			System.out.println("��, ��� �����!");
		} else {
			System.out.println("���������� ����!");
		}

		System.out.println("������ ������� ��������");
		String capitalOfParaguay = myscan.next();
		if (capitalOfParaguay.equals("��������")) {
			System.out.println("�����!");
		} else {
			System.out.println("���, ���  ��������!");
		}

		System.out.println("����� ����� ����� ������ �� ���� �����?");
		String brightStar = myscan.next().toLowerCase();
		if (brightStar.equals("������")) {
			System.out.println("�����!");
		} else {
			System.out.println("��� ����� �� " + brightStar + "!");
		}

		myscan.close();

	}

}
