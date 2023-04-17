package br.com.catolica.Model;
import java.util.ArrayList;
public class FolhaDePagamento {
    public double calcularFolhaDePagamento(ArrayList<Funcionario> listaFuncionarios) {
        double totalSalarios = 0;


        for (Funcionario funcionario : listaFuncionarios) {
            totalSalarios += funcionario.getSalario();
        }
        return totalSalarios;
    }
}
