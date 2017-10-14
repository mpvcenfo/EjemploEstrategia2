package com.cenfotec.estrategia.mundo.ejecucion;

import java.util.ArrayList;

import com.cenfotec.estrategia.mundo.animales.Aguila;
import com.cenfotec.estrategia.mundo.animales.IMoverAnimal;
import com.cenfotec.estrategia.mundo.animales.Pato;
import com.cenfotec.estrategia.mundo.animales.Perro;

public class EjecucionEjemplo {

	public static void main(String[] args) {
		ArrayList<IMoverAnimal> animalitos = new ArrayList<IMoverAnimal>();
		
		animalitos.add(new Pato());
		animalitos.add(new Perro());
		animalitos.add(new Aguila());
		
		animalitos.add(new Pato());
		animalitos.add(new Perro());
		animalitos.add(new Aguila());
		
		moverAnimalitos(animalitos);
	}

	private static void moverAnimalitos(ArrayList<IMoverAnimal> animalitos) {
		for(IMoverAnimal animalActual: animalitos) {
			animalActual.mover();
		}
	}
}
