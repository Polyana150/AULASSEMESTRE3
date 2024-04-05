public class Boleto {
    private double valor;
    private String codigodebarras;
    private String vencimento;
    public void emitirBoleto( double valor,
    String codigodebarras,
    String vencimento){
        System.out.println("Emitindo novo boleto:" + valor +"," + vencimento + "," + codigodebarras);

        Boleto variavelBoleto = new Boleto();
        variavelBoleto.valor = valor;
        variavelBoleto.vencimento = vencimento;
        variavelBoleto.codigodebarras = codigodebarras;

    System.out.println(new Impressao());
    new Impressao().imprimir(variavelBoleto);
    }
       
    public String lercodigodebarras(){

        return codigodebarras;
    }

    public void alterarvaloraposvencimento(int juros){ 

        valor = valor + juros;
    }



    public double lervalor(){

        return valor;
    }

    public String lervencimento(){

        return vencimento;
    }

    public void cancelarBoleto(){}

    public void receberBoleto(){}
}
