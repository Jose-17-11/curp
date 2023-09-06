package com.curp.vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Instructions extends JFrame{
//	Textos label que tendran instrucciones de cada paso
	JLabel titulo,n1,n2, n3, n4, n5, n6,n7,n8;
//	Boton que al darle click hara una accion
	JButton boton;
	
	public Instructions() {
//		Encabezado de la ventana principal
        setTitle("Instrucciones");
//		Titulo Label descriptivo
		titulo = new JLabel("Instrucciones de como ingresar los datos");
		titulo.setBounds(50,5,400,100);
		
		titulo.setFont(new Font("Courier New", Font.BOLD, 16));
		titulo.setForeground(Color.BLACK);
//		Texto label que indica las instrucciones de cada input que abra en el registro
		n1 = new JLabel("Nombre: En este apartado pondra los que es su nombre completo.");
		n1.setBounds(50, 80,600,50);
		
		n2 = new JLabel("Apellido paterno: En este apartado pondra unicamente su apellido paterno.");
		n2.setBounds(50,120,600,50);
		
		n3 = new JLabel("Apellido Materno: En este apartado pondra unicamente su apellido materno.");
		n3.setBounds(50,160,600,50);

		n4 = new JLabel("Genero: En este apartado solamente pondra su genero como: hombre o mujer.");
		n4.setBounds(50,200,600,50);

		n5 = new JLabel("Dia: Aqui pondra el dia del mes en que nacio.");
		n5.setBounds(50,240,600,50);

		n6 = new JLabel("Mes: Aqui pondra numericamente el mes en el que nacio, por ejemplo si nacio en febrero pondra 02.");
		n6.setBounds(50,280,600,50);

		n7 = new JLabel("Año: Aqui pondra el año en que nacio.");
		n7.setBounds(50,320,600,50);
//
		n8 = new JLabel("Estado: En este apartado pondra el estado donde nacion, por ejemplo puebla");
		n8.setBounds(50,360,600,50);
		
//		Boton que al darle click hara todas las acciones que se le indique
		boton = new JButton("Siguiente");
		boton.setBounds(50, 420, 100, 30);
		
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
		panel.add(boton);
//		Se genra la accion al precionar el boton
		boton.addActionListener(new ActionListener() {
//			Se crea el metodo que abrira una ventana nueva
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea una instancia del segundo JFrame donde estan los nombres prohibidos
                SegundoFrame sm = new SegundoFrame();
        		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		sm.setVisible(true);
        		sm.setBounds(600, 10,750,500);
                
            }
        });
		
    }
//	Como es la primer ventana en abrirse tendra el metodo main que declara que sea visible la ventana principal
	public static void main(String[] args) {
		Instructions sm = new Instructions();
		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sm.setVisible(true);
		sm.setBounds(10, 10,650,550);
	}
}
