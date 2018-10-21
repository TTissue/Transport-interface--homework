package com.transport;

public class Car implements Time,Transport {
	public String name="汽车";
	public double price=0.32;
	public double distance;
	public double TicketTime=0.01;
	public double CheckTime=0.01;
	public double WaitTime=0.01;
	public double speed=60;
	public Car(double distance) {
		this.distance=distance;
	}
	@Override
	public void PriceCout() {
		// TODO Auto-generated method stub
		System.out.println("乘坐汽车需要花费："+distance*price);
		
	}

	@Override
	public void TimeCout() {
		// TODO Auto-generated method stub
		double alltime=TicketTime+CheckTime+WaitTime+(distance/speed);
		System.out.println("汽车所化时间大约需："+alltime+"小时");
		
	}

}
