package view;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Cadastro extends JFrame{

    JLabel cep,
        telefone,
        cpf,
        data;
    JFormattedTextField cepField,
        telefoneField,
        cpfField,
        dataField;
    MaskFormatter maskCep,
        maskTel,
        maskCpf,
        maskData;

    public Cadastro() {
        //Propriedades da janela
        Container tela = getContentPane();
        tela.setBackground(new Color(235, 235, 235));
        setSize(450, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        //---FIM---

        //Atributos que janale irá possuir
        cep = new JLabel("CEP:");
        telefone = new JLabel("Telefone:");
        cpf = new JLabel("CPF:");
        data = new JLabel("Data:");
        try{
            maskCep = new MaskFormatter("#####.###");
            maskTel = new MaskFormatter("(##)####-####");
            maskCpf = new MaskFormatter("###.###.###-##");
            maskData = new MaskFormatter("##/##/####");

            maskCep.setPlaceholderCharacter('_');
            maskTel.setPlaceholderCharacter('_');
            maskCpf.setPlaceholderCharacter('_');
            maskData.setPlaceholderCharacter('_');
        }catch(ParseException excp){}

        cepField = new JFormattedTextField(maskCep);
        telefoneField = new JFormattedTextField(maskTel);
        cpfField = new JFormattedTextField(maskCpf);
        dataField = new JFormattedTextField(maskData);
        //---FIM---

        //Definindo propriedades para os atributos da janela
        cep.setBounds(50, 45, 80, 20);
        cep.setForeground(Color.BLACK);
        cepField.setBounds(145, 45, 220, 20);
        tela.add(cep);
        tela.add(cepField);
        telefone.setBounds(50, 95, 80, 20);
        telefone.setForeground(Color.BLACK);
        telefoneField.setBounds(145, 95, 220, 20);
        tela.add(telefone);
        tela.add(telefoneField);
        cpf.setBounds(50, 140, 80, 20);
        cpf.setForeground(Color.BLACK);
        cpfField.setBounds(145, 140, 220, 20);
        tela.add(cpf);
        tela.add(cpfField);
        data.setBounds(50, 185, 80, 20);
        data.setForeground(Color.BLACK);
        dataField.setBounds(145, 185, 220, 20);
        tela.add(data);
        tela.add(dataField);
        //---FIM---

        setVisible(true);
    }

    public static void main (String args[]){
        Cadastro app = new Cadastro();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}