package prova;

import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCalculo extends JPanel implements Serializable {

	// UID
	private static final long serialVersionUID = 3490465714692430307L;
	
	// Componentes
    private JTextField nomeField;
    private JTextField cpfField;
    private JComboBox<Cargo> cargoComboBox;
    private JComboBox<Departamento> departamentoComboBox;
    private JButton cadastrarButton;
    private CadastroListener cadastroListener;
    private JTextField totalVendasField;
    private JTextField comissaoField;

    // Construtor
    public PainelCalculo() {
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
        
        // Botão de cargo
        add(new JLabel("Cargo:"));
        cargoComboBox = new JComboBox<>(Cargo.values());
        add(cargoComboBox);
        
        add(new JLabel("Departamento:"));
        departamentoComboBox = new JComboBox<>(Departamento.values());
        add(departamentoComboBox);
        
        // Adicionar novo campo dependendo do cargo
        cargoComboBox.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (cargoComboBox.getSelectedItem() == "Vendedor") {
	                // Botão de total de vendas
	                add(new JLabel("Total de Vendas:"));
	                totalVendasField = new JTextField();
	                add(totalVendasField);
	            }   
	            else {
	                // Botão de comissão
	                add(new JLabel("Comissão:"));
	                comissaoField = new JTextField();
	                add(comissaoField);
	            }
	        }
        });
        
        // JTable table = 
        
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
