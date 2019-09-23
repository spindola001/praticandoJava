package view;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JListExample extends JFrame {

	private JPanel contentPane;
	private JList lista;
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
					JListExample frame = new JListExample();
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
	public JListExample() {
		super("Exemplo de JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lista = new JList(cidades);
		lista.setVisibleRowCount(5);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane = new JScrollPane(lista);
		scrollPane.setBounds(125, 41, 190, 100);
		contentPane.add(scrollPane);
		
		estadoSelecionadoLabel = new JLabel("");
		contentPane.add(estadoSelecionadoLabel);
		estadoSelecionadoLabel.setBounds(125, 170, 200, 25);
		
		exibirEstadosBtn = new JButton("EXIBIR");
		exibirEstadosBtn.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					estadoSelecionadoLabel.setText("O Estado foi: " + lista.getSelectedValue().toString());
				}
			}
		);
		exibirEstadosBtn.setBounds(125, 207, 190, 25);
		contentPane.add(exibirEstadosBtn);
		
	}
}
