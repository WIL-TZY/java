package prova;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;

public class Main extends JFrame {
	
	// UID
	private static final long serialVersionUID = 7327827091833093146L;
	
	// Componentes & Atributos
    private JButton cadastroButton;
    private JButton listarButton;
    private JButton calcularButton;
    // Lista de funcionários
    private List<Funcionario> funcionarios = new ArrayList<>();
    
    // Construtor
    public Main() {
        initComponents();
    }
	
    // Inicialização dos componentes
    private void initComponents() {
    	// Lógica de criação da interface
        setTitle("Sistema de Gerenciamento de Funcionários");
        // EXIT_ON_CLOSE fecha toda a aplicação Swing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Proibir maximização
        setSize(400, 200);
        setLocationRelativeTo(null); // Centralizar na tela

        // Layout
        setLayout(new GridLayout(3, 1, 10, 10));

        // Configuração dos componentes
        createCadastroButton();
        createListarButton();
        createCalcularButton();
    }
    
    private void createCadastroButton() {
        cadastroButton = new JButton("Cadastrar Funcionário");
        cadastroButton.addActionListener(e -> abrirPainelCadastro());
        add(cadastroButton);
    }

    private void createListarButton() {
        listarButton = new JButton("Listar Funcionários");
        listarButton.addActionListener(e -> listarFuncionarios());
        add(listarButton);
        
    }

    private void createCalcularButton() {
        calcularButton = new JButton("Calcular Bonificações");
        calcularButton.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Não deu tempo :("));
        add(calcularButton);
        
    }

    // Método para abrir o painel de cadastro de empresas
    private void abrirPainelCadastro() {
        // Nova janela de cadastramento
        JFrame cadastroFrame = new JFrame("Sistema de Gerenciamento de Funcionários XPTO");
        cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastroFrame.setResizable(false); // Proibir maximização
        // Criar o componente do painel
        PainelCalculo painel = new PainelCalculo();
        painel.setCadastroListener(new CadastroListener() {
        	@Override
        	public void onFuncionarioCadastrado(String nome, String cpf, Departamento departamento, Cargo cargo) {
        	    Gerente novoFuncionario = new Gerente(nome, cpf, departamento, cargo, 999);
        	    funcionarios.add(novoFuncionario);
        	    cadastroFrame.dispose(); // Fecha a janela de cadastro
        	}
        });
        cadastroFrame.getContentPane().add(painel);
        cadastroFrame.pack(); // Adaptar tamanho da janela ao novo tamanho
        cadastroFrame.setLocationRelativeTo(null); // Centralizar a nova janela
        cadastroFrame.setVisible(true);
    }
    
    // Método para listar as empresas
    private void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma empresa cadastrada.");
        } else {
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Funcionários cadastradas:\n");
            for (Funcionario funcionario : funcionarios) {
                mensagem.append("  Nome: ").append(funcionario.getNome()).append("\n");
                mensagem.append("  CPF: ").append(funcionario.getCpf()).append("\n");
                mensagem.append("  Depto.: ").append(funcionario.getDepartamento()).append("\n");
                mensagem.append("  Cargo: ").append(funcionario.getCargo()).append("\n\n");
            }
            JOptionPane.showMessageDialog(this, mensagem.toString());
        }
    }
    
	public static void main(String[] args) {
	    // Setup do FlatLaf
        FlatDarkLaf.setup();
        
        // Criar o Main Frame
        Main main = new Main();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                main.setVisible(true);
            }
        });
	}
}
