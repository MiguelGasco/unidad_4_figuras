package com.company;

public class Rectangulo {
    private double altura;
    private double ancho;

    public double Area_rectangulo(){
        return altura * ancho;
    }
    
    public Rectangulo(double altura, double ancho){
        this.altura = altura;
        this.ancho = ancho;
    }
}
