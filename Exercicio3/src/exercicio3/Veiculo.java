package exercicio3;

public class Veiculo {
    String nome;
    private float velocidade = 0;
    
    Veiculo(String nome){
        this.nome = nome;
    }
    public String getNome(){
         return this.nome;
    }
    public void acelerar(){
        if(this.velocidade<=10)
            velocidade++;
    }
    void frear(){
        if(velocidade>0)
            velocidade--;            
    }
    void mostrarVelocidade(){
        System.out.println("Velocidade: "+velocidade+"km/h");
    }
}

