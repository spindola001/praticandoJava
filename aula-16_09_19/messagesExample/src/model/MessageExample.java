package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageExample extends JFrame{
	JButton erroBtn,
		informacoesBtn,
		exclamacaoBtn,
		perguntaBtn,
		nenhumBtn,
		sairBtn;
	
	public MessageExample() {
		super("Exemplo de diálogo de mensagem");
		Container frame = getContentPane();
		frame.setLayout(null);
		frame.setBackground(new Color(100, 100, 100));
		setLocationRelativeTo(null);
		setResizable(false);
		
		erroBtn = new JButton("ERRO");
		informacoesBtn = new JButton("INFORMAÇÕES");
		exclamacaoBtn = new JButton("EXCLAMAÇÃO");
		perguntaBtn = new JButton("PERGUNTA");
		nenhumBtn = new JButton("NENHUM");
		sairBtn = new JButton("SAIR");
		
		erroBtn.setBounds(75, 20, 150, 20);
		informacoesBtn.setBounds(75, 50, 150, 20);
		exclamacaoBtn.setBounds(75, 80, 150, 20);
		perguntaBtn.setBounds(75, 110, 150, 20);
		nenhumBtn.setBounds(75, 140, 150, 20);
		sairBtn.setBounds(110, 185, 80, 35);
		
		frame.add(erroBtn);
		frame.add(informacoesBtn);
		frame.add(exclamacaoBtn);
		frame.add(perguntaBtn);
		frame.add(nenhumBtn);
		frame.add(sairBtn);
		
		erroBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, 
								"Você escolheu a menssagem de erro", 
								"ERROR", 
								JOptionPane.ERROR_MESSAGE, 
								null
						);
						
					}
				}
		);
		informacoesBtn.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, 
								"Você escolheu a menssagem de informações",
								"INFORMATION",
								JOptionPane.INFORMATION_MESSAGE,
								null
						);
					}
				}
		);
		exclamacaoBtn.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, 
								"Você escolheu a menssagem de informações",
								"EXCLAMATION",
								JOptionPane.WARNING_MESSAGE,
								null
						);
					}
				}
		);
		perguntaBtn.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, 
								"Você escolheu a menssagem de pergunta",
								"QUESTION",
								JOptionPane.QUESTION_MESSAGE,
								null
						);
					}
				}
		);
		nenhumBtn.addActionListener(
				new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, 
								"Você escolheu a menssagem de nenhum",
								"NULL",
								JOptionPane.PLAIN_MESSAGE,
								null
						);
					}
				}
		);
		sairBtn.addActionListener(
				new ActionListener () {
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
		
		setSize(300, 300);
		setVisible(true);
		
	}
}
