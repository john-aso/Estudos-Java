package br.com.alura.veiculosJ.principal;

import br.com.alura.veiculosJ.model.DadosMarca;
import br.com.alura.veiculosJ.model.DadosModelos;
import br.com.alura.veiculosJ.model.Veiculos;
import br.com.alura.veiculosJ.service.ConsumoAPI;
import br.com.alura.veiculosJ.service.ConverteDados;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private static final Logger log = LoggerFactory.getLogger(Principal.class);
    private static final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    Scanner leitura = new Scanner(System.in);
    private ConverteDados conversor = new ConverteDados();
    private ConsumoAPI consumo = new ConsumoAPI();

    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private final String MARCA = "/marcas/";
    private final String MODELOS = "/modelos";
    private final String ANOS = "/anos";


    public void exibirMenu() {
        System.out.printf("""
                *******************************************
                    Digite qual veiculo deseja consultar
                
                Carro
                Moto
                Caminhões    
                *******************************************
                """);

        var opcao = leitura.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }
       // System.out.println(veiculo);
        var json = consumo.obterDados(endereco);
        var marcas = conversor.obterLista(json, DadosMarca.class);
        marcas.forEach(System.out::println);


        System.out.println("Informe o código da marca para consulta:");
        Integer codigoMarca = Integer.valueOf(leitura.nextLine());
//ajuste endereço API com o codigo digitado + /modelos
        endereco = endereco + "/" + codigoMarca + MODELOS;
         json = consumo.obterDados(endereco);

// 2. Converte o JSON para o teu record DadosModelos
        var modeloLista = conversor.obterDados(json, DadosModelos.class);

// 3. Imprime os modelos no console (podes ordenar por código ou imprimir direto)
        System.out.println("\nModelos dessa marca:");
        modeloLista.modelos().stream()
                .forEach(System.out::println);

        //listar modelos do trecho digitado
        System.out.println("Informe um trecho do nome do veiculo para consulta:");
        //armazena o texto digitado
        var opcaoVeiculo = leitura.nextLine();
        //cria uma nova lista usando os dados do modeloLista.modelos usando stream
        List<DadosMarca> listamodelosFiltrada = modeloLista.modelos().stream()
                //filtra os nomes pelo trecho usando o contains e ignora se escreveu minusculo ou maiusculo usando o toLower
                .filter(m -> m.nome().toLowerCase().contains(opcaoVeiculo.toLowerCase()))
                .toList();

        System.out.println("\n Modelos filtrados:");
        listamodelosFiltrada.forEach(System.out::println);


        System.out.println("Digite o código do modelos para consultar valores:");
        var opcaoCodVeiculo = leitura.nextLine();
        endereco = endereco + "/" + opcaoCodVeiculo + ANOS;

        json = consumo.obterDados(endereco);
        var listaCodModelos = conversor.obterLista(json, DadosMarca.class);

        System.out.println("Modelos do COD");
//
//        listaCodModelos.stream()
//                .forEach(System.out::println);

        //cria uma nova lista para os veiculos do cod especifico
        List<Veiculos> veiculos = new ArrayList<>();

        for (int i = 0; i < listaCodModelos.size(); i++) {
            var enderecoAno = endereco + "/" + listaCodModelos.get(i).codigo();

            json = consumo.obterDados(enderecoAno);

            Veiculos veiculo = conversor.obterDados(json, Veiculos.class);
            veiculos.add(veiculo);

            veiculos.forEach(System.out::println);

        }
    }
}


