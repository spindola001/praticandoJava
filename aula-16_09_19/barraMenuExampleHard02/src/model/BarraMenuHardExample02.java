package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarraMenuHardExample02 extends JFrame{
	JMenuBar barraMenu;
	JMenu opcoesMenu,
		fonteMenu,
		corMenu,
		estiloMenu,
		tamanhoMenu;
	JMenuItem limparItem,
		sairItem,
		azulItem,
		verdeItem,
		vermelhoItem,
		amareloItem,
		pretoItem;
	JCheckBoxMenuItem estiloFonte[];
	ButtonGroup tamanhoGroup,
		estiloGroup;
	JRadioButtonMenuItem tamanhoFonte[];
	String tamanho[] = {
			"12",
			"14",
			"16",
			"18"
	};
	String estilo[] = {
		"Normal",
		"Negrito",
		"Itálico",
		"Negrito e Itálico"
	};
	JTextArea caixaTexto;
	JPanel painel;
	JScrollPane rolagem;
	int fonteTamanho,
		fonteEstilo;
	
	public BarraMenuHardExample02(){
		super("Exemplo de menu mais avançado 02");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		fonteTamanho = 12;
		fonteEstilo = Font.PLAIN;
		
		barraMenu = new JMenuBar();
		opcoesMenu = new JMenu("Opções");
		corMenu = new JMenu("Cor");
		fonteMenu = new JMenu("Fonte");
		estiloMenu = new JMenu("Estilo");
		tamanhoMenu = new JMenu("Tamanho");
		limparItem = new JMenuItem("Limpar");
		sairItem = new JMenuItem("SAIR");
		azulItem = new JMenuItem("Azul");
		verdeItem = new JMenuItem("Verde");
		vermelhoItem = new JMenuItem("Vermelho");
		amareloItem = new JMenuItem("Amarelo");
		pretoItem = new JMenuItem("Preto");
		estiloFonte = new JCheckBoxMenuItem[4];
		tamanhoFonte = new JRadioButtonMenuItem[4];
		estiloGroup = new ButtonGroup();
		tamanhoGroup = new ButtonGroup();
		caixaTexto = new JTextArea(10,20);
		rolagem = new JScrollPane(caixaTexto);
		painel = new JPanel();
		TratadorEstilo est = new TratadorEstilo();
		TratadorTamanho tam = new TratadorTamanho();
		for(int i=0; i < 4; i++) {
			estiloFonte[i] = new JCheckBoxMenuItem(estilo[i]);
			estiloMenu.add(estiloFonte[i]);
			estiloGroup.add(estiloFonte[i]);
			estiloFonte[i].addItemListener(est);
		}
		for(int i=0; i < 4; i++) {
			tamanhoFonte[i] = new JRadioButtonMenuItem(tamanho[i]);
			tamanhoMenu.add(tamanhoFonte[i]);
			tamanhoGroup.add(tamanhoFonte[i]);
			tamanhoFonte[i].addItemListener(tam);
		}
		
		setJMenuBar(barraMenu);
		barraMenu.add(opcoesMenu);
		
		opcoesMenu.setMnemonic(KeyEvent.VK_O);
		fonteMenu.setMnemonic(KeyEvent.VK_F);
		estiloMenu.setMnemonic(KeyEvent.VK_E);
		corMenu.setMnemonic(KeyEvent.VK_C);
		tamanhoMenu.setMnemonic(KeyEvent.VK_T);
		limparItem.setMnemonic(KeyEvent.VK_L);
		sairItem.setMnemonic(KeyEvent.VK_S);
		
		painel.setBounds(30, 30, 250, 250);
		
		rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		limparItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					caixaTexto.setText("");
					caixaTexto.requestFocus();
				}
			}
		);
		azulItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					caixaTexto.setForeground(Color.BLUE);
					repaint();
				}
			}
		);
		verdeItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					caixaTexto.setForeground(Color.GREEN);
					repaint();
				}
			}
		);
		vermelhoItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					caixaTexto.setForeground(Color.RED);
					repaint();
				}
			}
		);
		amareloItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					caixaTexto.setForeground(Color.YELLOW);
					repaint();
				}
			}
		);
		pretoItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					caixaTexto.setForeground(Color.BLACK);
					repaint();
				}
			}
		);
		sairItem.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int opcao;
					Object botoes[] = {
						"Sim",
						"Não"
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
		
		opcoesMenu.add(limparItem);
		opcoesMenu.add(fonteMenu);
		opcoesMenu.addSeparator();
		opcoesMenu.add(sairItem);
		corMenu.add(azulItem);
		corMenu.add(verdeItem);
		corMenu.add(vermelhoItem);
		corMenu.add(amareloItem);
		corMenu.add(pretoItem);
		fonteMenu.add(corMenu);
		fonteMenu.add(estiloMenu);
		fonteMenu.add(tamanhoMenu);
		painel.add(rolagem);
		frame.add(painel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	private class TratadorEstilo implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(estiloFonte[0].isSelected()) {
				fonteEstilo = Font.PLAIN;
			}else if(estiloFonte[1].isSelected()) {
				fonteEstilo = Font.BOLD;
			}else if(estiloFonte[2].isSelected()) {
				fonteEstilo = Font.ITALIC;
			}else if(estiloFonte[3].isSelected()) {
				fonteEstilo = Font.BOLD+Font.ITALIC;
			}
			
			caixaTexto.setFont(new Font("", fonteEstilo, fonteTamanho));
			
			repaint();
		}
	}
	
	private class TratadorTamanho implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(tamanhoFonte[0].isSelected()) {
				fonteTamanho = 12;
			}else if(tamanhoFonte[1].isSelected()) {
				fonteTamanho = 14;
			}else if(tamanhoFonte[2].isSelected()) {
				fonteTamanho = 16;
			}else if(tamanhoFonte[3].isSelected()) {
				fonteTamanho = 18;
			}
			
			caixaTexto.setFont(new Font("", fonteEstilo, fonteTamanho));
			
			repaint();
		}
	}
	
}
