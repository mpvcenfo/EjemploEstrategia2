package com.cenfotec.estrategia.mundo.conductas;

public class MoverVuelaVuela implements IMovimiento{
	@Override
	public void mover() {
		System.out.println("Vuela, Vuela, no te hace falta equipaje");
	}
}
