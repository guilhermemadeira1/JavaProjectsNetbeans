package megaPower;

public class MaquinaCafe {
    int acucarDisponivel;
    
    void fazerCafe(int quantidadeAcucar){
              
          if(this.acucarDisponivel<quantidadeAcucar){
            System.out.println("Não há açúcar suficiente");
          }
          else{
            this.acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo café com "+quantidadeAcucar+" gramas de açúcar");
          }       
    }
    
    void fazerCafe(){
        
          if(acucarDisponivel<10){
            System.out.println("Não há açúcar suficiente");
          }
          else{
            this.acucarDisponivel -= 10;
            System.out.println("Fazendo café com 10 gramas de café");
          }  

    }
}
