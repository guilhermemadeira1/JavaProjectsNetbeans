package exercicio2;

public class CadastroFuncionarios {

    public static void main(String[] args) {
       Funcionario func1 = new Funcionario(1231,"Joao",1500);
       Funcionario func2 = new Funcionario(1213,"Maria",1520);
       Funcionario func3 = new Funcionario(1321,"Pedro",1510);
              
       System.out.println(func1.toString());
       System.out.println(func2.toString());
       System.out.println(func3.toString());
    }
}
