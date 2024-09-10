public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase(); // Estagiário não recebe bônus
    }

    @Override
    public double calcularBonus() {
        return 0; // Estagiário não recebe bônus
    }
}
