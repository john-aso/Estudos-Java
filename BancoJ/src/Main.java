import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String user = "John Altemy SIlva de Oliveira";
        String tipCont = "Corrente";

        double saldo = 2500;
        double saldoReceber;
        double saldoTransferir;
        
        int opcoes = 0;


        //String inicial de dados inicias do usuario
        String dadosIniciais = """
                               *************************************
                               Dados Iniciais do Cliente:
                               
                               Nome:            %s
                               Tipo Conta:      %s
                               Saldo Inicial:   R$ %.2f
                                                           
                               **************************************
                               """.formatted(user, tipCont, saldo);

        System.out.println(dadosIniciais);


        String operacoes = """
                           \n** Digite a opção desejada: **
                           
                           1- Consultar saldos
                           2- Receber valor
                           3- Transferir valor
                           4- Sair     
                                                
                           """;


        while (opcoes != 4){

            System.out.println(operacoes);
            opcoes = leitura.nextInt();

            if (opcoes == 1){
                System.out.printf("Saldo atual é R$ %.2f%n", saldo);



            } else if (opcoes == 2){
                System.out.println("Informe o valor a receber: ");
                saldoReceber = leitura.nextDouble();
                // atualiza altomaticamente o saldo + o saldoReceber
                saldo += saldoReceber;
                System.out.printf("\nSaldo atualizado R$ %.2f%n", saldo);
        }   else if (opcoes == 3){
                System.out.println("Informe o valor a transferir: ");
                saldoTransferir = leitura.nextDouble();

                if (saldoTransferir>saldo){
                    System.out.println("Valor de transferencia maior que saldo atual");
                } else {
                    saldo -= saldoTransferir;
                    System.out.printf("\nSaldo atualizado R$ %.2f%n", saldo);

                }
            }else if (opcoes == 4){
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção invalida");
            }
        }



    }
}

