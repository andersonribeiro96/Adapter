public class AdapterApplication {

    public static void main(String[] args) {
        NovoProcessadorDePagamento novoProcessador = new NovoProcessadorDePagamento();
        ProcessadorDePagamento adaptador = new AdaptadorDePagamento(novoProcessador);
        adaptador.processarPagamento(150.00);
    }

}
