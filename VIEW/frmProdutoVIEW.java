package VIEW;

import javax.swing.*;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;

import java.awt.*;
import java.awt.event.*;

public class frmProdutoVIEW extends JFrame {
    private JLabel lblNomeProduto;
    private JTextField txtNomeProduto;
    private JLabel lblPrecoDeCompra;
    private JTextField txtPrecoDeCompra;
    private JLabel lblPrecoDeVenda;
    private JTextField txtPrecoDeVenda;
    private JLabel lblQuantidade;
    private JTextField txtQuantidade;
    private JLabel lblDescricao;
    private JTextField txtDescricao;
    private JLabel lblCodProd;
    private JTextField txtCodProd;
    private JButton btnCadastrar;
    private JButton btnCancelar;
    private Container ctn;
    public frmProdutoVIEW() {
        setSize(400, 500);
        setTitle("Sistema de cadastro");
        ctn = getContentPane();
        lblNomeProduto = new JLabel("Nome do produto");
        txtNomeProduto = new JTextField();
        lblPrecoDeCompra = new JLabel("Preço de compra");
        txtPrecoDeCompra = new JTextField();
        lblPrecoDeVenda = new JLabel("Preço de venda");
        txtPrecoDeVenda = new JTextField();
        lblQuantidade = new JLabel("Quantidade");
        txtQuantidade = new JTextField();
        lblDescricao = new JLabel("Descrição");
        txtDescricao = new JTextField();
        lblCodProd = new JLabel("Código do produto");
        txtCodProd = new JTextField();
        btnCadastrar = new JButton("Cadastrar");
        btnCancelar = new JButton("Cancelar");

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        ctn.setLayout(null);
        lblNomeProduto.setBounds(10, 10, 100, 20);
        txtNomeProduto.setBounds(10, 30, 200, 20);
        lblPrecoDeCompra.setBounds(10, 50, 100, 20);
        txtPrecoDeCompra.setBounds(10, 70, 200, 20);
        lblPrecoDeVenda.setBounds(10, 90, 100, 20);
        txtPrecoDeVenda.setBounds(10, 110, 200, 20);
        lblQuantidade.setBounds(10, 130, 100, 20);
        txtQuantidade.setBounds(10, 150, 200, 20);
        lblDescricao.setBounds(10, 170, 100, 20);
        txtDescricao.setBounds(10, 190, 200, 20);
        lblCodProd.setBounds(10, 210, 100, 20);
        txtCodProd.setBounds(10, 230, 200, 20);
        btnCadastrar.setBounds(10, 270, 100, 20);
        btnCancelar.setBounds(120, 270, 100, 20);
        ctn.add(lblNomeProduto);
        ctn.add(txtNomeProduto);
        ctn.add(lblPrecoDeCompra);
        ctn.add(txtPrecoDeCompra);
        ctn.add(lblPrecoDeVenda);
        ctn.add(txtPrecoDeVenda);
        ctn.add(lblQuantidade);
        ctn.add(txtQuantidade);
        ctn.add(lblDescricao);
        ctn.add(txtDescricao);
        ctn.add(lblCodProd);
        ctn.add(txtCodProd);
        ctn.add(btnCadastrar);
        ctn.add(btnCancelar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String nome;
        String descricao;
        double precodecompra;
        double precodevenda;
        int quantidadecomprada;
        int quantidadevendida;
        int codprod;
        nome = txtNomeProduto.getText();
        descricao = txtDescricao.getText();
        precodecompra = Double.parseDouble(txtPrecoDeCompra.getText());
        precodevenda = Double.parseDouble(txtPrecoDeVenda.getText());
        quantidadecomprada = Integer.parseInt(txtQuantidade.getText());
        quantidadevendida = Integer.parseInt(txtQuantidade.getText());
        codprod = Integer.parseInt(txtCodProd.getText());
        ProdutoDTO objprodutodto = new ProdutoDTO(nome, descricao, precodecompra, precodevenda, quantidadecomprada, quantidadevendida, codprod);
        ProdutoDAO objprodutodao = new ProdutoDAO();
        objprodutodao.cadastrarProduto(objprodutodto);
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }

    public static void main(String[] args) {
        new frmProdutoVIEW();
    }
}
