package br.com.catolica.Main;

import br.com.catolica.Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Consultor consultor = new Consultor(
                "Rafael",
                18,
                "rafael@gmail.com",
                100,
                800.00
        );

        Empregado empregado = new Empregado(
                "Rene",
                23,
                "rene@gmail.com",
                60,
                600.00
        );

        Gerente gerente = new Gerente(
                "Joao",
                20,
                "joao@gmail.com",
                1500,
                500
        );

        ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add(gerente);
        listaDeFuncionarios.add(consultor);
        listaDeFuncionarios.add(empregado);


        for (Funcionario f : listaDeFuncionarios){
            /*System.out.println(f.getSalario());*/
            System.out.println(f.getNome() +"->"+ f.getSalario());
        }


        System.out.println("Salario do consultor"+"->"+ consultor.calcularSalario(8)+ "\n");
        System.out.println("Salario do empregado"+"->"+ empregado.calcularSalario(10)+ "\n");
        System.out.println("Salario do gerente"+"->" +gerente.calcularBonus(500));

    }
}