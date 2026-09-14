package br.com.john.Music.modelos;

public class Podcasts extends Audio implements acoes {

    int part;

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("Episodio PodCast de hoje: " + getTitulo());
        System.out.println("Minutos PodCast: " + getDuracao());
        System.out.println("Visualizações: " + getTotalReproducoes());
        System.out.println("Likes: " + getCurtidas());
        System.out.println("Parte: " + part);


    }

    @Override
    public void curtir() {

    }

    @Override
    public void classificacao() {

        if (getTotalReproducoes() >= 3000 && getCurtidas() >= 3000) {
            System.out.println("Top Podcasts do momento");

        } else if (getTotalReproducoes() >= 2000 && getCurtidas() >= 2000) {
            System.out.println("Podcast ainda em alta");

        } else {
            System.out.println("Escute mais tarde");
        }
    }
}