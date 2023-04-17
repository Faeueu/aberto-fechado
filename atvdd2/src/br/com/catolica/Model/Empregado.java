package br.com.catolica.Model;

public class Empregado extends Funcionario{
    public double taxaHora;
    public Empregado(){}
    public Empregado(String nome, int idade, String email, double taxaHora, double salario) {
        super(nome, idade, email, salario);
        this.taxaHora = taxaHora;
    }

    public double calcularSalario(int horas) {
        return horas * taxaHora;
    }

    public double getTaxaHora() {
        return taxaHora;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "taxaHora=" + taxaHora +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
