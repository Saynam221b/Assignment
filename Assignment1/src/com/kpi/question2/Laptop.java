package com.kpi.question2;

public class Laptop implements Screen, Processor, Os {


	@Override
	public int macVersion() {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public int windowsVersion() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int linuxVersion() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public String procType() {
		// TODO Auto-generated method stub
		return "intel";
	}

	@Override
	public int processorBit() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public int sizeOfScreen() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String typeOfScreen() {
		// TODO Auto-generated method stub
		return "amoled";
	}

	public static void main(String[] args) {
		Laptop obj = new Laptop();
		System.out.println(obj.linuxVersion()); 
		System.out.println(obj.processorBit()); 
		System.out.println(obj.sizeOfScreen());
		System.out.println(obj.procType()); 
		
	}
}
