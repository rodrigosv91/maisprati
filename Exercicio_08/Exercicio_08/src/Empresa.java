import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    public void promoverFuncionario(Funcionario funcionario, Funcionario novoFuncionario) {
        int index = funcionarios.indexOf(funcionario);
        if (index != -1) {
            funcionarios.set(index, novoFuncionario);
        }
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - Salário: R$" + funcionario.calcularSalario());
        }
    }
}
