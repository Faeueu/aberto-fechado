package br.com.catolica.Model;

public class Consultor extends Funcionario{
    public double taxaHora;

    public Consultor(){}
    public Consultor(String nome, int idade, String email, double taxaHora, double salario) {
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
        return "Consultor{" +
                "taxaHora=" + taxaHora +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
