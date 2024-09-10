public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.20; // Bônus de 20% do salário base
    }
}
