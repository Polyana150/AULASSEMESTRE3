public class Boleto {
    double valor;
    String codigodebarras;
    String vencimento;
    public void emitirBoleto( double valor,
    String codigodebarras,
    String vencimento){
        System.out.println("Emitindo novo boleto:" + valor +"," + vencimento + "," + codigodebarras);
        // variavelBoleto.valor = valor;
        // variavelBoleto.vencimento = vencimento;
        // variavelBoleto.codigodebarras = codigodebarras ;
    }
       
    public void cancelarBoleto(){}

    public void receberBoleto(){}
}
