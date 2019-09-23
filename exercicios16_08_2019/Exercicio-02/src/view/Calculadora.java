package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
	
	JLabel lable;
	JTextField input;
	JButton
		backspaceBtn,
		ce,
		n0Btn,
		n1Btn,
		n2Btn,
		n3Btn,
		n4Btn,
		n5Btn,
		n6Btn,
		n7Btn,
		n8Btn,
		n9Btn,
		pontoBtn,
		igualBtn,
		adicaoBtn,
		subtracaoBtn,
		multiplicacaoBtn,
		divisaoBtn;
	
	public Calculadora() {
		//Propriedades da janela
		super("By Marcos Davi");
		Container tela = getContentPane();
		tela.setBackground(new Color(235, 235, 235));
		setSize(350, 365);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		//---FIM---

		//Atributos que a janale irá possuir
		lable = new JLabel("Calculadora");
		input = new JTextField(20);
		backspaceBtn = new JButton("Backspace");
		ce = new JButton("CE");
		n0Btn = new JButton("0");
		n1Btn = new JButton("1");
		n2Btn = new JButton("2");
		n3Btn = new JButton("3");
		n4Btn = new JButton("4");
		n5Btn = new JButton("5");
		n6Btn = new JButton("6");
		n7Btn = new JButton("7");
		n8Btn = new JButton("8");
		n9Btn = new JButton("9");
		pontoBtn = new JButton(".");
		igualBtn = new JButton("=");
		adicaoBtn = new JButton("+");
		subtracaoBtn = new JButton("-");
		multiplicacaoBtn = new JButton("*");
		divisaoBtn = new JButton("/");
		//---FIM---

		//Definindo propriedades para os atributos da janela 
		lable.setBounds(10, 5, 100, 20);
		lable.setForeground(new Color(150, 150, 150));
		lable.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tela.add(lable);
		input.setBounds(30, 40, 290, 25);
		tela.add(input);
		backspaceBtn.setBounds(30, 80, 140, 40);
		backspaceBtn.setForeground(new Color(255, 0, 0));
		tela.add(backspaceBtn);
		ce.setBounds(180, 80, 139, 40);
		ce.setForeground(new Color(255, 0, 0));
		tela.add(ce);
		n7Btn.setBounds(30, 125, 65, 40);
		n7Btn.setForeground(new Color(0, 0, 255));
		tela.add(n7Btn);
		n8Btn.setBounds(105, 125, 65, 40);
		n8Btn.setForeground(new Color(0, 0, 255));
		tela.add(n8Btn);
		n9Btn.setBounds(180, 125, 65, 40);
		n9Btn.setForeground(new Color(0, 0, 255));
		tela.add(n9Btn);
		divisaoBtn.setBounds(254, 125, 65, 40);
		divisaoBtn.setForeground(new Color(255, 0, 0));
		tela.add(divisaoBtn);
		n4Btn.setBounds(30, 170, 65, 40);
		n4Btn.setForeground(new Color(0, 0, 255));
		tela.add(n4Btn);
		n5Btn.setBounds(105, 170, 65, 40);
		n5Btn.setForeground(new Color(0, 0, 255));
		tela.add(n5Btn);
		n6Btn.setBounds(180, 170, 65, 40);
		n6Btn.setForeground(new Color(0, 0, 255));
		tela.add(n6Btn);
		multiplicacaoBtn.setBounds(254, 170, 65, 40);
		multiplicacaoBtn.setForeground(new Color(255, 0, 0));
		tela.add(multiplicacaoBtn);
		n1Btn.setBounds(30, 215, 65, 40);
		n1Btn.setForeground(new Color(0, 0, 255));
		tela.add(n1Btn);
		n2Btn.setBounds(105, 215, 65, 40);
		n2Btn.setForeground(new Color(0, 0, 255));
		tela.add(n2Btn);
		n3Btn.setBounds(180, 215, 65, 40);
		n3Btn.setForeground(new Color(0, 0, 255));
		tela.add(n3Btn);
		subtracaoBtn.setBounds(254, 215, 65, 40);
		subtracaoBtn.setForeground(new Color(255, 0, 0));
		tela.add(subtracaoBtn);
		n0Btn.setBounds(30, 260, 65, 40);
		n0Btn.setForeground(new Color(0, 0, 255));
		tela.add(n0Btn);
		pontoBtn.setBounds(105, 260, 65, 40);
		pontoBtn.setForeground(new Color(255, 0, 0));
		tela.add(pontoBtn);
		igualBtn.setBounds(180, 260, 65, 40);
		igualBtn.setForeground(new Color(255, 0, 0));
		tela.add(igualBtn);
		adicaoBtn.setBounds(254, 260, 65, 40);
		adicaoBtn.setForeground(new Color(255, 0, 0));
		tela.add(adicaoBtn);
		//---FIM---
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora app = new Calculadora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}