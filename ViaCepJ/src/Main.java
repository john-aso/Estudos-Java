import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);



        System.out.println("Digite seu CEP");
        var cep = leitura.nextLine();

        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        System.out.println(endereco);

        // viacep.com.br/ws/01001000/json/

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .setPrettyPrinting()
                .create();


        Endereco meuEndereco = gson.fromJson(json, Endereco.class);


        String enderecoformat = gson.toJson(meuEndereco);


        System.out.println(enderecoformat);
        try {

        FileWriter arquivoEndereco = new FileWriter("arquivo endereço.json");
        arquivoEndereco.write(enderecoformat);
        arquivoEndereco.close();

            System.out.println("Arquivo salvo com sucesso");

        } catch (IOException e){
            System.out.println("Erro ao salvar arquivo" + e.getMessage());

        }

    }
}