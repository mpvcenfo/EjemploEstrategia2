package com.cenfotec.estrategia.mundo.animales;

import com.cenfotec.estrategia.mundo.conductas.IMovimiento;
import com.cenfotec.estrategia.mundo.conductas.MoverNadando;

public class Pato implements IMoverAnimal {
	private String color;
	IMovimiento controlMovimiento;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pato() {
		this.controlMovimiento = new MoverNadando();
	}

	@Override
	public void mover() {
		this.controlMovimiento.mover();
	}	
}
