package com.curp.letters;
public class Letters {
	
	public boolean vocals(char vocals) {
//		Se evaluara el parametro y si se cumplre alguno de los casos nos arrojara el valor true
		char vocal = vocals;
		switch (vocal) {
		case 'A':
			return true;
		case 'E':
			return true;
		case 'I':
			return true;
		case 'O':
			return true;
		case 'U':
			return true;
		}
//		En caso de que ningun caso se cumpla el valor sera false
		return false;
	}
	
	public boolean words(String name) {
//		Recibe 3 parametros los cuales son el nombre, apellido paterno, apellido materno
		String nameP = name;
//		Existe un array de nombres que estan prohibidos
		String [] stop = {"Aceituno", "Amilcar", "Aguinaldo", "All Power", "Anivdelarev","Batman","Benefecia","Burger King","Cacerolo",
				"Calzón","Caraciola","Espinaca","Facebook","Fulanito", "Gordonia","Gorgonio","Harry Potter","Hermione","Hitler","Hurraca","Iluminada","Indio","James Bond","Jorge Nitales",
				"Lady Di","Marciana","Masiosare","Micheline","Panuncio","Patrocinio","Petronilo","Piritipio","Pocahontas","Pomponio",
				"Privado","Procopio", "Rambo","Robocop","Rocky","Rolling Stone","Sobeida","Sol de Sonora","Sonora Querida","Terminator","Twitter",
				"Usnavy","Verulo","Virgen","Yahoo","Zoila Rosa"};
//		El atributo booleano decition inicializado en true que si se ingresa un nombre, apellido materno o apellido paterno que esten prohibidos
//		retornara un false
		boolean decition = true;
		for(int i = 0; i<stop.length; i++) {
			if(stop[i].equalsIgnoreCase(nameP)) {
				decition = false;
			}
		}
		return decition;
	}
	
	/*
	  	String [] stop = {"Aceituno", "Amilcar", "Aguinaldo", "All Power", "Anivdelarev","Batman","Benefecia","Burger King","Cacerolo",
				"Calzón","Caraciola","Espinaca","Facebook","Fulanito"};
				
		String [] stop2 = {"Gordonia","Gorgonio","Harry Potter","Hermione","Hitler","Hurraca","Iluminada","Indio","James Bond","Jorge Nitales",
				"Lady Di","Marciana","Masiosare","Micheline","Panuncio","Patrocinio","Petronilo","Piritipio","Pocahontas","Pomponio",
				"Privado","Procopio"};
				
		String [] stop3 = {"Rambo","Robocop","Rocky","Rolling Stone","Sobeida","Sol de Sonora","Sonora Querida","Terminator","Twitter",
				"Usnavy","Verulo","Virgen","Yahoo","Zoila Rosa"}; 
	 */

}
