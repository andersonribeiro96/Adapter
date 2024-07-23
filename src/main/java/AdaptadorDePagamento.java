public class AdaptadorDePagamento implements ProcessadorDePagamento {

    private final NovoProcessadorDePagamento novoProcessador;

    public AdaptadorDePagamento(NovoProcessadorDePagamento novoProcessador) {
        this.novoProcessador = novoProcessador;
    }

    @Override
    public void processarPagamento(double quantia) {
        novoProcessador.executarPagamento(quantia);
    }
}
