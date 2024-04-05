public class Impressao {

    public void imprimir(Boleto variavelBoleto){
        // variavelBoleto.valor = 100;
        System.out.println("Finalmente Imprimindo...!" + variavelBoleto.lercodigodebarras() + variavelBoleto.lervencimento() + variavelBoleto.lervalor());
    }

    public void escanear(){}

    //re
    
}
