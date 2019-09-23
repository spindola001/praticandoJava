package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FuncaoSair extends JFrame{
	JButton sairBtn;
	
	public FuncaoSair() {
		super("Função sair");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		sairBtn = new JButton("SAIR");
		sairBtn.setBounds(100, 50, 100, 20);
		sairBtn.setToolTipText("Botão para sair da aplicação");
		frame.add(sairBtn);
		
		sairBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int opcao;
						 
						opcao = JOptionPane.showConfirmDialog(null, "Daseja mesmo fechar a janela?", "Fechar", JOptionPane.YES_NO_OPTION);
						
						if (opcao == JOptionPane.YES_OPTION) {
							System.exit(0);
						}
					}
				}
		);
		
		setSize(300,200);
		setVisible(true);
		
	}
}
