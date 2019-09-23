package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DadosDoTriangulo extends JFrame {
	
	JLabel lado1Label,
		lado2Label,
		lado3Label,
		retornoLabel;
	JTextField lado1Field,
		lado2Field,
		lado3Field;
	JButton retornarTrianguloBtn;
	
	public DadosDoTriangulo () {
		super("Tipos de triângulo");
		Container tela = getContentPane();
		tela.setBackground(new Color(0,0,55));
		setSize(400, 400);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		lado1Label = new JLabel("Digite o primeiro lado:");
		lado2Label = new JLabel("Digite o segundo lado:");
		lado3Label = new JLabel("Digite o terceiro lado:");
		retornoLabel = new JLabel("");
		lado1Field = new JTextField(5);
		lado2Field = new JTextField(5);
		lado3Field = new JTextField(5);
		retornarTrianguloBtn = new JButton("CALCULAR");
		
		lado1Label.setBounds(25, 50, 200, 20);
		lado1Label.setForeground(new Color(255, 255, 255));
		lado1Field.setBounds(225, 50, 100, 20);
		tela.add(lado1Label);
		tela.add(lado1Field);
		lado2Label.setBounds(25, 100, 200, 20);
		lado2Label.setForeground(new Color(255, 255, 255));
		lado2Field.setBounds(225, 100, 100, 20);
		tela.add(lado2Label);
		tela.add(lado2Field);
		lado3Label.setBounds(25, 150, 200, 20);
		lado3Label.setForeground(new Color(255, 255, 255));
		lado3Field.setBounds(225, 150, 100, 20);
		tela.add(lado3Label);
		tela.add(lado3Field);
		retornoLabel.setBounds(25, 200, 350, 20);
		retornoLabel.setForeground(new Color(255, 255, 255));
		tela.add(retornoLabel);
		retornarTrianguloBtn.setBounds(120, 250, 150, 50);
		retornarTrianguloBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int lado1,
							lado2,
							lado3;
						
						lado1 = Integer.parseInt(lado1Field.getText());
						lado2 = Integer.parseInt(lado2Field.getText());
						lado3 = Integer.parseInt(lado3Field.getText());
						
						if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1) {
							if (lado1 == lado2 && lado2 == lado3) {
								retornoLabel.setVisible(true);
								retornoLabel.setText("O triangulo é equiátero!");
							}else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
								retornoLabel.setVisible(true);
								retornoLabel.setText("O triangulo é escaleno!");
							}else {
								retornoLabel.setVisible(true);
								retornoLabel.setText("O triangulo é isóceles!");
							}
						}else {
							retornoLabel.setVisible(true);
							retornoLabel.setText("Os valores informados não formam um triângulo!");
						}
					}
				}
		);
		getRootPane().setDefaultButton(retornarTrianguloBtn);
		tela.add(retornarTrianguloBtn);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DadosDoTriangulo app = new DadosDoTriangulo();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
