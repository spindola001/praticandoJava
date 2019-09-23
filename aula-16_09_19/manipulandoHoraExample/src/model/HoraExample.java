package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.Timer;

public class HoraExample extends JFrame{
	JLabel horasFormato01,
		horasFormato02;
	int hh,
		mm,
		ss,
		h;
	Calendar hora;
	DecimalFormat formato;
	
	public HoraExample() {
		super("Manipulando horas em java");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		horasFormato01 = new JLabel("");
		horasFormato01.setBounds(100, 60, 280, 20);
		horasFormato02 = new JLabel("Horas em formato hh.mm.ss");
		horasFormato02.setBounds(60, 05, 280, 20);
		
			ActionListener tarefa = (new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					HORAS();
				}
			});
			
		javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
		time.start();
		
		frame.add(horasFormato01);
		frame.add(horasFormato02);
		
		setSize(300, 200);
		setVisible(true);
			
	}
	
	private void HORAS() {
		hora = Calendar.getInstance();
		hh = hora.get(Calendar.HOUR_OF_DAY);
		mm = hora.get(Calendar.MINUTE);
		ss = hora.get(Calendar.SECOND);
		formato = new DecimalFormat("00");
		horasFormato01.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
	}
	
	private String formatar (int num) {
		formato = new DecimalFormat("00");
		return formato.format(num);
	}
	
}
