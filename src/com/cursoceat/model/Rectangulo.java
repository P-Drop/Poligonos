package com.cursoceat.model;

public class Rectangulo extends Poligono{

	public Rectangulo(double base, double altura) {
		super(base, altura);
	}
	@Override
	public double area() {
		double s = super.altura * super.base;
		return s;
	}
}
