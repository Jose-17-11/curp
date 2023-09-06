package reservas;
import java.util.Scanner;

import com.curp.letters.Dates;
import com.curp.letters.EntidadesAbreviadas;
import com.curp.letters.Functions;

public class Login {
	public static void main(String[] args) {
		
		Dates date = new Dates();
		String name, apellidoP, apellidoM, day, month, year, gender, state;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		name = sc.nextLine();
		System.out.println("Apellido Paterno: ");
		apellidoP = sc.nextLine();
		System.out.println("Apellido Materno: ");
		apellidoM = sc.nextLine();
		System.out.println("Dia: ");
		day = sc.nextLine();
		System.out.println("Mes: ");
		month = sc.nextLine();
		System.out.println("Año: ");
		year = sc.nextLine();
		System.out.println("Genero: ");
		gender = sc.nextLine();
		System.out.println("Estado: ");
		state = sc.nextLine();
		
		name = name.toUpperCase();
		apellidoP = apellidoP.toUpperCase();
		apellidoM = apellidoM.toUpperCase();
		gender = gender.toUpperCase();
		state = state.toLowerCase();
		
		
		date.setName(name);
		date.setApellidoP(apellidoP);
		date.setApellidoM(apellidoM);
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		date.setGender(gender);
		date.setState(state);

		Functions funcion = new Functions();
		EntidadesAbreviadas estado = new EntidadesAbreviadas();
		
		if(funcion.name(name)) {
			
			String curp = funcion.apellidoP(date.getApellidoP()) + funcion.apellidoM(date.getApellidoM()) + funcion.nameP(date.getName()) 
			+ funcion.year(date.getYear()) + date.getMonth() + date.getDay() + funcion.sexo(date.getGender()) + estado.renapo(date.getState());
			
			System.out.println("CURP: " + curp);
		}
		
		
//		System.out.println("\n" + date.getName() + "\n" + apellidoP + "\n" + apellidoM + "\n" + day + "\n" +month + "\n" +year + "\n" + gender + "\n" + state);
	}
}
