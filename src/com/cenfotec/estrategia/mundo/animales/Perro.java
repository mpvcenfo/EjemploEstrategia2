package com.cenfotec.estrategia.mundo.animales;

import com.cenfotec.estrategia.mundo.conductas.IMovimiento;
import com.cenfotec.estrategia.mundo.conductas.MoverCaminando;

public class Perro implements IMoverAnimal {
	private String raza;
	IMovimiento controlMovimiento;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Perro() {
		this.controlMovimiento = new MoverCaminando();
	}

	@Override
	public void mover() {
		this.controlMovimiento.mover();
	}
}
