package com.curp.controlador;

public class EntidadesAbreviadas {
	
	public String renapo(String state) {
		
		switch(state) {
		case "aguascalientes":
			return "AS";
		case "baja california":
			return "BC";
		case "baja california sur":
			return "BS";
		case "campeche":
			return "CC";
		case "chiapas":
			return "CS";
		case "chihuahua":
			return "CH";
		case "ciudad de mexico":
			return "DF";
		case "coahuila":
			return "CL";
		case "colima":
			return "CM";
		case "durango":
			return "DG";
		case "guanajuato":
			return "GT";
		case "guerrero":
			return "GR";
		case "hidalgo":
			return "HG";
		case "jalisco":
			return "JC";
		case "mexico":
			return "MC";
		case "michoacan":
			return "MN";
		case "morelos":
			return "MS";
		case "nayarit":
			return "NT";
		case "nuevo leon":
			return "NL";
		case "oaxaca":
			return "OC";
		case "puebla":
			return "PL";
		case "queretaro":
			return "QR";
		case "san luis potosi":
			return "SP";
		case "sinaloa":
			return "SL";
		case "sonora":
			return "SR";
		case "tabasco":
			return "TC";
		case "tamaulipas":
			return "TS";
		case "tlaxcala":
			return "TL";
		case "veracruz":
			return "VZ";
		case "yucatan":
			return "YN";
		case "zacatecas":
			return "ZS";
		default:
			return "n";
		}
	}
}
