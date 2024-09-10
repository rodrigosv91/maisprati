public class Pix extends FormaPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado via Pix usando a chave: " + chavePix);
        } else {
            System.out.println("Falha ao processar o pagamento via Pix.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica básica de validação do Pix (simples validação de chave)
        if (chavePix.length() > 5) {
            return true;
        } else {
            return false;
        }
    }
}
