package desafio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel extends JPanel {

	// UID
	private static final long serialVersionUID = 69256482785954447L;
	
	// Componentes
    private JTextField razaoSocialField;
    private JTextField cnpjField;
    private JTextField setorField;
    private JComboBox<TipoSocietario> tipoSocietarioComboBox;
    private JButton cadastrarButton;

    // Construtor
    public Painel() {
        initComponents();
    }

    // Inicialização dos componentes
    private void initComponents() {
        setLayout(new GridLayout(5, 2, 5, 5));

        // Labels
        add(new JLabel("Razão Social:"));
        razaoSocialField = new JTextField();
        add(razaoSocialField);

        add(new JLabel("CNPJ:"));
        cnpjField = new JTextField();
        add(cnpjField);

        add(new JLabel("Setor:"));
        setorField = new JTextField();
        add(setorField);

        add(new JLabel("Tipo Societário:"));
        tipoSocietarioComboBox = new JComboBox<>(TipoSocietario.values());
        add(tipoSocietarioComboBox);

        // Botão de Cadastro
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarEmpresa();
            }
        });
        add(cadastrarButton);
    }

    // Método para cadastrar a empresa
    private void cadastrarEmpresa() {
        String razaoSocial = razaoSocialField.getText();
        String cnpj = cnpjField.getText();
        String setor = setorField.getText();
        TipoSocietario tipoSocietario = (TipoSocietario) tipoSocietarioComboBox.getSelectedItem();

        // Dados da empresa - salvar em um arquivo externo e exibir em uma mensagem
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Setor: " + setor);
        System.out.println("Tipo Societário: " + tipoSocietario);
    }

    // Método para limpar os campos do formulário
    public void limparCampos() {
        razaoSocialField.setText("");
        cnpjField.setText("");
        setorField.setText("");
        tipoSocietarioComboBox.setSelectedIndex(0);
    }
}
