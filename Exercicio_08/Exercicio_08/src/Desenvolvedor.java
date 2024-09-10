public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.10; // Bônus de 10% do salário base
    }
}
