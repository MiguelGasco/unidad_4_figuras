package com.company;

public class Rectangulo {
    private double altura;
    private double ancho;

    public double Area_rectangulo(){
        return altura * ancho;
    }

    public double Perimetro_rectangulo(){
        return (ancho*2)+(altura*2);
    }

    public Rectangulo(double altura, double ancho){
        this.altura = altura;
        this.ancho = ancho;
    }
}
