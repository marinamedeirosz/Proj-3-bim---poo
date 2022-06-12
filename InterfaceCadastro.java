import javax.swing.*;
import java.awt.*;
public class InterfaceCadastro extends JFrame {
    private JLabel lblNomeProduto;
    private JTextField txtNomeProduto;
    private JLabel lblPreco;
    private JTextField txtPreco;
    private JLabel lblQuantidade;
    private JTextField txtQuantidade;
    private JLabel lblDescricao;
    private JTextField txtDescricao;
    private JButton btnInserir;
    private JButton btnCancelar;
    private Container ctn;
    public InterfaceCadastro() {
        setSize(400, 500);
        setTitle("Sistema de cadastro");
        ctn = getContentPane();
        lblNomeProduto = new JLabel("Nome do produto");
        txtNomeProduto = new JTextField();
        lblPreco = new JLabel("Preço");
        txtPreco = new JTextField();
        lblQuantidade = new JLabel("Quantidade");
        txtQuantidade = new JTextField();
        lblDescricao = new JLabel("Descrição");
        txtDescricao = new JTextField();
        btnInserir = new JButton("Inserir");
        btnCancelar = new JButton("Cancelar");

        ctn.setLayout(null);
        lblNomeProduto.setBounds(10, 10, 100, 20);
        txtNomeProduto.setBounds(10, 30, 200, 20);
        lblPreco.setBounds(10, 50, 100, 20);
        txtPreco.setBounds(10, 70, 200, 20);
        lblQuantidade.setBounds(10, 90, 100, 20);
        txtQuantidade.setBounds(10, 110, 200, 20);
        lblDescricao.setBounds(10, 130, 100, 20);
        txtDescricao.setBounds(10, 150, 200, 20);
        btnInserir.setBounds(10, 170, 100, 20);
        btnCancelar.setBounds(120, 170, 100, 20);
        ctn.add(lblNomeProduto);
        ctn.add(txtNomeProduto);
        ctn.add(lblPreco);
        ctn.add(txtPreco);
        ctn.add(lblQuantidade);
        ctn.add(txtQuantidade);
        ctn.add(lblDescricao);
        ctn.add(txtDescricao);
        ctn.add(btnInserir);
        ctn.add(btnCancelar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new InterfaceCadastro();}
}