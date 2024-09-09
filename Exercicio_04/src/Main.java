public class Main {
    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("Alice", 8000.00);
        gerente.trabalhar();

        // Criando um objeto Desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bob", 5000.00);
        desenvolvedor.trabalhar();
    }
}
