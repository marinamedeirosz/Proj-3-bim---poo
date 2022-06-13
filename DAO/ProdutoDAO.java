package DAO;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import DTO.ProdutoDTO;

public class ProdutoDAO {

    Connection conexao;
    PreparedStatement pst;

    public void cadastrarProduto(ProdutoDTO objprodutodto) {
        String sql = "insert into produtos (nome, descricao, precodecompra, precodevenda, quantidadecomprada, quantidadevendida, codprod) values (?,?,?,?,?,?,?)";
        conexao = (Connection) new ConexaoDAO().conectaBD();

        try{
            pst = (PreparedStatement) conexao.prepareStatement(sql);
            pst.setString(1, objprodutodto.getNome());
            pst.setString(2, objprodutodto.getDescricao());
            pst.setDouble(3, objprodutodto.getPrecodecompra());
            pst.setDouble(4, objprodutodto.getPrecodevenda());
            pst.setInt(5, objprodutodto.getQuantidadecomprada());
            pst.setInt(6, objprodutodto.getQuantidadevendida());
            pst.setInt(7, objprodutodto.getCodprod());
            pst.execute();
            pst.close();

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto" + "\n" + e.getMessage());
        }
            
    };
}
