package DTO;

public class ProdutoDTO {
    private String nome;
    private String descricao;
    private double precodecompra;
    private double precodevenda;
    private int quantidadecomprada;
    private int quantidadevendida;
    private int codprod;

    public ProdutoDTO(String nome, String descricao, double precodecompra, double precodevenda, int quantidadecomprada, int quantidadevendida, int codprod) {
        this.nome = nome;
        this.descricao = descricao;
        this.precodecompra = precodecompra;
        this.precodevenda = precodevenda;
        this.quantidadecomprada = quantidadecomprada;
        this.quantidadevendida = quantidadevendida;
        this.codprod = codprod;
    }

    public ProdutoDTO() {
    }

    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPrecodecompra() {
        return precodecompra;
    }
    public double getPrecodevenda() {
        return precodevenda;
    }
    public int getQuantidadecomprada() {
        return quantidadecomprada;
    }
    public int getQuantidadevendida() {
        return quantidadevendida;
    }
    public int getCodprod() {
        return codprod;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPrecodecompra(double precodecompra) {
        this.precodecompra = precodecompra;
    }
    public void setPrecodevenda(double precodevenda) {
        this.precodevenda = precodevenda;
    }
    public void setQuantidadecomprada(int quantidadecomprada) {
        this.quantidadecomprada = quantidadecomprada;
    }
    public void setQuantidadevendida(int quantidadevendida) {
        this.quantidadevendida = quantidadevendida;
    }
    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }
    
}
