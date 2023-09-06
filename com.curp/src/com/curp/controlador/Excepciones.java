package com.curp.controlador;

public class Excepciones {
//	Verifica que en caso de que el usuario deje vacio el input nombre returne b
	public String nameSpace(String name) {
		try {
			if(name.equals("")) {
				return name;
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			return "b";
		}
		return name;
	}
	
	//Metodo que verifica si el año ingresado este dentro de un rango
	public String mayor(String year) {
		try {
			int rango = Integer.parseInt(year);
			
			if(rango>=1900 && rango<=2023) {
				year = rango + "";
				return year;
			}else {
				return "r";
			}
        } catch (NumberFormatException ex) {
        	return "b";
        }	
	}
	//Verifica que el mes ingresado se encuentre en un rango de 1 a 12
	public String month(String mont) {
		try {
			int rango = Integer.parseInt(mont);
			
			if(rango>=1 && rango<=12) {
				mont = rango + "";
				return mont;
			}else {
				return "r";
			}
        } catch (NumberFormatException ex) {
        	return "b";
        }	
	}
	
	
//	Metodo que verifica que el dia este en un rango entre 1 a 31
	public String day(String day) {
		try {
			int rango = Integer.parseInt(day);
			
			if(rango>=1 && rango<=31) {
				day = rango + "";
				return day;
			}else {
				return "r";
			}
        } catch (NumberFormatException ex) {
        	return "b";
        }	
	}
	
//	Metodo que verifica que sel dia este en un rango entre 1 y 28 si se a ingresado el mes de febrero
	public String febrero(String day, String month) {
		try {
			int rango = Integer.parseInt(day);
			int months = Integer.parseInt(month);
			if(months == 2) {
				if(rango>=1 && rango<=28) {
					day = rango + "";
					return day;
				}else {
					return "r";
				}
			}return day;
			
        } catch (NumberFormatException ex) {
        	return "b";
        }	
	}
}
