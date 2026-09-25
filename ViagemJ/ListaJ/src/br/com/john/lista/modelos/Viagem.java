package br.com.john.lista.modelos;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private double orcamento;
    private double saldo;
    private List<Gasto> gastos;

    public Viagem(double orcamento) {
        this.orcamento = orcamento;
        this.saldo = orcamento; // no inicio o saldo é igual ao orçamento
        this.gastos = new ArrayList<>();
    }
    public boolean adicionaGastos(Gasto gasto){
        if (saldo >= gasto.getValor()){
            this.saldo -= gasto.getValor();
            this.gastos.add(gasto); // adiciona na lista do cartão
            return true;
        }
            return false;
        }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }
}



