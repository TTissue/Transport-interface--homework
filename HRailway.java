package com.transport;

public class HRailway implements Time,Transport {
	public String name="����";
	public double price=0.45;
	public double distance;
	public double TicketTime=0.01;
	public double CheckTime=0.01;
	public double WaitTime=0.01;
	public double speed=400;
	public HRailway(double distance) {
		this.distance=distance;
	}
	@Override
	public void PriceCout() {
		// TODO Auto-generated method stub
		System.out.println("����������Ҫ���ѣ�"+distance*price);
	}

	@Override
	public void TimeCout() {
		// TODO Auto-generated method stub
		double alltime=TicketTime+CheckTime+WaitTime+(distance/speed);
		System.out.println("��������ʱ���Լ�裺"+alltime+"Сʱ");
	}
	
}
