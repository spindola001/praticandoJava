package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormulaBhaskara extends JFrame {

	JLabel valorALabel,
		valorBLabel,
		valorCLabel,
		X1Label,
		X2Label;
	JTextField valorAField,
		valorBField,
		valorCField,
		X1Field,
		X2Field;
	JButton resultadoDoCalculoBtn;
	
	public FormulaBhaskara () {
		super("Tipos de triangulo");
		Container tela = getContentPane();
		tela.setBackground(new Color(0,0,55));
		setSize(400, 400);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		valorALabel = new JLabel("Digite o valor de A:");
		valorBLabel = new JLabel("Digite o valor de B:");
		valorCLabel = new JLabel("Digite o valor de C:");
		X1Label = new JLabel("X1 = ");
		X2Label = new JLabel("X2 = ");
		valorAField = new JTextField(5);
		valorBField = new JTextField(5);
		valorCField = new JTextField(5);
		X1Field = new JTextField(5);
		X2Field = new JTextField(5);
		resultadoDoCalculoBtn = new JButton("CALCULAR");
		
		valorALabel.setBounds(25, 50, 200, 20);
		valorALabel.setForeground(new Color(255, 255, 255));
		valorAField.setBounds(225, 50, 100, 20);
		tela.add(valorALabel);
		tela.add(valorAField);
		valorBLabel.setBounds(25, 100, 200, 20);
		valorBLabel.setForeground(new Color(255, 255, 255));
		valorBField.setBounds(225, 100, 100, 20);
		tela.add(valorBLabel);
		tela.add(valorBField);
		valorCLabel.setBounds(25, 150, 200, 20);
		valorCLabel.setForeground(new Color(255, 255, 255));
		valorCField.setBounds(225, 150, 100, 20);
		tela.add(valorCLabel);
		tela.add(valorCField);
		X1Label.setBounds(25, 200, 350, 20);
		X1Field.setBounds(75, 200, 80, 20);
		X1Label.setForeground(new Color(255, 255, 255));
		tela.add(X1Label);
		tela.add(X1Field);
		X2Label.setBounds(25, 240, 350, 20);
		X2Field.setBounds(75, 240, 80, 20);
		X2Label.setForeground(new Color(255, 255, 255));
		tela.add(X2Label);
		tela.add(X2Field);
		resultadoDoCalculoBtn.setBounds(120, 290, 150, 50);
		resultadoDoCalculoBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int valorA,
							valorB,
							valorC,
							delta,
							X1,
							X2;
						
						valorA = Integer.parseInt(valorAField.getText());
						valorB = Integer.parseInt(valorBField.getText());
						valorC = Integer.parseInt(valorCField.getText());
						
						delta = (int) Math.pow(valorB, 2) - (4*valorA*valorC);
						
						X1 = (int) (-valorB + Math.sqrt(delta))/2*valorA;
						X2 = (int) (-valorB - Math.sqrt(delta))/2*valorA;
						
						Integer.toString(X1);
						Integer.toString(X2);
					
						X1Field.setText(String.valueOf(X1));
						X2Field.setText(String.valueOf(X2));
						
					}
				}
		);
		tela.add(resultadoDoCalculoBtn);
		getRootPane().setDefaultButton(resultadoDoCalculoBtn);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormulaBhaskara app = new FormulaBhaskara();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
