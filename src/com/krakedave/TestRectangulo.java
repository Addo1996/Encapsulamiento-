package com.krakedave;

public class TestRectangulo {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();

        System.out.println("===== Rectángulo 1: Creado =====");

        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());

        System.out.println("===== Rectángulo 1: Valores asignados =====");

        r1.setBase(8);
        r1.setAltura(10);

        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());

        int resultadoArea = r1.calcularArea();

        System.out.println("Área: " + resultadoArea);

        System.out.println();

        Rectangulo r2 = new Rectangulo();

        System.out.println("===== Rectángulo 2: Creado =====");

        System.out.println("Base: " + r2.getBase());
        System.out.println("Altura: " + r2.getAltura());

        System.out.println("===== Rectángulo 2: Valores asignados =====");

        r2.setBase(4);
        r2.setAltura(10);

        System.out.println("Base: " + r2.getBase());
        System.out.println("Altura: " + r2.getAltura());

        resultadoArea = r2.calcularArea();

        System.out.println("Área: " + resultadoArea);

    }

}
