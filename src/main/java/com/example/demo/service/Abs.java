package com.example.demo.service;

public class Abs {

public static void main(String[] args) {
//	Integer y = 2; 
//	int x = y%2 == 0 ? 10.0 : 2;
//	
	
	int y = 4; 
	String x = "2" + y;
	Abs.imp(10);
}


public static void imp(Integer i ) {
	System.out.println("Integer" + i);
}

public static void imp(float i ) {
	System.out.println("float" + i);
}

public static void imp(long i ) {
	System.out.println("long" + i);
}
}
