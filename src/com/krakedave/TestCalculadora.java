package com.krakedave;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1= new Calculadora();
		double r1;
		
		r1= c1.sumar(2, 10);
		System.out.println("Resultado :" + r1);
		
		r1= c1.restar(5, 3);
		System.out.println("Resultado :" + r1);
		
		
		

	}

}
