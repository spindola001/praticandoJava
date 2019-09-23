package view;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JComboBoxExample extends JFrame {

	private JPanel contentPane;
	private JComboBox lista;
	private String cidades[] = {
			"Rio de Janeiro",
			"São Paulo",
			"Minas Gerais",
			"Espirito Santo",
			"Bahia",
			"Pernambuco",
			"Rio Grande do Sul",
			"Acre"
	};
	private JButton exibirEstadosBtn;
	private JLabel estadoSelecionadoLabel;
	private JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxExample frame = new JComboBoxExample();
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
	public JComboBoxExample() {
		super("Exemplo de JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(400, 250);
		setLocationRelativeTo(null);
		
		lista = new JComboBox(cidades);
		lista.setMaximumRowCount(5);
		
		scrollPane = new JScrollPane(lista);
		scrollPane.setBounds(100, 41, 200, 30);
		contentPane.add(scrollPane);
		
		estadoSelecionadoLabel = new JLabel("");
		contentPane.add(estadoSelecionadoLabel);
		estadoSelecionadoLabel.setBounds(100, 95, 200, 25);
		
		exibirEstadosBtn = new JButton("EXIBIR");
		exibirEstadosBtn.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					estadoSelecionadoLabel.setText("O Estado foi: " + lista.getSelectedItem().toString());
				}
			}
		);
		exibirEstadosBtn.setBounds(100, 142, 200, 25);
		contentPane.add(exibirEstadosBtn);
		
	}
}
