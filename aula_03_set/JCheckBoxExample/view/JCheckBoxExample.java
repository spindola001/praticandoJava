package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxExample extends JFrame{

	JCheckBox opcao01,
		opcao02,
		opcao03,
		opcao04,
		opcao05;
	JLabel vazio,
		rotuloMain;
	JButton exibirBtn;

	public JCheckBoxExample(){

		super("Exemplo de JCheckBox");
		Container tela = getContentPane();
		tela.setLayout(null);	
		setSize(500,300);
		setLocationRelativeTo(null);
		
		opcao01 = new JCheckBox("JAVA");
		opcao02 = new JCheckBox("C++");
		opcao03 = new JCheckBox("Delphi");
		opcao04 = new JCheckBox("Visual Basic");
		opcao05 = new JCheckBox("Python");

		vazio = new JLabel("");
		rotuloMain = new JLabel("Quais suas linguagens favoritas? ");
			
		exibirBtn = new JButton("EXIBIR");
		
		opcao01.setBounds(40, 60, 60, 20);
		opcao02.setBounds(100, 60, 60, 20);
		opcao03.setBounds(165, 60, 80, 20);
		opcao04.setBounds(250, 60, 110, 20);
		opcao05.setBounds(365, 60, 100, 20);

		vazio.setBounds(100, 200, 600, 20);
		rotuloMain.setBounds(40, 30, 300, 20);

		exibirBtn.setBounds(200, 150, 100, 20);

		//determinando atalhos para selecao dos checkBoxs
		opcao01.setMnemonic(KeyEvent.VK_J);
		opcao02.setMnemonic(KeyEvent.VK_C);
		opcao03.setMnemonic(KeyEvent.VK_D);
		opcao04.setMnemonic(KeyEvent.VK_V);
		opcao05.setMnemonic(KeyEvent.VK_P);
		
		//incia uma opcao como marcada (nesse caso a opcao01)
		opcao01.setSelected(true);
		opcao01.setForeground(Color.blue);

		exibirBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String escolhas = "";
					
					//faz uma verifacacao no metodo isSelected() de cada opcao
					//caso a opcao em questao esteja marcada o conteudo da opcao e iterado na variavel escolhas
					if(opcao01.isSelected() == true){
						escolhas = escolhas + opcao01.getText();
					}
					if(opcao02.isSelected() == true){
						escolhas = escolhas +" "+ opcao02.getText();
					}
					if(opcao03.isSelected() == true){
						escolhas = escolhas +" "+ opcao03.getText();
					}
					if(opcao04.isSelected() == true){
						escolhas = escolhas +" "+ opcao04.getText();
					}
					if(opcao05.isSelected() == true){
						escolhas = escolhas +" "+ opcao05.getText();
					}

					//o resultado de quais opcoes foram marcadas fica aqui
					vazio.setText("Voce escolheu: " + escolhas);
				}			
			});
		getRootPane().setDefaultButton(exibirBtn);					

		tela.add(opcao01);
		tela.add(opcao02);
		tela.add(opcao03);
		tela.add(opcao04);
		tela.add(opcao05);
		tela.add(exibirBtn);
		tela.add(rotuloMain);
		tela.add(vazio);

		setVisible(true);
	}

	public static void main(String[] args){
		JCheckBoxExample app = new JCheckBoxExample();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

