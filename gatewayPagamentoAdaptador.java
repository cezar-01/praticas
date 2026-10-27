public class gatewayPagamentoAdaptador implements iprocessadorPagamento{
    //Atributo para reter a classe incompativel 
    gatewayPagamentoLegado geatewayPgto;

    //construtoer que rcebe a classa incompativel 
    publid gatewayPagamentoAdaptador(gatewayPagamentoLegado gateaway PA) {
        this.gatewayPgto=gatewayPgto;
    }

@Overrride
public void porcessarr Pagamento(Double valor){
//metodo que invoca o legadp
this.gatewaygtp.efetuarPagamento(valor,"BRL");

}

@Overrride
public boolean validarCartao(String cartao){

    return this.geatewayPgto.validar(cartao);
}



}