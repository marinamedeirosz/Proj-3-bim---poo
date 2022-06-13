package VIEW;

import javax.swing.*;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class frmLoginVIEW extends JFrame {
    private JLabel lblNomeUsuario;
    private JTextField txtNomeUsuario;
    private JLabel lblSenhaUsuario;
    private JPasswordField txtSenhaUsuario;
    private JButton btnEntrar;
    private JButton btnCancelar;
    private Container ctn;
    public frmLoginVIEW() {
        setSize(400, 500);
        setTitle("Sistema de cadastro");
        ctn = getContentPane();
        lblNomeUsuario = new JLabel("Nome do Usuario");
        txtNomeUsuario = new JTextField();
        lblSenhaUsuario = new JLabel("Senha");
        txtSenhaUsuario = new JPasswordField();
        btnEntrar = new JButton("Entrar");
        btnCancelar = new JButton("Cancelar");

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        ctn.setLayout(null);
        lblNomeUsuario.setBounds(10, 10, 100, 20);
        txtNomeUsuario.setBounds(10, 30, 200, 20);
        lblSenhaUsuario.setBounds(10, 50, 100, 20);
        txtSenhaUsuario.setBounds(10, 70, 200, 20);
        btnEntrar.setBounds(10, 270, 100, 20);
        btnCancelar.setBounds(120, 270, 100, 20);
        ctn.add(lblNomeUsuario);
        ctn.add(txtNomeUsuario);
        ctn.add(lblSenhaUsuario);
        ctn.add(txtSenhaUsuario);
        ctn.add(btnEntrar);
        ctn.add(btnCancelar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Logar();
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }

    public static void main(String[] args) {
        new frmLoginVIEW();
    }
    private void Logar(){
        try{    
            String nomeUsuario;
            char[] SenhaUsuario;
            nomeUsuario = txtNomeUsuario.getText();
            SenhaUsuario = txtSenhaUsuario.getPassword();
            UsuarioDTO objUsuariodto = new UsuarioDTO(nomeUsuario, SenhaUsuario);
            UsuarioDAO objUsuariodao = new UsuarioDAO();
            ResultSet rsUsuarioDAO = objUsuariodao.autenticaUsuario(objUsuariodto);
            if (rsUsuarioDAO.next()) {
                JOptionPane.showMessageDialog(null, "Usuario autenticado com sucesso");
                dispose();
                new frmPrincipalVIEW();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuario" + "\n" + e.getMessage());
        }
    }
}

