package VIEW;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;

public class frmPesquisarProdutoVIEW {
    javax.swing.JTable tabelaProdutos;
    
    tabelaProdutos = new javax.swing.JTable();
    
    tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
    private void pesquisarProduto(){
       try{
            ProdutoDAO objprodutoDAO = new ProdutoDAO();
            DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
            modelo.setNumRows(0);

            ArrayList<ProdutoDTO> listaProdutos = objprodutoDAO.consultarProduto(objprodutodto);
            for (int i = 0; i < listaProdutos.size(); i++){
                modelo.addRow(new Object[]{
                    listaProdutos.get(i).getCodprod(),
                    listaProdutos.get(i).getNome(),
                    listaProdutos.get(i).getDescricao(),
                    listaProdutos.get(i).getPrecodecompra(),
                    listaProdutos.get(i).getPrecodevenda(),
                    listaProdutos.get(i).getQuantidadecomprada(),
                    listaProdutos.get(i).getQuantidadevendida()
                });
            }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar valores" + "\n" + e.getMessage());
        }
            
    }
}
