package view;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JTableExample extends JFrame {

	private JPanel contentPane;
	private String colunas[] = {
			"Nome:",
			"Idade:",
			"Sexo:"
	};
	private String dados [][] = {
			{"Marcos", "18", "Masculino"},
			{"Gabriela", "18", "Feminino"},
			{"Pedro", "17", "Masculino"},
			{"Felipe", "18", "Masculino"},
			{"Wesley", "16", "Masculino"},
			{"Hilton", "47", "Masculino"},
			{"Carlos", "22", "Masculino"},
			{"Vitoria", "18", "Feminino"},
			{"Nicolas", "16", "Masculino"},
			{"Matheus", "16", "Masculino"}
	};
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableExample frame = new JTableExample();
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
	public JTableExample() {
		setTitle("Exemlpo de JTable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());
		setSize(new Dimension(550, 200));
		setLocationRelativeTo(null);
		
		table = new JTable(dados, colunas);
		table.setPreferredScrollableViewportSize(new Dimension(500,90));
		table.setFillsViewportHeight(true);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table );
		//scrollPane.setSize(new Dimension(400,200));
		contentPane.add(scrollPane);
	}

}
