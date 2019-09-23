package view;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class CadastroClientes extends JFrame {

    JButton cadastrarBtn;
    JTextArea observacaoTexto;
    JScrollPane pineScrollPane;
    JPanel panel;
    ImageIcon iconeCadastro;
    JRadioButton statusPFisica,
        statusPJuridica;
    ButtonGroup opcoes;
    JLabel cadLable,
        status,
        nome,
        bairro,
        cidade,
        estado,
        telefoneComercial,
        cnpj,
        inscricaoEstadual,
        email,
        observacao,
        rua,
        numero,
        complemento,
        cep,
        telefoneResidencial,
        telefoneCeluar,
        cpf,
        rg,
        dataNascimento;
    JTextField nomeField,
        bairroField,
        cidadeField,
        estadoField,
        inscricaoEstadualField,
        emailField,
        ruaField,
        numeroField,
        complementoField;
    JFormattedTextField telefoneComercialField,
        cnpjField,
        cepField,
        telefoneResidencialField,
        telefoneCelularField,
        cpfField,
        rgField,
        dataNascimentoField;
    MaskFormatter telefoneComercialMask,
        cnpjMask,
        cepMask,
        telefoneResidencialMask,
        telefoneCelularMask,
        cpfMask,
        rgMask,
        dataNascimentoMask;

    public CadastroClientes() {
        //Propriedades da janela
        super("Cadastro de clientes");
        Container tela = getContentPane();
        tela.setBackground(new Color(235, 235, 235));
        setSize(1220, 630);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        //---FIM---

        //Atributos que a janela irÃ¡ possuir
        iconeCadastro = new ImageIcon("icone.png");
        cadastrarBtn = new JButton("Cadastrar", iconeCadastro);
        observacaoTexto = new JTextArea(10, 40);
        pineScrollPane = new JScrollPane(observacaoTexto);
        panel = new JPanel();
        panel.add(pineScrollPane);
        opcoes = new ButtonGroup();
        statusPFisica = new JRadioButton("Pessoa Física");
        opcoes.add(statusPFisica);
        statusPJuridica = new JRadioButton("Pessoa Juridica");
        opcoes.add(statusPJuridica);
        cadLable = new JLabel("CADASTRO DE CLIENTES");
        status = new JLabel("Status:");
        nome = new JLabel("Nome:");
        bairro = new JLabel("Bairro:");
        cidade = new JLabel("Cidade:");
        estado = new JLabel("Estado:");
        telefoneComercial = new JLabel("Telefone comercial:");
        cnpj = new JLabel("CNPJ:");
        inscricaoEstadual = new JLabel("Inscrição estadual:");
        email = new JLabel("E-mail:");
        observacao = new JLabel("Observação:");
        rua = new JLabel("Rua:");
        numero = new JLabel("Número:");
        complemento = new JLabel("Complemento:");
        cep = new JLabel("CEP:");
        telefoneResidencial = new JLabel("Telefone residencial:");
        telefoneCeluar = new JLabel("Telefone celular:");
        cpf = new JLabel("CPF:");
        rg = new JLabel("RG:");
        dataNascimento = new JLabel("Data de nascimento:");
        nomeField = new JTextField(30);
        bairroField = new JTextField(40);
        cidadeField = new JTextField(20);
        estadoField = new JTextField(20);
        inscricaoEstadualField = new JTextField(30);
        emailField = new JTextField(30);
        ruaField = new JTextField(30);
        complementoField = new JTextField(15);
        numeroField = new JTextField(4);
        try{
            telefoneComercialMask = new MaskFormatter("(##)####-####");
            cnpjMask = new MaskFormatter("##.###.###/####-##");
            cepMask = new MaskFormatter("#####-###");
            telefoneResidencialMask = new MaskFormatter("(##)####-####");
            telefoneCelularMask = new MaskFormatter("(##)#####-####");
            cpfMask = new MaskFormatter("###.###.###-##");
            rgMask = new MaskFormatter("##.###.###-#");
            dataNascimentoMask = new MaskFormatter("##/##/####");

            telefoneCelularMask.setPlaceholderCharacter('_');
            cnpjMask.setPlaceholderCharacter('_');
            cepMask.setPlaceholderCharacter('_');
            telefoneResidencialMask.setPlaceholderCharacter('_');
            telefoneComercialMask.setPlaceholderCharacter('_');
            cpfMask.setPlaceholderCharacter('_');
            rgMask.setPlaceholderCharacter('_');
            dataNascimentoMask.setPlaceholderCharacter('_');
        }catch(ParseException excp){}

        telefoneComercialField = new JFormattedTextField(telefoneComercialMask);
        cnpjField = new JFormattedTextField(cnpjMask);
        cepField = new JFormattedTextField(cepMask);
        telefoneResidencialField = new JFormattedTextField(telefoneResidencialMask);
        telefoneCelularField = new JFormattedTextField(telefoneCelularMask
        );
        cpfField = new JFormattedTextField(cpfMask);
        rgField = new JFormattedTextField(rgMask);
        dataNascimentoField = new JFormattedTextField(dataNascimentoMask);
        //---FIM---

        //Definindo propriedades para os atributos da tabela
        cadLable.setBounds(20, 50, 300, 20);
        cadLable.setForeground(new Color(0, 105, 0));
        cadLable.setFont(new Font("Monospaced",Font.BOLD,18));
        tela.add(cadLable);
        status.setBounds(200, 80, 60, 20);
        status.setForeground(Color.BLACK);
        statusPFisica.setBounds(255, 80, 125, 20);
        statusPJuridica.setBounds(590, 80, 135, 20);
        tela.add(status);
        tela.add(statusPFisica);
        tela.add(statusPJuridica);
        rua.setBounds(852, 80, 80, 20);
        rua.setForeground(Color.BLACK);
        ruaField.setBounds(900, 80, 250, 20);
        tela.add(rua);
        tela.add(ruaField);
        nome.setBounds(204, 115, 100, 20);
        nome.setForeground(Color.BLACK);
        nomeField.setBounds(259, 115, 300, 20);
        tela.add(nome);
        tela.add(nomeField);
        numero.setBounds(829, 115, 100, 20);
        numero.setForeground(Color.BLACK);
        numeroField.setBounds(900, 115, 75, 20);
        tela.add(numero);
        tela.add(numeroField);
        bairro.setBounds(202, 145, 100, 20);
        bairro.setForeground(Color.BLACK);
        bairroField.setBounds(259, 145, 200, 20);
        tela.add(bairro);
        tela.add(bairroField);
        complemento.setBounds(795, 145, 150, 20);
        complemento.setForeground(Color.BLACK);
        complementoField.setBounds(900, 145, 145, 20);
        tela.add(complemento);
        tela.add(complementoField);
        cidade.setBounds(198, 175, 100, 20);
        cidade.setForeground(Color.BLACK);
        cidadeField.setBounds(259, 175, 200, 20);
        tela.add(cidade);
        tela.add(cidadeField);
        cep.setBounds(851, 175, 100, 20);
        cep.setForeground(Color.BLACK);
        cepField.setBounds(900, 175, 145, 20);
        tela.add(cep);
        tela.add(cepField);
        estado.setBounds(198, 205, 80, 20);
        estado.setForeground(Color.BLACK);
        estadoField.setBounds(259, 205, 100, 20);
        tela.add(estado);
        tela.add(estadoField);
        telefoneResidencial.setBounds(759, 205, 160, 20);
        telefoneResidencial.setForeground(Color.BLACK);
        telefoneResidencialField.setBounds(900, 205, 80, 20);
        tela.add(telefoneResidencial);
        tela.add(telefoneResidencialField);
        telefoneComercial.setBounds(128, 235, 160, 20);
        telefoneComercial.setForeground(Color.BLACK);
        telefoneComercialField.setBounds(259, 235, 80, 20);
        tela.add(telefoneComercial);
        tela.add(telefoneComercialField);
        telefoneCeluar.setBounds(783, 235, 160, 20);
        telefoneCeluar.setForeground(Color.BLACK);
        telefoneCelularField.setBounds(900, 235, 85, 20);
        tela.add(telefoneCeluar);
        tela.add(telefoneCelularField);
        cnpj.setBounds(206, 265, 80, 20);
        cnpj.setForeground(Color.BLACK);
        cnpjField.setBounds(259, 265, 115, 20);
        tela.add(cnpj);
        tela.add(cnpjField);
        cpf.setBounds(852, 265, 160, 20);
        cpf.setForeground(Color.BLACK);
        cpfField.setBounds(900, 265, 115, 20);
        tela.add(cpf);
        tela.add(cpfField);
        inscricaoEstadual.setBounds(132, 295, 150, 20);
        inscricaoEstadual.setForeground(Color.BLACK);
        inscricaoEstadualField.setBounds(259, 295, 80, 20);
        tela.add(inscricaoEstadual);
        tela.add(inscricaoEstadualField);
        rg.setBounds(858, 295, 160, 20);
        rg.setForeground(Color.BLACK);
        rgField.setBounds(900, 295, 115, 20);
        tela.add(rg);
        tela.add(rgField);
        email.setBounds(202, 325, 80, 20);
        email.setForeground(Color.BLACK);
        emailField.setBounds(259, 325, 180, 20);
        tela.add(email);
        tela.add(emailField);
        dataNascimento.setBounds(761, 325, 160, 20);
        dataNascimento.setForeground(Color.BLACK);
        dataNascimentoField.setBounds(900, 325, 125, 20);
        tela.add(dataNascimento);
        tela.add(dataNascimentoField);
        observacao.setBounds(166, 415, 100, 20);
        observacao.setForeground(Color.BLACK);
        panel.setBounds(206, 355, 550, 550);
        tela.add(observacao);
        tela.add(panel);
        cadastrarBtn.setBounds(834, 415, 200, 50);
        cadastrarBtn.setForeground(Color.BLACK);
        cadastrarBtn.setToolTipText("Cadastrar cliente");
        tela.add(cadastrarBtn);

        //---FIM---

        setVisible(true);
    }

    public static void main(String arg[]){
        CadastroClientes app = new CadastroClientes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}