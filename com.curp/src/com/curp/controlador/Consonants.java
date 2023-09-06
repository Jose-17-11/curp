package com.curp.controlador;

public class Consonants {
//	Metodo apellidos que nos genera la consonande de cada apellido y del primer nombre
	public String apellidos(String apellido) {
//		Se instancia la clase letters
		Letters vocals = new Letters();
//		Se crea una variable que almacenara el parametro que se le ha ingresado
		String apellidoP = apellido;
//		Contador que nos indica que ya se ha extraido la consonante
		int j = 0;
//		Variable que se le asignara la consonante obtenida
		String finaly = "";
//		Se crea un arreglo de caracteres del parametro extraido
		char[] array= apellidoP.toCharArray();
//		Siclo para recorrer el array indice por indice
		for(int i = 1; i<array.length; i++) {
//			condicion que pide que mientras el indice no sea una volcal y que el contador j sea igual a cero
			if(!vocals.vocals(array[i]) && j == 0 ) {
//				Si es la consonante buscada se convertira a String y se le asignara a la variable finaly
				finaly = String.valueOf(array[i]);
//				El contador se le asigna el valor de cero para indicar que la consonante ya a sido extraida
				j = 1;
			}
		}
//		Consonante obtenida retornada
		return finaly;
	}
	
}
