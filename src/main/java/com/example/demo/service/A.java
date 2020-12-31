package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		A a = new B();
		B b = new C();
		a = b;
		a.imprimir();
		try {
			List<String> cadenas =  new ArrayList<String>();
			cadenas.add("1");
			cadenas.add("2");
			cadenas.add("3");
			
			for (int i = 0; i < 4; i++) {
				System.out.println(cadenas.get(i));
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("i");
		}	
		catch(Exception ex) {
			System.out.println("ix");
		
		} finally {
		System.out.println("f");
			// TODO: handle finally clause
		}
		
	}
	
	
	public void imprimir() {
		System.out.println("A");
	}
	

	
	
}


