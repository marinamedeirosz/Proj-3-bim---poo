import java.util.List;
import java.util.ArrayList;

public class Produto {
    String nome;
    String descricao;
    double precodecompra;
    double precodevenda;
    int quantidadecomprada;
    int quantidadevendida;
    static List <Produto> estoque = new ArrayList<>();

    /*Guardar a informação dos itens do estoque da cantina (nome, descrição, preço decompra, preço devendae
    quantidadecomprada, quantidadevendida)*/
    Produto(String nome, String descricao, double precodecompra, double precodevenda, int quantidadecomprada, int quantidadevendida){
        this.nome = nome;
        this.descricao = descricao;
        /*Não permitir que sejam cadastrados itens com preços inválidos, inclusive preço devenda menor que o preço de
        compra */
        /*Não permitir que a quantidade de itens disponíveis seja inválida*/

        if (precodecompra <= 0 || precodevenda <= 0 || quantidadecomprada <= 0 || quantidadevendida <= 0 || precodevenda <= precodecompra){
            throw new IllegalArgumentException("Valores Inválidos!");
        }else{
            this.precodecompra = precodecompra;
            this.precodevenda = precodevenda;
            this.quantidadecomprada = quantidadecomprada;
            this.quantidadevendida = quantidadevendida;
        }
    }
    /*Permitir que o administrador da cantina cadastre novos itens no estoque, ou adicione novas quantidadea itens já
    existentes*/
    public static void adicionarAoEstoque(Produto p){
        estoque.add(p);
    }
    public static void reabasteceEstoque(String nomeProduto, int quantComprada){
        for (int i = 0; i < estoque.size(); i++){
            if (nomeProduto == estoque.get(i).nome){
                estoque.get(i).quantidadecomprada += quantComprada;
            }
        }
    }
    String getProduto(){
        return "| Produto: " + nome + " | Descrição: " + descricao + " | Preço de compra: " + precodecompra + " | Preço de venda: " + precodevenda + " | Quantidade em estoque: " + quantidadecomprada + " | Quantidade vendida: " + quantidadevendida + " | ";
    }
    /*Dar baixa nos itens vendidos do estoque */
    public static void baixa (String nomeProduto, int quantVendida){
        for (int i = 0; i < estoque.size(); i++){
            if (nomeProduto == estoque.get(i).nome){
                /*Não permitir quea quantidade de itens disponíveis seja inválida */
                if(estoque.get(i).quantidadecomprada < quantVendida){    
                    throw new IllegalArgumentException("A quantidade de " + estoque.get(i).nome + " desejada é maior do que a quantidade existente no estoque!");
                }else{
                  estoque.get(i).quantidadecomprada -= quantVendida;
                  estoque.get(i).quantidadevendida += quantVendida;
                }
            }
        }
    }/*Mostrar um resumo dos itens e suas quantidades disponíveis */
    public static void imprimeEstoque(){
        for (int i = 0; i < estoque.size(); i++){
            System.out.println(estoque.get(i).getProduto());
        }
    }
    /*Mostrar resumo dos itens com quantidade baixa no estoque(abaixo de 50 itens) */
    public static void resumoProdutosAcabando(){
        for (int i = 0; i < estoque.size(); i++){
            int quantProd = estoque.get(i).quantidadecomprada - estoque.get(i).quantidadevendida;
            if (quantProd < 50){
                System.out.println(estoque.get(i).getProduto());
            }
        }
    }
    /*Mostrar resumo do lucro/prejuízo de acordo com a baixa dos produtos no estoque */
    public static void lucroVendas(){
        for (int i = 0; i < estoque.size(); i++){
            double lucroPorVenda = estoque.get(i).precodevenda - estoque.get(i).precodecompra;
            double lucroTotal = lucroPorVenda * estoque.get(i).quantidadevendida;
            System.out.println("O produto " + estoque.get(i).nome + " proporcionou um lucro de " + lucroTotal);
        }
    }
}
