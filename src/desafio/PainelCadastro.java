package desafio;

import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCadastro extends JPanel implements Serializable {

	// UID
	private static final long serialVersionUID = 3490465714692430307L;
	
	// Componentes
    private JTextField razaoSocialField;
    private JTextField cnpjField;
    private JComboBox<Setor> setorComboBox;
    private JComboBox<TipoSocietario> tipoSocietarioComboBox;
    private JButton cadastrarButton;
    private CadastroListener cadastroListener;

    // Construtor
    public PainelCadastro() {
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
        setorComboBox = new JComboBox<>(Setor.values());
        add(setorComboBox);

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
        String cnpjStr = cnpjField.getText(); // Obtem o CNPJ como String
        int cnpj = Integer.parseInt(cnpjStr); // Converte a String em int
        Setor setor = (Setor) setorComboBox.getSelectedItem();
        TipoSocietario tipoSocietario = (TipoSocietario) tipoSocietarioComboBox.getSelectedItem();

        // Verificar se o listener está definido e notificar
        if (cadastroListener != null) {
            cadastroListener.onEmpresaCadastrada(razaoSocial, cnpj, setor, tipoSocietario);
        }
    }

    public void setCadastroListener(CadastroListener listener) {
        this.cadastroListener = listener;
    }

    // Método para limpar os campos do formulário
    public void limparCampos() {
        razaoSocialField.setText("");
        cnpjField.setText("");
        setorComboBox.setSelectedIndex(0);
        tipoSocietarioComboBox.setSelectedIndex(0);
    }
}
