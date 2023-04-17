package br.com.catolica.Model;

public class Gerente extends Funcionario{
    public double bonus;

    public Gerente(){}
    public Gerente(String nome, int idade, String email, double salario, double bonus) {
        super(nome, idade, email, salario);
        this.bonus = bonus;
    }

    public double calcularBonus(double bonus){
        return bonus + getSalario();
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
