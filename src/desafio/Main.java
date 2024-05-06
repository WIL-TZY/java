package desafio;

import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
// FlatLaf
import com.formdev.flatlaf.FlatDarkLaf;


// Tela Inicial
public class Main extends JFrame implements Serializable {
	// UID
	private static final long serialVersionUID = -7920548049239081278L;
	
	// Componentes & Atributos
    private JButton cadastroEmpresasButton;
    private JButton listarEmpresasButton;
    private JButton calcularImpostosButton;
    // Lista de empresas
    private List<Empresa> empresas = new ArrayList<>();
    
    // Construtor
    public Main() {
        initComponents();
    }

    // Inicialização dos componentes
    private void initComponents() {
    	// Lógica de criação da interface
        setTitle("Conta+");
        // EXIT_ON_CLOSE fecha toda a aplicação Swing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Proibir maximização
        setSize(300, 200);
        setLocationRelativeTo(null); // Centralizar na tela

        // Layout
        setLayout(new GridLayout(3, 1, 10, 10));

        // Configuração dos componentes
        createCadastroEmpresasButton();
        createListarEmpresasButton();
        createCalcularImpostosButton();
    }
    
    private void createCadastroEmpresasButton() {
        cadastroEmpresasButton = new JButton("Cadastro de Empresas");
        cadastroEmpresasButton.addActionListener(e -> abrirPainelCadastroEmpresas());
        add(cadastroEmpresasButton);
    }

    private void createListarEmpresasButton() {
        listarEmpresasButton = new JButton("Listagem de Empresas");
        listarEmpresasButton.addActionListener(e -> listarEmpresas());
        add(listarEmpresasButton);
    }

    private void createCalcularImpostosButton() {
        calcularImpostosButton = new JButton("Calcular Impostos");
        calcularImpostosButton.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Ação não concluída."));
        add(calcularImpostosButton);
    }

    // Método para abrir o painel de cadastro de empresas
    private void abrirPainelCadastroEmpresas() {
        // Nova janela de cadastramento
        JFrame cadastroFrame = new JFrame("Cadastro de Empresas");
        cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastroFrame.setResizable(false); // Proibir maximização
        // Criar o componente do painel
        PainelCadastro painel = new PainelCadastro();
        painel.setCadastroListener(new CadastroListener() {
        	@Override
        	public void onEmpresaCadastrada(
        	    String razaoSocial,
        	    int cnpj, // Alterado para int
        	    Setor setor,
        	    TipoSocietario tipoSocietario
        	) {
        	    Empresa novaEmpresa = new Empresa(razaoSocial, cnpj, setor, tipoSocietario);
        	    empresas.add(novaEmpresa);
        	    cadastroFrame.dispose(); // Fecha a janela de cadastro
        	}
        });
        cadastroFrame.getContentPane().add(painel);
        cadastroFrame.pack(); // Adaptar tamanho da janela ao novo tamanho
        cadastroFrame.setLocationRelativeTo(null); // Centralizar a nova janela
        cadastroFrame.setVisible(true);
    }
    
    // Método para listar as empresas
    private void listarEmpresas() {
        if (empresas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma empresa cadastrada.");
        } else {
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Empresas cadastradas:\n");
            for (Empresa empresa : empresas) {
                mensagem.append("- Razão Social: ").append(empresa.getRazaoSocial()).append("\n");
                mensagem.append("  CNPJ: ").append(empresa.getCnpj()).append("\n");
                mensagem.append("  Setor: ").append(empresa.getSetor()).append("\n");
                mensagem.append("  Tipo Societário: ").append(empresa.getTipoSocietario()).append("\n\n");
            }
            JOptionPane.showMessageDialog(this, mensagem.toString());
        }
    }
    
    // Método main
    public static void main(String[] args) {
        // Setup do Look and Feel do FlatLaf
        FlatDarkLaf.setup();
    	
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
