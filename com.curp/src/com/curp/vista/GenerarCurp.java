package com.curp.vista;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.curp.letters.Consonants;
import com.curp.letters.Dates;
import com.curp.letters.EntidadesAbreviadas;
import com.curp.letters.Excepciones;
import com.curp.letters.Functions;

	public class GenerarCurp extends JFrame{
//		Variables que tomaran el valor de los inputs
		String name, apellidoP, apellidoM, day, month, year, gender, state;
//		Textos label que diran el dato que se debe ingresar en los inputs
		JLabel titulo,n1,n2, n3, n4, n5, n6,n7,n8,res;
//		Inputs que almasenaran el dato que se les ingrese
		JTextField num1,num2, num3, num4,num5, num6, num7,num8;
//		Boton que al darle click hara una accion
		JButton boton;
		
//		Metodo principal que mostrara todo el formulario
	public GenerarCurp() { 
//		Encabezado de la ventana 
        setTitle("Generador de curp");
//		Titulo Label descriptivo
		titulo = new JLabel("Desarrollo de curp");
		titulo.setBounds(280,5,400,100);
		
		titulo.setFont(new Font("Courier New", Font.BOLD, 16));
		titulo.setForeground(Color.BLACK);
//		Texto label que indica que hay que input es
		n1 = new JLabel("Nombre");
		n1.setBounds(50, 80,200,100);
//		Input que extrae el dato que se le ingresa
		num1 = new JTextField(10);
		num1.setBounds(220,110,130,30);
		
		n2 = new JLabel("Apellido paterno");
		n2.setBounds(50,160,200,50);
		num2 = new JTextField(10);
		num2.setBounds(220,170,130,30);
		
		n3 = new JLabel("Apellido Materno");
		n3.setBounds(50,220,200,50);
		num3 = new JTextField(10);
		num3.setBounds(220,230,130,30);

		n4 = new JLabel("Genero");
		n4.setBounds(50,280,200,50);
		num4 = new JTextField(10);
		num4.setBounds(220,290,130,30);

		n5 = new JLabel("Dia de nacimiento");
		n5.setBounds(400,100,200,50);
		num5 = new JTextField(10);
		num5.setBounds(550,110,130,30);

		n6 = new JLabel("Mes de nacimiento");
		n6.setBounds(400,160,200,50);
		num6 = new JTextField(10);
		num6.setBounds(550,170,130,30);

		n7 = new JLabel("Año de nacimiento");
		n7.setBounds(400,220,200,50);
		num7 = new JTextField(10);
		num7.setBounds(550,230,130,30);
//
		n8 = new JLabel("Estado donde nacio");
		n8.setBounds(400,280,200,50);
		num8 = new JTextField(10);
		num8.setBounds(550,290,130,30);
//		Boton que al darle click hara todas las acciones que se le indique
		boton = new JButton("Calcular");
		boton.setBounds(50, 370, 100, 30);
//		variable res que almacenara el resultado final
		res = new JLabel();
		res.setBounds(200,330,500,100);
//		Se generan los paneles que estaran visibles
		Container panel = getContentPane();
		
		panel.setLayout(null);
		panel.add(titulo);
		panel.add(n1);
		panel.add(n2);
		panel.add(n3);
		panel.add(n4);
		panel.add(n5);
		panel.add(n6);
		panel.add(n7);
		panel.add(n8);
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(num4);
		panel.add(num5);
		panel.add(num6);
		panel.add(num7);
		panel.add(num8);
		panel.add(boton);
		panel.add(res);
//		Color de fondo del panel
		panel.setBackground(Color.CYAN);
//	Accion que se activara al darle click al boton calcular
	boton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {	
//		Se instancia la clase Dates
		Dates date = new Dates();
//		Las variables principales toman el valor que se ingreso a cada input
		name = num1.getText();
		apellidoP = num2.getText();
		apellidoM = num3.getText();
		gender = num4.getText();
		day = num5.getText();
		month = num6.getText();
		year = num7.getText();
		state = num8.getText();
//		El nombre, apellidos, genero y estado se convierten en mayusculas para evitar errores con respecto a la sensibilidad de mayusculas
//		o minusculas
		name = name.toUpperCase();
		apellidoP = apellidoP.toUpperCase();
		apellidoM = apellidoM.toUpperCase();
		gender = gender.toUpperCase();
		state = state.toLowerCase();
		
//		Se aplica encapsulamiento a los datos almacenandolos en otra clase con setters
		date.setName(name);
		date.setApellidoP(apellidoP);
		date.setApellidoM(apellidoM);
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		date.setGender(gender);
		date.setState(state);
//		Se instancia la clase Functions y EntidadesAbreviadas
		Functions funcion = new Functions();
		EntidadesAbreviadas estado = new EntidadesAbreviadas();
		Consonants consonants = new Consonants();
		Excepciones ex = new Excepciones();
//		Se crea una condicion para evaluar si los nombres ingresados seran permitidos o no
			if(funcion.name(name) && estado.renapo(state) != "n" 
					&& funcion.apellidoP(apellidoP) != "b" 
					&& ex.mayor(year) != "r" && ex.mayor(year) != "b" 
					&& ex.month(month) != "r" && ex.month(month) != "b" 
					&& ex.day(day) != "r" && ex.day(day) != "b" 
					&& ex.febrero(day, month) != "r"  && ex.febrero(day, month) != "b" ){
//			Se crea la ultima variable llamada curp que concatenara todas las silabas retornadas de cada funcion
			String curp = funcion.apellidoP(date.getApellidoP()) + 
						funcion.apellidoM(date.getApellidoM()) + 
						funcion.nameP(date.getName()) + 
						funcion.year(date.getYear()) + 
						date.getMonth() + date.getDay() + 
						funcion.sexo(date.getGender()) + 
						estado.renapo(date.getState()) +
						consonants.apellidos(date.getApellidoP()) +
						consonants.apellidos(date.getApellidoM()) +
						consonants.apellidos(date.getName()
								);
//						Como vimos si se cumple la condicion propuesta imprimira en pantalla el curp
						res.setText("CURP: " + curp);
			}else if(!funcion.name(name)) {
				res.setText("El nombre: " + name + " no esta permitido");
			}//			En caso de que el estado ingresado sea un estado no permitido nostrara el texto
			else if(estado.renapo(state) == "n"){
				res.setText("El estado: " + state + " no esta permitido");
			}//En caso de que el año ingresado no sea un caracter numerico mostrara el siguiente texto
			else if(funcion.apellidoP(apellidoP) == "b") {
				res.setText("ingrese un apellido paterno y no deje el apartado vacio");
			}
			// En caso de que el año ingresado no este en el rango mostrara el siguiente texto
			else if(ex.mayor(year) == "r"){
				res.setText("Debe ingresar un año que sea entre el 1900 al 2023");
			}//En caso de que el año ingresado no sea un caracter numerico mostrara el siguiente texto
			else if(ex.mayor(year) == "b") {
				res.setText("Debe ingresar un caracter numerico año");
			}else if(ex.month(month) == "r"){
				res.setText("Debe ingresar un mes que sea entre el 1 al 12");
			}//En caso de que el año ingresado no sea un caracter numerico mostrara el siguiente texto
			else if(ex.month(month) == "b") {
				res.setText("Debe ingresar un caracter numerico en el mes");
			}//Si se ingresa en el dia un dia que no sea entre el 1 y 31 retornara el siguiente texto
			else if(ex.day(day) == "r"){
				res.setText("Debe ingresar un dia que sea entre el 1 al 31");
			}//Si el dia no es un caracter numerico arrojara el siguiente texto
			else if(ex.day(day) == "b") {
				res.setText("Debe ingresar un caracter numerico en el dia");
			}//En caso de que el mes ingresado sea febrero nos indicara que el dia ingresado sea entre el 1 y el 28
			else if(ex.febrero(day, month) == "r"){
				res.setText("Debe ingresar un dia que sea entre el 1 al 28, por que ingreso el mes de febrero");
			}
				
		}
	});
	}  
}