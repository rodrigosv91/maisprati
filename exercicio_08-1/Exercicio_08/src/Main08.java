public class Main08 {
    public static void main(String[] args) {
        // Criando a empresa
        Empresa empresa = new Empresa();

        // Adicionando funcionários
        Funcionario gerente = new Gerente("Carlos Silva", 8000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana Pereira", 5000);
        Funcionario estagiario = new Estagiario("Lucas Martins", 2000);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(estagiario);

        // Exibindo funcionários e seus salários
        empresa.exibirFuncionarios();
        System.out.println("Total da folha de pagamento: R$" + empresa.calcularFolhaPagamento());

        // Promovendo o estagiário para desenvolvedor
        Funcionario novoDesenvolvedor = new Desenvolvedor(estagiario.getNome(), estagiario.getSalarioBase() * 1.5);
        empresa.promoverFuncionario(estagiario, novoDesenvolvedor);

        // Exibindo funcionários após a promoção
        System.out.println("\nApós a promoção:");
        empresa.exibirFuncionarios();
        System.out.println("Total da folha de pagamento: R$" + empresa.calcularFolhaPagamento());
    }
}
