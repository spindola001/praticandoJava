package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputDialogExample extends JFrame{
	JButton sairBtn;
	String nome;
	JLabel nomeLabel;
	
	public InputDialogExample() {
		super("Dialogo de entrada");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		nomeLabel = new JLabel("");
		sairBtn = new JButton("SAIR");
		
		nomeLabel.setBounds(10, 40, 350, 20);
		sairBtn.setBounds(100, 90, 100, 20);
		sairBtn.setToolTipText("Bot�o que sai da aplica��o");
		nomeLabel.setText("O nome digitado foi: " + nome.toUpperCase());
		frame.add(nomeLabel);
		frame.add(sairBtn);
		
		sairBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int opcao;
						Object [] botoes = {
								"Sim", "Não"
						};
						opcao = JOptionPane.showOptionDialog(null, 
									"Deseja mesmo fechar a janela?", 
									"Fechar", JOptionPane.YES_NO_OPTION, 
									JOptionPane.QUESTION_MESSAGE, 
									null,
									botoes,
									botoes[0]
								);
						if (opcao == JOptionPane.YES_OPTION) {
							System.exit(0);
						}
					}
				}
		);
		
		setSize(300, 200);
		setVisible(true);
	}
}
