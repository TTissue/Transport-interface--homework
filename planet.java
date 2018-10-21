package com.transport;

import java.util.Scanner;

public  class planet implements Time,Transport{
	
	public String name="飞机";
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
		System.out.println("乘坐飞机需要花费："+distance*price);
	}

	@Override
	public void TimeCout() {
		// TODO Auto-generated method stub
		double alltime=TicketTime+CheckTime+WaitTime+(distance/speed);
		System.out.println("飞机所化时间大约需："+alltime+"小时");
	}
	

}
