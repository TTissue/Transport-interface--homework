package com.transport;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("请输入出发地：");
		String start=sc.nextLine();
		System.out.println("请输入目的地：");
		String end=sc.nextLine();
		System.out.println("请输入距离（公里）：");
		double d=sc.nextDouble();
		Car car=new Car(d);
		HRailway hr=new HRailway(d);
		planet p=new planet(d);
		System.out.println("从"+start+"到"+end+"三种交通工具的时间与费用：");
		car.PriceCout();
		car.TimeCout();
		hr.PriceCout();
		hr.TimeCout();
		p.PriceCout();
		p.TimeCout();
		sc.close();
	}

}
