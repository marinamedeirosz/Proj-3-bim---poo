package resto;
public class Main {
    public static void main(String args[]){
        Produto p1 = new Produto("maca", "maçãzinha boy", 0.5, 1.0, 5, 3);
        Produto.adicionarAoEstoque(p1);
        Produto p2 = new Produto("banana", "bananinha sorridente", 0.6, 1.2, 7, 5);
        Produto.adicionarAoEstoque(p2);
    
        Produto.imprimeEstoque();
        Produto.resumoProdutosAcabando();
        Produto.lucroVendas();
        Produto.reabasteceEstoque("maca", 7);
        Produto.imprimeEstoque();
        Produto.baixa("maca", 5);
        Produto.imprimeEstoque();
    }
}