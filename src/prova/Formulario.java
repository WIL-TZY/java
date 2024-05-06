package prova;

import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JPanel implements Serializable {

	// UID
	private static final long serialVersionUID = 3490465714692430307L;
	
	// Componentes
    private JTextField nomeField;
    private JTextField cpfField;
    private JComboBox<Cargo> cargoComboBox;
    private JComboBox<Departamento> departamentoComboBox;
    private JButton cadastrarButton;
    private CadastroListener cadastroListener;

    // Construtor
    public Formulario() {
        initComponents();
    }

    // Inicialização dos componentes
    private void initComponents() {
        setLayout(new GridLayout(5, 2, 5, 5));

        // Labels
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);
        
        add(new JLabel("Cargo:"));
        cargoComboBox = new JComboBox<>(Cargo.values());
        add(cargoComboBox);

        add(new JLabel("Departamento:"));
        departamentoComboBox = new JComboBox<>(Departamento.values());
        add(departamentoComboBox);
        
        // Botão de Cadastro
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarFuncionario();
            }
        });
        add(cadastrarButton);
    }

    // Método para cadastrar o funcionário
    private void cadastrarFuncionario() {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        Cargo cargo = (Cargo) cargoComboBox.getSelectedItem();
        Departamento departamento = (Departamento) departamentoComboBox.getSelectedItem();

        // Verificar se o listener está definido e notificar
        if (cadastroListener != null) {
            cadastroListener.onFuncionarioCadastrado(nome, cpf, departamento, cargo);
        }
    }

    public void setCadastroListener(CadastroListener listener) {
        this.cadastroListener = listener;
    }

    // Método para limpar os campos do formulário
    public void limparCampos() {
        nomeField.setText("");
        cpfField.setText("");
        departamentoComboBox.setSelectedIndex(0);
    }
}
