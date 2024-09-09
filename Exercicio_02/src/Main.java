public class Main {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto1 = new Produto("Camiseta", 100.00, 100);

        // Exibindo as informações do produto
        produto1.exibirInformacoes();

        // Aplicando um desconto válido de 20%
        try {
            produto1.aplicarDesconto(20);
            System.out.println("Desconto aplicado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Exibindo as informações do produto após o desconto
        produto1.exibirInformacoes();

        // Tentando aplicar um desconto inválido de 60%
        try {
            produto1.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Exibindo as informações do produto após a tentativa de desconto inválido
        produto1.exibirInformacoes();
    }
}
