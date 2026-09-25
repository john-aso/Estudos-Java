package br.com.john.lista.modelos;

public class Gasto implements Comparable<Gasto>{

    private String descricao;
    private double valor;

    public Gasto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + "- R$" + valor;
    }
    //essa linha compara uma variavel tipo doble com outra tipo doble
    //é uma forma de ordenar uma lista pelo valor tipo doble
    @Override
    public int compareTo(Gasto outroGasto) {
        return Double.compare(this.valor, outroGasto.getValor());
    }
}
