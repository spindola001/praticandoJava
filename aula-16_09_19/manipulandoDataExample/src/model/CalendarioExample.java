package model;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class CalendarioExample extends JFrame{
	JLabel dataFormato01,
		dataFormato02;
	int ds,
		dia,
		mes,
		ano;
	Calendar data;
	String diaSemana[] = {
			"Domingo",
			"Segunda - feira",
			"Terça - feira",
			"Quarta - feira",
			"Quinta - feira",
			"Sexta - feira",
			"Sábado"
	};
	String meses[] = {
			"Janeiro",
			"Fevereiro",
			"Março",
			"Abril",
			"Maio",
			"Junho",
			"Julho",
			"Agosto",
			"Setembro",
			"Outubro",
			"Novembro",
			"Dezembro"
	};
	
	public CalendarioExample() {
		super("Exemplo de manipulação de datas");
		Container frame = getContentPane();
		frame.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		dataFormato01 = new JLabel("");
		dataFormato02 = new JLabel("");
		
		dataFormato01.setBounds(20, 30, 280, 20);
		dataFormato02.setBounds(20, 60, 280, 20);
		
		data = Calendar.getInstance();
		
		ds = data.get(Calendar.DAY_OF_WEEK);
		dia = data.get(Calendar.DAY_OF_MONTH);
		mes = data.get(Calendar.MONTH);
		ano = data.get(Calendar.YEAR);
		
		dataFormato01.setText("Data: "+ds+" "+dia+"/"+(mes+1)+"/"+ano);
		dataFormato02.setText("Data: "+diaSemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);
		
		frame.add(dataFormato01);
		frame.add(dataFormato02);
		
		setSize(350, 200);
		setVisible(true);
	}
	
}
