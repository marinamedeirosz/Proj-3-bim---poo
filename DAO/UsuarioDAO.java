package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import DTO.UsuarioDTO;

public class UsuarioDAO {
    Connection conexao;
    
    public ResultSet autenticaUsuario(UsuarioDTO objusuariodto) {
        conexao = (Connection) new ConexaoDAO().conectaBD();
        try{
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pst = (PreparedStatement) conexao.prepareStatement(sql);
            pst.setString(1, objusuariodto.getNome_usuario());
            pst.setNString(2, objusuariodto.getSenha_usuario());
            ResultSet rs = pst.executeQuery();
            return rs;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuario" + "\n" + e.getMessage());
            return null;
        }        
    }
}
