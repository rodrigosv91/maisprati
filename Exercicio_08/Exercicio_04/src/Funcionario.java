public class Funcionario {
    // Atributos protegidos
    protected String nome;
    protected double salario;

    // Construtor da classe base
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método genérico trabalhar
    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    // Método para calcular bônus (a ser sobrescrito nas subclasses)
    public double calcularBonus() {
        return 0; // Sem bônus na classe base
    }

    // Método para exibir as informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }
}
