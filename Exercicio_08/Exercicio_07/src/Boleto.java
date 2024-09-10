public class Boleto extends FormaPagamento {

    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Boleto de R$" + valor + " gerado com sucesso. Código de barras: " + codigoBarras);
        } else {
            System.out.println("Falha ao gerar o boleto.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica básica de validação do boleto
        if (codigoBarras.length() == 47) {
            return true;
        } else {
            return false;
        }
    }
}
