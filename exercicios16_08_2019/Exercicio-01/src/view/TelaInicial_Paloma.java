package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaInicial_Paloma extends JFrame {
	
	JLabel indicativo, login, passwd;
	JTextField loginField;
	JPasswordField passwdField;
	JButton okBtn, cancelarBtn;
	
	public TelaInicial_Paloma() {
		//Propriedades da janela
		super("Tela de Inicialização - Paloma");
		Container tela = getContentPane();
		tela.setBackground(new Color(215, 215, 215));
		setSize(460, 325);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		//---FIM---

		//Atributos que a janale irÃ¡ possuir
		indicativo = new JLabel("Entre com seus dados:");
		login = new JLabel("Login:");
		passwd = new JLabel("Password:");
		loginField = new JTextField(60);
		passwdField = new JPasswordField(20);
		okBtn = new JButton("OK");
		cancelarBtn = new JButton("Cancelar");
		//---FIM---

		//Definindo propriedades para os atributos da janela 
		//texto informativo
		indicativo.setBounds(115, 25, 200, 20);
		indicativo.setForeground(new Color(255, 0, 0));
		tela.add(indicativo);
		//input para login
		login.setBounds(30, 70, 50, 20);
		login.setForeground(Color.black);
		login.requestFocus();
		loginField.setBounds(100, 70, 300, 23);
		tela.add(login);
		tela.add(loginField);
		//input para password
		passwd.setBounds(15, 120, 80, 20);
		passwd.setForeground(Color.black);
		passwdField.setBounds(100, 120, 300, 23);
		tela.add(passwd);
		tela.add(passwdField);
		//botoes para confirmar e cancelar o envio das informacoes
		okBtn.setBounds(115, 190, 70, 35);
		okBtn.setToolTipText("Enviar informações");
		tela.add(okBtn);
		cancelarBtn.setBounds(235, 190, 110, 35);
		cancelarBtn.setToolTipText("Sair do programa");
		tela.add(cancelarBtn);
		//---FIM---
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaInicial_Paloma app = new TelaInicial_Paloma();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
