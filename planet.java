package com.transport;

import java.util.Scanner;

public  class planet implements Time,Transport{
	
	public String name="�ɻ�";
	public double price=0.75;
	public double distance;
	public double TicketTime=0.02;
	public double CheckTime=0.02;
	public double WaitTime=0.02;
	public double speed=800;
	public planet(double distance) {
		this.distance=distance;
		
	}

	@Override
	public void PriceCout() {
		// TODO Auto-generated method stub
		System.out.println("�����ɻ���Ҫ���ѣ�"+distance*price);
	}

	@Override
	public void TimeCout() {
		// TODO Auto-generated method stub
		double alltime=TicketTime+CheckTime+WaitTime+(distance/speed);
		System.out.println("�ɻ�����ʱ���Լ�裺"+alltime+"Сʱ");
	}
	

}
