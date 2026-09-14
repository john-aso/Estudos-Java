import br.com.john.Music.modelos.*;

public class Principal_Music{
    public static void main(String[] args) {
        Podcasts podcastNeymar = new Podcasts();
        Musicas ararinha = new Musicas();
        Playlist favoritos = new Playlist();


        podcastNeymar.setTitulo("Papo com Neymar");
        podcastNeymar.setDuracao(200);
        podcastNeymar.setTotalReproducoes(2000000);
        podcastNeymar.setCurtidas(1000000);
        podcastNeymar.setPart(2);

        podcastNeymar.exibirFichaTecnica();
        podcastNeymar.classificacao();

        System.out.println("\n");

        ararinha.setTitulo("Ararinha");
        ararinha.setDuracao(3.2);
        ararinha.setCurtidas(500);
        ararinha.setTotalReproducoes(10000);

        ararinha.exibirFichaTecnica();
        ararinha.classificacao();

        System.out.println();
        favoritos.setNome("Minhas Favoritas");
        favoritos.adiciona(ararinha);
        favoritos.adiciona(podcastNeymar);



        }


    }
