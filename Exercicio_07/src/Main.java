import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando diferentes formas de pagamento
        FormaPagamento cartao = new CartaoCredito("1234567812345678", "João Silva", "12/25", "123");
        FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234567");
        FormaPagamento pix = new Pix("joao123@banco.com");

        // Criando uma lista de formas de pagamento
        List<FormaPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(cartao);
        pagamentos.add(boleto);
        pagamentos.add(pix);

        // Processando os pagamentos
        for (FormaPagamento pagamento : pagamentos) {
            pagamento.processarPagamento(150.0);
            System.out.println();
        }
    }
}
