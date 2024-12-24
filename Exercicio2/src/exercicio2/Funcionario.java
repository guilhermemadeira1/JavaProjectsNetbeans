package exercicio2;

public class Funcionario{
    private int matricula;
    private String nome;
    private double salario;
        
    Funcionario(int matricula, String nome, int salario) {
        //no método construtor de objetos adicionamos valores de parametro e opcionalmente valores default(padrão) pros atributos
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    @Override //método toString é herdado da classe Object, então precisa ser sobrescrito
    public String toString(){
        return "---Dados do funcionario---"+"\nMatricula: "+matricula+"\nNome: "+nome+"\nSalario: R$"+salario+"\n";
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
       return this.nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

}
