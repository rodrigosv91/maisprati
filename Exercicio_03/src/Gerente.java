public class Gerente extends Funcionario {

    // Construtor da subclasse Gerente
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o método calcularBonus para Gerente
    @Override
    public double calcularBonus() {
        return this.salario * 0.20; // 20% de bônus
    }
}
