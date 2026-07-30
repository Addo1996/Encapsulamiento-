package com.krakedave;

public class VehiculoTest {

    public static void main(String[] args) {

        Vehiculo v = new Vehiculo();

        System.out.println("========== Vehículo 1: Creado ==========");

        System.out.println("Año: " + v.getAnio());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());

        System.out.println("========== Vehículo 1: Valores asignados ==========");

        v.setAnio("2012");
        v.setMarca("Chevrolet");
        v.setModelo("Nuevo");

        System.out.println("Año: " + v.getAnio());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());

        System.out.println("========== Vehículo 2: Creado ==========");

        Vehiculo v2 = new Vehiculo();

        System.out.println("Año: " + v2.getAnio());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());

        System.out.println("========== Vehículo 2: Valores asignados ==========");

        v2.setAnio("2018");
        v2.setMarca("Kia");
        v2.setModelo("El más rápido");

        System.out.println("Año: " + v2.getAnio());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
        //Ejercicio de practica de Dominio de constructores
        Vehiculo v3 = new Vehiculo("Toyota");
        System.out.println("========== Vehículo 3: Valores asignados ==========");
        
        System.out.println("Año: " + v3.getAnio());
        System.out.println("Marca: " + v3.getMarca());
        System.out.println("Modelo: " + v3.getModelo());
        
        Vehiculo v4 = new Vehiculo("Toyota", "El mejor de todos los tiempos","2026" );
        System.out.println("========== Vehículo 4: Valores asignados ==========");
        System.out.println("Año: " + v4.getAnio());
        System.out.println("Marca: " + v4.getMarca());
        System.out.println("Modelo: " + v4.getModelo());
        

    }

}