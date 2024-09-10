public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso no cartão de crédito.");
        } else {
            System.out.println("Falha ao processar o pagamento com o cartão de crédito.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica básica de validação do cartão de crédito
        if (numeroCartao.length() == 16 && validade.length() == 5 && cvv.length() == 3) {
            return true;
        } else {
            return false;
        }
    }
}
