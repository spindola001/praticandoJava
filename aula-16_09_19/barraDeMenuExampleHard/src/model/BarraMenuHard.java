package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarraMenuHard extends JFrame{
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
	
	public BarraMenuHard() {
		super("Exemplo de menu mais avançado");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
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
		for(int i=0; i < 4; i++) {
			estiloFonte[i] = new JCheckBoxMenuItem(estilo[i]);
			estiloMenu.add(estiloFonte[i]);
			estiloGroup.add(estiloFonte[i]);
		}
		for(int i=0; i < 4; i++) {
			tamanhoFonte[i] = new JRadioButtonMenuItem(tamanho[i]);
			tamanhoMenu.add(tamanhoFonte[i]);
			tamanhoGroup.add(tamanhoFonte[i]);
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
		
		setSize(300, 200);
		setVisible(true);
	}
	
}
