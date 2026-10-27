public class SistemaDePagamento {
    public static void Main(String[] args){
        //Construtor o processador de pgto
        iprocessadorPagamento processador = new gatewayPagamentoAdaptador(new gatewayPagamentoLegado());
         
        String cartao "12345678945";
        double valor =  150;
        if(processador.validarCartao(cartao)){
            processador.processarPagamento(valor);
        }

    }
}