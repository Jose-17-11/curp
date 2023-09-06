package com.curp.letters;
//	Datos que el usuario ingresara: Nombre completo, Apellidos: paterno, materno, dia, mes, año de nacimiento,sexo, estado de nacimiento,
public class Dates {
	private String name, apellidoP, apellidoM, day, month, year, gender, state;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	
	public String getApellidoP() {
		return apellidoP;
	}
	
	
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	
	public String getApellidoM() {
		return apellidoM;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
