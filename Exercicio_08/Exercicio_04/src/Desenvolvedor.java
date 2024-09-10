public class Desenvolvedor extends Funcionario {

    // Construtor da subclasse Desenvolvedor
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o método calcularBonus para Desenvolvedor
    @Override
    public double calcularBonus() {
        return this.salario * 0.10; // 10% de bônus
    }

    // Sobrescrevendo o método trabalhar para Desenvolvedor
    @Override
    public void trabalhar() {
        System.out.println(nome + " está escrevendo código e desenvolvendo funcionalidades.");
    }
}
