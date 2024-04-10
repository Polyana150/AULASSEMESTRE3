public class App {
    
    public void mandarpix(){}

    public void guardarDinheirobocofrinho(){}

    public void emitirBoleto(){
        System.out.println("Estou na minha classe app e quero imprimir um boleto");
        Boleto variavelBoleto= new Boleto(10, "49876942", "hoje guys");
        //o encapsulamento resolve a duplicação de valores
        variavelBoleto.emitirBoleto();
        
        // variavelBoleto.agendarBoleto();
        variavelBoleto.cancelarBoleto( );
    }}  
