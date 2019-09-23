package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DadosParaCalculo extends JFrame {

	JLabel num01Label,
		num02Label,
		num03Label,
		num04Label,
		mediaLabel;
	JTextField num01Field,
		num02Field,
		num03Field,
		num04Field;
	JButton mostrarMediaBtn;
	
	public DadosParaCalculo() {
		
		super("Média entre quatro valores");
		Container tela = getContentPane();
		setSize(450, 450);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		num01Label = new JLabel("Digite o primerio número:");
		num02Label = new JLabel("Digite o segundo número:");
		num03Label = new JLabel("Digite o terceiro número:");
		num04Label = new JLabel("Digite o quarto número:");
		mediaLabel = new JLabel("");
		num01Field = new JTextField(5);
		num02Field = new JTextField(5);
		num03Field = new JTextField(5);
		num04Field = new JTextField(5);
		mostrarMediaBtn = new JButton("MOSTRAR MÉDIA");
		
		num01Label.setBounds(25, 50, 200, 20);
		num01Field.setBounds(240, 50, 150, 20);
		tela.add(num01Label);
		tela.add(num01Field);
		num02Label.setBounds(25, 100, 200, 20);
		num02Field.setBounds(240, 100, 150, 20);
		tela.add(num02Label);
		tela.add(num02Field);
		num03Label.setBounds(25, 150, 200, 20);
		num03Field.setBounds(240,150, 150, 20);
		tela.add(num03Label);
		tela.add(num03Field);
		num04Label.setBounds(25, 200, 200, 20);
		num04Field.setBounds(240, 200, 150, 20);
		tela.add(num04Label);
		tela.add(num04Field);
		mediaLabel.setBounds(75, 250, 300, 20);
		tela.add(mediaLabel);
		mostrarMediaBtn.setBounds(135, 300, 150, 40);
		mostrarMediaBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int num01,
							num02,
							num03,
							num04,
							media;
						
						media = 0;
						
						num01 = Integer.parseInt(num01Field.getText());
						num02 = Integer.parseInt(num02Field.getText());
						num03 = Integer.parseInt(num03Field.getText());
						num04 = Integer.parseInt(num04Field.getText());
						
						media = (num01 + num02 + num03 + num04)/4;
						mediaLabel.setVisible(true);
						mediaLabel.setText("A média entre os valores informados é: " + media);
					}
				}
		);
		getRootPane().setDefaultButton(mostrarMediaBtn);
		tela.add(mostrarMediaBtn);
		
		setVisible(true);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DadosParaCalculo app = new DadosParaCalculo();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
