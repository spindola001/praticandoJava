package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
	
	JButton somarBtn,
		subtrairBtn,
		dividirBtn,
		multiplicarBtn;
	JLabel num1Text,
		num2Text,
		exibirText;
	JTextField num1Field,
		num2Field;
	ImageIcon soma,
		subtracao,
		divisao,
		multiplicacao;
	
	public Calculadora() {
		
		super("Calculadora básica");
		Container tela = getContentPane();
		setSize(470, 250);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		somarBtn = new JButton("SOMA");
		subtrairBtn = new JButton("SUBTRAIR");
		dividirBtn = new JButton("DIVIDIR");
		multiplicarBtn = new JButton("MULTIPLICAR");
		num1Text = new JLabel("1º número:");
		num2Text = new JLabel("2º número:");
		exibirText = new JLabel("");
		num1Field = new JTextField(5);
		num2Field = new JTextField(5);
		/*soma = new ImageIcon("iconSoma.png");
		subtracao = new ImageIcon("iconSubtrair.png");
		divisao = new ImageIcon("iconDivisao.png");
		multiplicacao = new ImageIcon("iconMultiplicacao.png");*/
		
		num1Text.setBounds(120, 30, 100, 20);
		num1Field.setBounds(220, 30, 100, 25);
		tela.add(num1Text);
		tela.add(num1Field);
		num2Text.setBounds(120,	70, 100, 20);
		num2Field.setBounds(220, 70, 100, 25);
		tela.add(num2Text);
		tela.add(num2Field);
		somarBtn.setBounds(10, 130, 100, 30);
		somarBtn.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						float num1,
							num2,
							resultado;
						
						resultado = 0;
						
						num1 = Float.parseFloat(num1Field.getText());
						num2 = Float.parseFloat(num2Field.getText());
						
						resultado = num1 + num2;
						
						exibirText.setVisible(true);
						exibirText.setText("O resultado é: " + resultado);
					}
				}
		);
		exibirText.setVisible(false);
		tela.add(somarBtn);
		subtrairBtn.setBounds(115, 130, 100, 30);
		subtrairBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float num1,
							num2,
							resultado;
						
						resultado = 0;
						
						num1 = Float.parseFloat(num1Field.getText());
						num2 = Float.parseFloat(num2Field.getText());
						
						resultado = num1 - num2;
						
						exibirText.setVisible(true);
						exibirText.setText("O resultado é: " + resultado);
					}
				}
		);
		exibirText.setVisible(false);
		tela.add(subtrairBtn);
		dividirBtn.setBounds(220, 130, 100, 30);
		dividirBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float num1,
							num2,
							resultado;
						
						resultado = 0;
						
						num1 = Float.parseFloat(num1Field.getText());
						num2 = Float.parseFloat(num2Field.getText());
						
						resultado = num1 / num2;
						
						exibirText.setVisible(true);
						exibirText.setText("O resultado é: " + resultado);
					}
				}
		);
		exibirText.setVisible(false);
		tela.add(dividirBtn);
		multiplicarBtn.setBounds(325, 130, 130, 30);
		multiplicarBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float num1,
							num2,
							resultado;
						
						resultado = 0;
						
						num1 = Float.parseFloat(num1Field.getText());
						num2 = Float.parseFloat(num2Field.getText());
						
						resultado = num1 * num2;
						
						exibirText.setVisible(true);
						exibirText.setText("O resultado é: " + resultado);
					}
				}
		);
		tela.add(multiplicarBtn);
		exibirText.setBounds(170, 170, 150, 20);
		tela.add(exibirText);
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora app = new Calculadora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
