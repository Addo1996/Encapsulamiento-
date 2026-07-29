package com.krakedave;

public class TestFecha {

	public static void main(String[] args) {
		
		Fecha f1= new Fecha();
	
		f1.setAnio(2026);
		f1.setMes(02);
		f1.setDia(23);
		
		System.out.println("Año: " + f1.getAnio() + "Mes :" + f1.getMes() + "Dia :" + f1.getDia());
	}

}
