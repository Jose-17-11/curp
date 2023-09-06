package com.curp.letters;

public class Excepciones {
	
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
	
	
//	Metodo que verifica que el dia del mes ingresado este dentro del rango de los dias del mes
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
	
//	Metodo que verifica que se hayan ingresado los dias de febrero si el mes seleccionado fue febrero
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
