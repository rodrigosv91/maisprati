public class Main03 {
    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("Alice", 8000.00);
        gerente.exibirInformacoes();

        // Criando um objeto Desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bob", 5000.00);
        desenvolvedor.exibirInformacoes();
    }
}
