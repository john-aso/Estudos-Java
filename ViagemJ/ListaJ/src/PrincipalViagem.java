import br.com.john.lista.modelos.Gasto;
import br.com.john.lista.modelos.Viagem;

import java.util.Collections;
import java.util.Scanner;

public class PrincipalViagem {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o orçamento da viagem: ");
        var viagem = new Viagem(leitura.nextDouble());

        int sair = 1;
        while (sair != 0){
            System.out.println("Descrição gasto: ");
            String descricao = leitura.next(); // Lê o texto da descriçAltemy.05
            // ão

            System.out.println("Valor do gasto: ");
            double valor = leitura.nextDouble(); // Lê o valor numérico

            // Cria o objeto Gasto com as variáveis que acabamos de ler
            var gasto = new Gasto(descricao, valor);
            // Tenta adicionar na viagem e guarda a resposta (true ou false)
            boolean adicionou =  viagem.adicionaGastos(gasto);

            if (adicionou){
                System.out.println("Gasto registrado com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para adicionar outro gasto: ");
                sair = leitura.nextInt();
            } else {
                System.out.println("Orçamento insuficiente!");
                sair = 0;
            }

        }
        System.out.println("\n*****************************");
        System.out.println("GASTOS DA VIAGEM (ORDENADOS):");

        Collections.sort(viagem.getGastos());
        for (Gasto g : viagem.getGastos()) {
            System.out.println(g);
        }
        System.out.println("*****************************");
        System.out.printf("Saldo restante da viagem: R$ %.2f%n", viagem.getSaldo());


    }
}