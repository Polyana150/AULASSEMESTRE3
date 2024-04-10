//PESQUISAR SOBRE O CONSTRUTOR PRIVADO

public class Boleto {

    //variavei de classe serão SEMPRE privadas
    private double valor;
    private String codigodebarras;
    private String vencimento;

    //construtor = metodo especial
    // caracteristicas:
    // 1.só executado uma unica vez(durante a instanciação)
    // 2.nao tem retorno
    // 3.precisa ter o mesmo nome da casse 

    public Boleto( double valor, String codigodebarras, String vencimento){
        this.valor = valor;
        this.vencimento = vencimento;
        this.codigodebarras = codigodebarras;

    }
    public void emitirBoleto(){
        System.out.println("Emitindo novo boleto:" + valor +"," + vencimento + "," + codigodebarras);

    // Boleto variavelBoleto = new Boleto();
    // variavelBoleto.valor = valor;
    // variavelBoleto.vencimento = vencimento;
    // variavelBoleto.codigodebarras = codigodebarras;

    System.out.println(new Impressao());
    new Impressao().imprimir(this);
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
