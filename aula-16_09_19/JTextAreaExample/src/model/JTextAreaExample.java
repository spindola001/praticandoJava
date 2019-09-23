package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextAreaExample extends JFrame{
	JLabel enderecoLabel;
	JTextArea caixaTexto;
	JScrollPane rolagem;
	JPanel painel;
	
	public JTextAreaExample() {
		super("Exeplo de caixa de texto");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		enderecoLabel = new JLabel("Endereço");
		caixaTexto = new JTextArea(10,20);
		rolagem = new JScrollPane(caixaTexto);
		painel = new JPanel();
		
		enderecoLabel.setBounds(50, 20, 100, 20);
		painel.setBounds(40, 40, 250, 250);
		rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		painel.add(rolagem);
		
		frame.add(enderecoLabel);
		frame.add(painel);
		
		setSize(320, 280);
		setVisible(true);
	}
}
