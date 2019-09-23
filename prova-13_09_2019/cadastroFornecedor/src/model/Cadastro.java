package model;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Cadastro extends JFrame {

	JLabel title,
		campo01,
		campo02,
		campo03,
		campo04,
		campo05,
		campo06,
		campo07,
		campo08,
		campo09,
		campo10,
		campo11,
		campo12,
		campo13,
		campo14,
		campo15,
		campo16,
		percentLabel;
	JTextField campo01Field,
		campo02Field,
		campo03Field,
		campo04Field,
		campo05Field,
		campo06Field,
		campo07Field,
		campo08Field,
		campo09Field,
		campo10Field,
		campo11Field,
		campo12Field,
		campo13Field,
		campo14Field,
		campo15Field,
		campo16Field;
	JCheckBox campo17Check;
	JButton cadastrarBtn,
		cancelarBtn;
	JFormattedTextField campoCpf,
		campoCep,
		campoFone,
		campoFax;
	MaskFormatter maskCpf,
		maskCep,
		maskFone,
		maskFax;
	
	public Cadastro() {
		super("Cadastro de fornecedores");
		Container canvas = getContentPane();
		setSize(700,560);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		title = new JLabel("Cadastro de Fornecedor");
		campo01 = new JLabel("Tipo do Fornecedor:");
		campo02 = new JLabel("Razão Social:");
		campo03 = new JLabel("Nome Fantasia:");
		campo04 = new JLabel("CPF/CNPF:");
		campo05 = new JLabel("Representante:");
		campo06 = new JLabel("Endereço:");
		campo07 = new JLabel("Bairro:");
		campo08 = new JLabel("Cidade:");
		campo09 = new JLabel("CEP:");
		campo10 = new JLabel("Email:");
		campo11 = new JLabel("Fone:");
		campo12 = new JLabel("Fax:");
		campo13 = new JLabel("NIT ou PIS/PASEP:");
		campo14 = new JLabel("Emite Fatura?");
		campo15 = new JLabel("Alíquota de imposto:");
		percentLabel = new JLabel("%");
		campo01Field = new JTextField();
		campo02Field = new JTextField();
		campo03Field = new JTextField();
		campo04Field = new JTextField();
		campo05Field = new JTextField();
		campo06Field = new JTextField();
		campo07Field = new JTextField();
		campo08Field = new JTextField();
		campo09Field = new JTextField();
		campo10Field = new JTextField();
		campo11Field = new JTextField();
		campo12Field = new JTextField();
		campo13Field = new JTextField();
		campo14Field = new JTextField();
		campo15Field = new JTextField();
		campo16Field = new JTextField();
		campo17Check = new JCheckBox("Internacional");
		cadastrarBtn = new JButton("CADASTRAR");
		cancelarBtn = new JButton("CANCELAR");
		
		try {
			maskCpf = new MaskFormatter("###.###.###-##");
			maskCep = new MaskFormatter("#####-###");
			maskFone = new MaskFormatter("(##)#####-####");
			maskFax = new MaskFormatter("###.#####.##-#");
			maskCpf.setPlaceholder("_");
			maskCep.setPlaceholder("_");
			maskFone.setPlaceholder("_");
			maskFax.setPlaceholder("_");
		}catch(ParseException excp){}
		
		campoCpf = new JFormattedTextField(maskCpf);
		campoCep = new JFormattedTextField(maskCep);
		campoFone = new JFormattedTextField(maskFone);
		campoFax = new JFormattedTextField(maskFax);
		
		title.setBounds(300, 20, 200, 20);
		campo01.setBounds(25, 40, 150, 20);
		campo02.setBounds(25, 60, 150, 20);
		campo03.setBounds(25, 80, 150, 20);
		campo04.setBounds(25, 100, 150, 20);
		campo05.setBounds(25, 120, 150, 20);
		campo06.setBounds(25, 140, 150, 20);
		campo07.setBounds(25, 160, 150, 20);
		campo08.setBounds(25, 180, 150, 20);
		campo09.setBounds(25, 200, 150, 20);
		campo10.setBounds(25, 220, 150, 20);
		campo11.setBounds(25, 240, 150, 20);
		campo12.setBounds(25, 260, 150, 20);
		campo13.setBounds(25, 280, 150, 20);
		campo14.setBounds(25, 300, 150, 20);
		campo15.setBounds(25, 320, 150, 20);
		percentLabel.setBounds(400, 320, 30, 20);
		campo01Field.setBounds(190, 40, 300, 20);
		campo02Field.setBounds(190, 60, 380, 20);
		campo03Field.setBounds(190, 80, 380, 20);
		campo04Field.setBounds(190, 100, 85, 20);
		campo05Field.setBounds(190, 120, 380, 20);
		campo06Field.setBounds(190, 140, 380, 20);
		campo07Field.setBounds(190, 160, 115, 20);
		campo08Field.setBounds(190, 180, 115, 20);
		campo09Field.setBounds(190, 180, 35, 20);
		campo10Field.setBounds(190, 200, 70, 20);
		campo11Field.setBounds(190, 220, 115, 20);
		campo12Field.setBounds(190, 240, 70, 20);
		campo13Field.setBounds(190, 260, 70, 20);
		campo14Field.setBounds(190, 280, 70, 20);
		campo15Field.setBounds(190, 300, 70, 20);
		campo16Field.setBounds(190, 320, 70, 20);
		campo17Check.setBounds(330, 160, 100, 20);
		cadastrarBtn.setBounds(340, 250, 100, 30);
		cancelarBtn.setBounds(400, 250, 100, 30);
		campoCpf.setBounds(20, 20, 100, 20);
		campoCep.setBounds(40, 40, 100, 20);
		campoFone.setBounds(60, 60, 100, 20);
		campoFax.setBounds(80, 80, 100, 20);
		
		canvas.add(title);
		canvas.add(campo01);
		canvas.add(campo02);
		canvas.add(campo03);
		canvas.add(campo04);
		canvas.add(campo05);
		canvas.add(campo06);
		canvas.add(campo07);
		canvas.add(campo08);
		canvas.add(campo09);
		canvas.add(campo10);
		canvas.add(campo11);
		canvas.add(campo12);
		canvas.add(campo13);
		canvas.add(campo14);
		canvas.add(campo15);
		canvas.add(percentLabel);
		canvas.add(campo01Field);
		canvas.add(campo02Field);
		canvas.add(campo03Field);
		canvas.add(campo04Field);
		canvas.add(campo05Field);
		canvas.add(campo06Field);
		canvas.add(campo07Field);
		canvas.add(campo08Field);
		canvas.add(campo09Field);
		canvas.add(campo10Field);
		canvas.add(campo12Field);
		canvas.add(campo13Field);
		canvas.add(campo14Field);
		canvas.add(campo15Field);
		canvas.add(campo16Field);
		canvas.add(campo17Check);
		canvas.add(cadastrarBtn);
		canvas.add(cancelarBtn);
		canvas.add(campoCpf);
		canvas.add(campoCep);
		canvas.add(campoFone);
		canvas.add(campoFax);
		
		cadastrarBtn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,
									"Tipo do Fornecedor: " + campo01Field.getText().toString() + "\n" +
									"Razão Social: " + campo02Field.getText().toString() + "\n" +
									"Nome Fantasia: " + campo03Field.getText().toString() + "\n" +
									"CPF/CNPJ: " + campoCpf.getText().toString() + "\n" +
									"Representante: " + campo05Field.getText().toString() + "\n" +
									"Endereço: " + campo06Field.getText().toString() + "\n" +
									"Bairro: " + campo07Field.getText().toString() + "\n" +
									"Cidade: " + campo08Field.getText().toString() + "\n" +
									"CEP: " + campoCep.getText().toString() + "\n" +
									"Email: " + campo10Field.getText().toString() + "\n" +
									"Fone: " + campoFone.getText().toString() + "\n" +
									"Fax: " + campoFax.getText().toString() + "\n" +
									"NIT ou PIS/PASEP: " + campo13Field.getText().toString() + "\n" +
									"Emite Fatura: " + campo14Field.getText().toString() + "\n" +
									"Aliquota de Imposto: " + campo15Field.getText().toString()
						);
					}
				}
		);
		
		setVisible(true);
	}
	
}
