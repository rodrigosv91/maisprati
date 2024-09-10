public class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor da classe
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        setPreco(preco); // Usando os métodos setters para garantir as validações
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Quantidade em estoque não pode ser negativa.");
        }
    }

    // Método para aplicar desconto no preço
    public void aplicarDesconto(double porcentagem) throws IllegalArgumentException {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto inválido! Deve ser entre 0% e 50%.");
        }
        this.preco -= this.preco * (porcentagem / 100);
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
