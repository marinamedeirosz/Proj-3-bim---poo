import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;
public class InterfaceGraficaCampos extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblEndereco;
    private JTextField txtEndereco;
    private JLabel lblTelefone;
    private JFormattedTextField txtTelefone;
    private JLabel lblCPF;
    private JFormattedTextField txtCPF;
    private final String[] tipoSanguineo = {"A", "B", "AB", "O"};
    private JLabel lblTipoSanguineo;
    private JComboBox<String> cmbTipoSanguineo;
    private final String[] fatorRH = {"+", "-"    };
    private JLabel lblRH;
    private JComboBox<String> cmbRH;
    private final String[] cursos = {"Ciência da Computação ","Analise e desenvolvimento de sistemas "};
            private JLabel lblCurso;
            private JComboBox<String> cmbCurso;
            private JLabel lblNomeEmergencia;
            private JTextField txtNomeEmergencia;
            private JLabel lblTelefoneEmergencia;
            private JFormattedTextField txtTelefoneEmergencia;
            private JButton btnInserir;
            private JButton btnCancelar;
            private Container ctn;
            public InterfaceGraficaCampos() {
                setSize(400, 500);
                setTitle("Sistema de cadastro");
                ctn = getContentPane();
                lblNome = new JLabel("Nome");
                txtNome = new JTextField();
                lblEndereco = new JLabel("Endereço");
                txtEndereco = new JTextField();
                lblTelefone = new JLabel("Telefone");
                try {
                    txtTelefone = new JFormattedTextField(new MaskFormatter("(##)#########"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                lblTipoSanguineo = new JLabel("Tipo de sanguineo");
                cmbTipoSanguineo = new JComboBox<String>(tipoSanguineo);
                lblRH = new JLabel("Fator RH");
                cmbRH = new JComboBox<String>(fatorRH);
                lblCurso = new JLabel("Curso");
                cmbCurso = new JComboBox<String>(cursos);
                lblNomeEmergencia = new JLabel("Contato de emergência ");
                    txtNomeEmergencia = new JTextField(); lblTelefoneEmergencia = new JLabel("Telefone");
                    try {
                        txtTelefoneEmergencia = new
                        JFormattedTextField(new MaskFormatter("(##)#########"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    lblCPF = new JLabel("CPF");
                    try {
                        txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    btnInserir = new JButton("Inserir"); btnCancelar = new JButton("Cancelar"); ctn.setLayout(null); lblNome.setBounds(0, 0, 100, 25); txtNome.setBounds(150, 0, 200, 25); lblEndereco.setBounds(0, 50, 100, 25); txtEndereco.setBounds(150, 50, 200, 25); lblTelefone.setBounds(0, 100, 100, 25); txtTelefone.setBounds(150, 100, 200, 25); lblCPF.setBounds(0, 150, 100, 25); txtCPF.setBounds(150, 150, 200, 25); lblTipoSanguineo.setBounds(0, 200, 200, 25); cmbTipoSanguineo.setBounds(150, 200, 50, 25); lblRH.setBounds(220, 200, 50, 25); cmbRH.setBounds(280, 200, 50, 25); lblCurso.setBounds(0, 250, 200, 25); cmbCurso.setBounds(150, 250, 200, 25); lblNomeEmergencia.setBounds(0, 300, 200, 25); txtNomeEmergencia.setBounds(150, 300, 200, 25); lblTelefoneEmergencia.setBounds(0, 350, 200, 25); txtTelefoneEmergencia.setBounds(150, 350, 200, 25); btnInserir.setBounds(100, 400, 100, 50); btnCancelar.setBounds(200, 400, 100, 50); ctn.add(lblNome); ctn.add(txtNome); ctn.add(lblEndereco); ctn.add(txtEndereco); ctn.add(lblTelefone); ctn.add(txtTelefone); ctn.add(lblCPF); ctn.add(txtCPF); ctn.add(lblTipoSanguineo); ctn.add(cmbTipoSanguineo); ctn.add(lblRH); ctn.add(cmbRH); ctn.add(lblCurso); ctn.add(cmbCurso); ctn.add(lblNomeEmergencia); ctn.add(txtNomeEmergencia); ctn.add(lblTelefoneEmergencia); ctn.add(txtTelefoneEmergencia); ctn.add(btnInserir); ctn.add(btnCancelar); setVisible(true); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                public static void main(String[] args) {
                    new InterfaceGraficaCampos();
                }
            }
