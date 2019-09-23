package view;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Dados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCatetoOp;
	private JLabel lblCatetoAd;
	private JTextField textField_1;
	private JLabel hipLabel;
	private JButton mostrarResultadoBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dados frame = new Dados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dados() {
		super("Teorema de Pitágoras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 309);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100,100,100)); 	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblCatetoAd = new JLabel("Cateto Ad:");
		lblCatetoAd.setForeground(new Color(255,255,255));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		lblCatetoOp = new JLabel("Cateto Op:");
		lblCatetoOp.setForeground(new Color(255,255,255));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		mostrarResultadoBtn = new JButton("MOSTRAR RESULTADO");
		mostrarResultadoBtn.setBackground(new Color(0,0,0));
		mostrarResultadoBtn.setForeground(new Color(255,255,255));
		mostrarResultadoBtn.addActionListener(	
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					double catAd,
						catOp,
						hip;
					
					catAd = Double.parseDouble(textField.getText());
					catOp = Double.parseDouble(textField_1.getText());
					
					hip = Math.pow(catAd, 2) + Math.pow(catOp, 2);
					
					hipLabel.setVisible(true);
					hipLabel.setText("Hipotenusa = " + hip);
				}
			}		
		);
		
		//torna o enter atalho para o batão "mostrar resultado"
		getRootPane().setDefaultButton(mostrarResultadoBtn);
		
		hipLabel = new JLabel("");
		hipLabel.setForeground(new Color(255,255,255));
		
		//configurações do GroupLayout - funciona basicamente como o setBounds();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addComponent(mostrarResultadoBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(139))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(hipLabel, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCatetoAd, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCatetoOp, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(66))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCatetoAd, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCatetoOp))
					.addGap(18)
					.addComponent(hipLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(mostrarResultadoBtn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(49))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
