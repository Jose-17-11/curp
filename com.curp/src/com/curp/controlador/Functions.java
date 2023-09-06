package com.curp.controlador;

public class Functions{
//	Analiza si el nombre esta prohibido
	public boolean name(String name) {
//		Se instancia la clase Letters
		Letters names = new Letters();
//		A base del parametro se crea un array de cadenas para saber si tiene uno o mas nombres
		String[] palabras = name.split(" ");
//		Se crea un ciclo for para hacer una comparacion de cada nombre
		for(int i = 0; i<palabras.length; i++) {
//			En la condicion se instancia el metodo words para comparar cada nombre con los que estan prohibidos
			if(!names.words(palabras[i])) {
//				En caso de que el nombre este prohibido retornara falso
				return false;
			}
		}
//		Si nunca hubo un nombre prohibido retornara true para indicar que todos los nombres estan permitidos
		return true;
	}
	
//	Este metodo nos brindara las dos primeras letras del CURP
	public String apellidoP(String silabaA) {

		try {
//			Se instancia la clase vocales
			Letters vocals = new Letters();
//			la variable apellido toma el valor del parametro que recibe que sera el apellido paterno
			String apellido = silabaA;
//			Para despues convertir el apellido en un array de caracteres
			char[] array = apellido.toCharArray();
//			Se sigue la regla de desarrollo de un curp que la primer letra del curp es la primer letra del apellido paterno
			char primerLetra = array[0];
//			Se crea la variable de la segunda letra
			char segundaLetra = ' ';
//			Se crea un contador para que se pueda tomar la primer vocal del apellido y no todas o la ultima
			int j = 0;
			for (int i = 1; i<array.length; i++) {
//				Condicion invocamos al metodo booleano vocals que si nos arroja un valor true podamos seguir y que el contador sea igual a cero 
				if(vocals.vocals(array[i]) && j == 0) {
//					Si ya se han cumplido todas esas condiciones la segunda letra ya toma el valor del elemento i del array
					segundaLetra = array[i];
//					Por ente el contador aumenta para que ya no se pueda volver a elegir otra vocal del apellido
					j = 1;
				}
			}

//			Por ultimo se concatena la primer letra con la segunda letra para formar una cadena que sera la primer silaba del CURP
			String resultado = String.valueOf(primerLetra) + String.valueOf(segundaLetra);
			return resultado;
		} catch (ArrayIndexOutOfBoundsException ex) {
			return "b";
		}
	}
	
//	Este metodo nos brindara el tercer caracter del CURP
	public String apellidoM(String silabaA) {
		try {
			String apellido = silabaA;
			char[] array = apellido.toCharArray();
			char primerLetra = array[0];
			String resultado = String.valueOf(primerLetra);
			return resultado;
		} catch (ArrayIndexOutOfBoundsException ex) {
			return "b";
		}
	}
//	Metodo que nos extrae la primer letra del nombre
	public String nameP(String name) {
		try {
			//A base del parametro se crea un array de cadenas para saber si tiene uno o mas nombres
			String[] palabras = name.split(" ");
//			se toma el primer nombre del cual extraeremos el caracter buscado
			String nameOne = palabras[0]; 
//			Se toma el primer nombre y se convierte en un array de caracteres
			char[] array = nameOne.toCharArray();
//			tomamos el primer caracter del nombre para que lo retorne el metodo
			String nameletter = String.valueOf(array[0]);
			return nameletter;
		} catch (ArrayIndexOutOfBoundsException ex) {
			return "b";
		}
	}
//	Metodo que nos retorna la silaba del año de nacimiento
	public String year(String year) {
		char[] array = year.toCharArray();

		String silaba = String.valueOf(array[2]) + String.valueOf(array[3]);
		return silaba;
	}
	
//	Silaba que nos retornara la letra del sexo
	public String sexo(String sex) {
		try {
			if(sex.equals("HOMBRE") || sex.equals("MUJER") || sex.equals("H") || sex.equals("M")) {
//				El sexo se convierte en un array de caracteres
				char[] array = sex.toCharArray();
//				El valor que se retornara sera la primer letra de la palabra ingresada
				String silaba = String.valueOf(array[0]);
				
				return silaba;
			}else {
				return "r";
			}
//			
		} catch (ArrayIndexOutOfBoundsException ex) {
			return "b";
		}
	}
	
	public String algoritm() {
		int num = (int) (Math.random()*9+1);
		String codigo = "a" + num;
		codigo = codigo.toUpperCase();
		return codigo;
	}
	
}


