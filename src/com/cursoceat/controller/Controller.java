package com.cursoceat.controller;

import com.cursoceat.model.Rectangulo;
import com.cursoceat.model.Triangulo;

public class Controller {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(3, 4);
		System.out.println(t.area());
		Rectangulo r = new Rectangulo(5, 9);
		System.out.println(r.area());
	}
}
