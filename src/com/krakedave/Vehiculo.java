package com.krakedave;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String anio;
    private double valor;

    // Constructor vacío
    public Vehiculo() {
    	
    }
    // Constructor con un solo parametro
    public Vehiculo(String marca) {
    	this.marca= marca;
    }
    // Constructor con varios 3 parametros
    public Vehiculo(String marca, String modelo, String anio) {
    	this.marca = marca;
    	this.modelo = modelo;
    	this.anio = anio;
    	
    }

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo, String anio, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}