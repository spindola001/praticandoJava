package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarraDeMenu extends JFrame{
	JMenuBar barraMenu;
	JMenu opcoesMenu,
		fonteMenu,
		estiloMenu,
		corMenu;
	JMenuItem limparItem,
		sairItem,
		tamanhoItem,
		azulItem,
		verdeItem,
		vermelhoItem,
		amareloItem,
		pretoItem;
	JCheckBoxMenuItem normalCheck,
		negritoCheck,
		italicoCheck,
		negritoItalicoCheck;
		
	public BarraDeMenu() {
		super("Exemplo de barra de menu");
		Container frame = getContentPane();
		frame.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		barraMenu = new JMenuBar();
		opcoesMenu = new JMenu("OPÇÕES");
		fonteMenu = new JMenu("FONTE");
		corMenu = new JMenu("COR");
		estiloMenu = new JMenu("Estilo");
		tamanhoItem = new JMenuItem("Tamanho");
		azulItem = new JMenuItem("Azul");
		verdeItem = new JMenuItem("Verde");
		vermelhoItem = new JMenuItem("Vermelho");
		amareloItem = new JMenuItem("Amarelo");
		pretoItem = new JMenuItem("Preto");
		limparItem = new JMenuItem("Limpar");
		sairItem = new JMenuItem("SAIR");
		normalCheck = new JCheckBoxMenuItem("Normal");
		negritoCheck = new JCheckBoxMenuItem("Negrito");
		italicoCheck = new JCheckBoxMenuItem("Itálico");
		negritoItalicoCheck = new JCheckBoxMenuItem("Negrito e Itálico");
		
		setJMenuBar(barraMenu);
		barraMenu.add(opcoesMenu);
		
		opcoesMenu.setMnemonic(KeyEvent.VK_O);
		fonteMenu.setMnemonic(KeyEvent.VK_F);
		estiloMenu.setMnemonic(KeyEvent.VK_E);
		corMenu.setMnemonic(KeyEvent.VK_C);
		tamanhoItem.setMnemonic(KeyEvent.VK_T);
		normalCheck.setMnemonic(KeyEvent.VK_M);
		negritoCheck.setMnemonic(KeyEvent.VK_N);
		italicoCheck.setMnemonic(KeyEvent.VK_I);
		negritoItalicoCheck.setMnemonic(KeyEvent.VK_K);
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
		estiloMenu.add(normalCheck);
		estiloMenu.add(negritoCheck);
		estiloMenu.add(italicoCheck);
		estiloMenu.add(negritoItalicoCheck);
		fonteMenu.add(corMenu);
		fonteMenu.add(estiloMenu);
		fonteMenu.add(tamanhoItem);
		
		setSize(500, 300);
		setVisible(true);
	}
}
