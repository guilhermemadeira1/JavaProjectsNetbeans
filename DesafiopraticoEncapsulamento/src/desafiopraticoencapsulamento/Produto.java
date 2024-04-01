package desafiopraticoencapsulamento;

public class Produto {
    private int codigo;
    private String descricao;
    private static int saldo;
    
    Produto(){
      
    }
    @Override
    public String toString(){
        return "\n--Dados do Produto--\nProduto: "+getDescricao()+"\nCodigo: "+getCodigo();
    }
    public void setCodigo(int cod){
        this.codigo = cod;
    }
    public void setDecricao(String descr){
        this.descricao = descr;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public void registrarEntrada(int quantidade){
        this.saldo +=quantidade; //saldo = saldo+quantidade;
    }
    public void registrarSaida(int quantidade){
        this.saldo -=quantidade; //saldo = saldo-quantidade;
    }
}
