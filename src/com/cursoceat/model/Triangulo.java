package com.cursoceat.model;

public class Triangulo extends Poligono{

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		double s = super.base*super.altura/2;
		return s;
	}
}
