package com.transport;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("����������أ�");
		String start=sc.nextLine();
		System.out.println("������Ŀ�ĵأ�");
		String end=sc.nextLine();
		System.out.println("��������루�����");
		double d=sc.nextDouble();
		Car car=new Car(d);
		HRailway hr=new HRailway(d);
		planet p=new planet(d);
		System.out.println("��"+start+"��"+end+"���ֽ�ͨ���ߵ�ʱ������ã�");
		car.PriceCout();
		car.TimeCout();
		hr.PriceCout();
		hr.TimeCout();
		p.PriceCout();
		p.TimeCout();
		sc.close();
	}

}
