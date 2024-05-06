package desafio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
// FlatLaf
import com.formdev.flatlaf.FlatDarkLaf;


// Tela Inicial
public class Main extends JFrame {
	// UID
	private static final long serialVersionUID = -7920548049239081278L;
	
	// Componentes & Atributos
    private JButton cadastroEmpresasButton;
    private JButton listarEmpresasButton;
    private JButton calcularImpostosButton;
    private List<String> empresas; // Lista de empresas cadastradas
    
    // Construtor
    public Main() {
        initComponents();
    }

    // Inicialização dos componentes
    private void initComponents() {
        setTitle("Conta+");
        // EXIT_ON_CLOSE fecha toda a aplicação Swing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Proibir maximização
        setSize(300, 200);
        setLocationRelativeTo(null); // Centralizar na tela

        // Layout
        setLayout(new GridLayout(3, 1, 10, 10));

        // Botão para Cadastro de Empresas
        cadastroEmpresasButton = new JButton("Cadastro de Empresas");
        cadastroEmpresasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirPainelCadastroEmpresas();
            }
        });
        add(cadastroEmpresasButton);

        // Botão para Listagem de Empresas
        listarEmpresasButton = new JButton("Listagem de Empresas");
        listarEmpresasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação para listar as empresas
                listarEmpresas();
            }
        });
        add(listarEmpresasButton);

        // Botão para Calcular Impostos
        calcularImpostosButton = new JButton("Calcular Impostos");
        calcularImpostosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação para calcular os impostos (por enquanto um pop up)
                JOptionPane.showMessageDialog(Main.this, "Ação não concluída.");
            }
        });
        add(calcularImpostosButton);
    }

    // Método para abrir o painel de cadastro de empresas
    private void abrirPainelCadastroEmpresas() {
    	// Nova janela de cadastramento
        JFrame cadastroFrame = new JFrame("Cadastro de Empresas");
        // DISPOSE_ON_CLOSE fecha apenas a janela específica
        cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastroFrame.setResizable(false); // Proibir maximização
        // Criar o componente do painel
        cadastroFrame.getContentPane().add(new Painel());
        cadastroFrame.pack(); // Adaptar tamanho da janela ao novo tamanho
        cadastroFrame.setLocationRelativeTo(null); // Centralizar a nova janela
        cadastroFrame.setVisible(true);
    }
    
    // Método para listar as empresas
    private void listarEmpresas() {
        // Simulação de listagem de empresas
        String[] empresas = {"Empresa 1", "Empresa 2", "Empresa 3", "Empresa 4", "Empresa 5"};

        // Exibir a lista de empresas em uma caixa de diálogo
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Empresas cadastradas:\n");
        for (String empresa : empresas) {
            mensagem.append("- ").append(empresa).append("\n");
        }
        JOptionPane.showMessageDialog(this, mensagem.toString());
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
