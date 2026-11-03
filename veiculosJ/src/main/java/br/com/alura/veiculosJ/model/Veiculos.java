package br.com.alura.veiculosJ.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculos(@JsonAlias("Valor") String Valor,
                                                   @JsonAlias("Marca") String marca,
                                                   @JsonAlias("Modelo") String modelo,
                                                   @JsonAlias("AnoModelo") String modeloAno,
                                                   @JsonAlias("Combustivel") String combustivel) {

    @Override
    public String toString() {
        return "Veiculos: " +
                "Valor = " + Valor + '\'' +
                ", Marca = " + marca + '\'' +
                ", Modelo = " + modelo + '\'' +
                ", ModeloAno = " + modeloAno + '\'' +
                ", Combustivel = " + combustivel + '\'' +
                '}';
    }
}
