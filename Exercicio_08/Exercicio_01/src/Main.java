public class Main {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto1 = new Produto("Camiseta", 49.99, 100);

        // Exibindo as informações do produto
        produto1.exibirInformacoes();

        // Tentando definir um preço negativo (deve exibir uma mensagem de erro)
        produto1.setPreco(-10);

        // Tentando definir uma quantidade negativa (deve exibir uma mensagem de erro)
        produto1.setQuantidadeEmEstoque(-5);

        // Modificando o preço e a quantidade com valores válidos
        produto1.setPreco(59.99);
        produto1.setQuantidadeEmEstoque(150);

        // Exibindo as informações atualizadas do produto
        produto1.exibirInformacoes();
    }
}
