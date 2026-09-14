package br.com.john.Music.modelos;

public class Musicas extends Audio  implements acoes{



    public void exibirFichaTecnica(){

        System.out.println("Musica: " + getTitulo());
        System.out.println("Minutos: " + getDuracao());
        System.out.println("Ouvintes: " + getTotalReproducoes());
        System.out.println("Gostei: " + getCurtidas());

    }

    @Override
    public void curtir() {


    }

    @Override
    public void classificacao() {

        if (getTotalReproducoes() >= 3000 || getCurtidas() >= 3000 ){
            System.out.println("Top musicas do momento");

        } else if (getTotalReproducoes() >= 2000 || getCurtidas() >= 2000) {
            System.out.println("Musicas ainda boa");

        } else {
            System.out.println("Escute mais tarde");
        }


    }


}
