
package exercicio1;

public class Genero {
    
    private int codigo;
    private String descricao;
    
    Genero(int codigo, String descricao) {
     this.codigo = codigo;
     this.descricao = descricao;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao; 
    }
    public String getDescricao(){
        return this.descricao;
    }
    
}
