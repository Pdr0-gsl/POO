public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    // Construtores
    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Método que vende os produtos
    public double vender(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
            return 0;
        } else {
            this.quantidade -= quantidade;
            double totalVenda = quantidade * valor;
            return totalVenda;
        }
    }

    // Método que compra os produtos
    public void comprar(int quantidade, double novoValor) {
        this.quantidade += quantidade;
        this.valor = novoValor;
        System.out.println("Compra realizada! Estoque atualizado.");
    }

    public void comprar(int quantidade) {
        this.quantidade += quantidade;
        System.out.println("Compra realizada! Estoque atualizado.");
    }

    // Método que insere os dados do produto
    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
        System.out.println("Dados do produto atualizados.");
    }

    // Método que consulta os dados do produto
    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nNome: " + nome +
               "\nQuantidade: " + quantidade +
               "\nTipo: " + tipo +
               "\nValor: R$ " + valor;
    }

    // Método que compara os produtos
    public boolean igual(Produto outroProduto) {
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);
    }
}
