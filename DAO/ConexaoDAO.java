package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public Connection conectaBD(){
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bd_produtos?user=root&password=";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conectado!");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados" + "\n" + e.getMessage());
        }       
        return conexao;
    }
    public void desconectaBD(Connection conexao){
        try {
            conexao.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com o banco de dados" + "\n" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        ConexaoDAO conexao = new ConexaoDAO();
        Connection con = conexao.conectaBD();
        conexao.desconectaBD(con);
    }
}
