package com.curp.vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SegundoFrame extends JFrame{

	JLabel titulo,n1,n2, n3, n4, n5, n6;
	JButton boton;
	
	public SegundoFrame() {
//		Encabezado de la ventana 
        setTitle("Nombres prohibidos");
//		Titulo Label descriptivo
		titulo = new JLabel("Si ingresa alguno de estos nombres no se le generara el curp.");
		titulo.setBounds(50,5,650,100);
		
		titulo.setFont(new Font("Courier New", Font.BOLD, 16));
		titulo.setForeground(Color.BLACK);
//		Textos label que indica todos los nombres prohibidos para registrar 
		n1 = new JLabel("Nombres prohibidos: Aceituno, Amilcar, Aguinaldo, All Power, Anivdelarev, Batman, Benefecia, Burger King, Cacerolo,");
		n1.setBounds(50, 80,700,50);
		
		n2 = new JLabel("Calzón, Caraciola, Espinaca, Facebook ,Fulanito, Gordonia, Gorgonio, Harry Potter, Hermione, Hitler,");
		n2.setBounds(50,100,600,50);
		
		n3 = new JLabel("Hurraca, Iluminada, Indio, James Bond, Jorge Nitales, Lady Di, Marciana, Masiosare, Micheline, Panuncio,");
		n3.setBounds(50,120,600,50);
		
		n4 = new JLabel("Patrocinio, Petronilo, Piritipio, Pocahontas, Pomponio, Privado, Procopio, Rambo, Robocop, Rocky,");
		n4.setBounds(50,140,600,50);

		n5 = new JLabel("Sobeida, Sol de Sonora, Sonora Querida, Terminator, Twitter, Usnavy, Verulo, Virgen, Yahoo, Zoila Rosa.");
		n5.setBounds(50,160,600,50);

		n6 = new JLabel("Rolling Stone,");
		n6.setBounds(50,180,600,50);
		
		
//		Boton que al darle click abrira la ventana del registro para el curp
		boton = new JButton("Generar CURP");
		boton.setBounds(50, 250, 200, 30);
		
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
		panel.add(boton);
//		Se genera la accion que hara al precionar el boton
		boton.addActionListener(new ActionListener() {
//			Se crea un metodo para abrir una nueva ventana
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea una instancia del segundo JFrame
                GenerarCurp sm = new GenerarCurp();
        		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		sm.setVisible(true);
        		sm.setBounds(300, 220,750,500);
                
            }
        });
	}

}
