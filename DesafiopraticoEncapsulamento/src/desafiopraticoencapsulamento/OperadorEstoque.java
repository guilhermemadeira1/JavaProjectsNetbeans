package desafiopraticoencapsulamento;
import java.util.Scanner;

public class OperadorEstoque {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        Produto p = new Produto();
        System.out.println("[Operador de Estoque]: Qual operacao deseja registrar?\nE - registrar Entrada\nS - registrar saida");

        String operacao = "";
        
        while(!operacao.equals("E") && !operacao.equals("S")){
        operacao = scan.next().toUpperCase();
        }
        if(operacao.equals("E")){      
             System.out.println("[Operador de Estoque]: Registrando Entrada");
           
             System.out.print("Informe o codigo do produto: ");
             int cod = scan.nextInt();
             p.setCodigo(cod);
             
             System.out.print("Informe a descricao do produto: ");
             String descr = scan.next();
             p.setDecricao(descr);
             
             System.out.print("Informe a quantidade: ");
             int quant = scan.nextInt();
             
             p.registrarEntrada(quant);
             System.out.println(p.toString()+"\nQuantidade: "+quant+" unidades");
             
             System.out.println("\n--> Saldo: R$"+p.getSaldo());
             
        }
        else if(operacao.equals("S")){
             if(p.getSaldo()<=0){
                 System.out.println("[Operador de Estoque]: Nao foi possivel registrar a saida");             
              }
             else{
             System.out.println("[Operador de Estoque]: Registrando Saida");
            
             System.out.print("Informe o codigo do produto: ");
             int cod = scan.nextInt();
             p.setCodigo(cod);
             
             System.out.print("Informe a descricao do produto: ");
             String descr = scan.next();
             p.setDecricao(descr);
             
             System.out.print("Informe a quantidade: ");
             int quant = scan.nextInt();
             
             p.registrarSaida(quant);
             System.out.println("\n[Operador de Estoque]: Saida Registrada");
             System.out.println("\n--> Saldo: R$"+p.getSaldo());
           }
        }
        else{
            System.out.println("[Operador de Estoque]: Operacao invalida");
        }
    }
}
