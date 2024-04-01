
package exercicio3;


public class Exercicio3 {
    public static void main (String[]args){
        Veiculo v1 = new Veiculo("Fiesta");
        System.out.println("--Veiculo "+v1.getNome()+"--");
        
        int i = 1;
         while(i<=5){
             v1.acelerar();
             v1.mostrarVelocidade();
             i++;
         }
    }
}
