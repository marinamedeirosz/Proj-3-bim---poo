package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import DTO.ProdutoDTO;

public class ProdutoDAO {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<ProdutoDTO> listaProdutos = new ArrayList<>();

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

    public void alterarProduto(ProdutoDTO objprodutodto) {
        String sql = "update produtos set nome = ?, descricao = ?, precodecompra = ?, precodevenda = ?, quantidadecomprada = ?, quantidadevendida = ?, codprod = ? where codprod = ?";
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
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao alterar produto" + "\n" + e.getMessage());
        }
    };
    public ArrayList<ProdutoDTO> consultarProduto(ProdutoDTO objprodutodto) {
        String sql = "select * from produtos where codprod = ?";
        conexao = (Connection) new ConexaoDAO().conectaBD();
        try{
            pst = (PreparedStatement) conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                ProdutoDTO obprodutodto = new ProdutoDTO();
                obprodutodto.setNome(rs.getString("nome"));
                obprodutodto.setDescricao(rs.getString("descricao"));
                obprodutodto.setPrecodecompra(rs.getDouble("precodecompra"));
                obprodutodto.setPrecodevenda(rs.getDouble("precodevenda"));
                obprodutodto.setQuantidadecomprada(rs.getInt("quantidadecomprada"));
                obprodutodto.setQuantidadevendida(rs.getInt("quantidadevendida"));
                obprodutodto.setCodprod(rs.getInt("codprod"));
                listaProdutos.add(obprodutodto);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar produto" + "\n" + e.getMessage());
            return null;
        }
        return listaProdutos;
    }
}
