package br.com.john.Music.modelos;

public class Playlist {

        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        public void adiciona(Audio audio) {
            System.out.println("Adicionando à playlist '" + this.nome + "': " + audio.getTitulo());


            if (audio.getClassificacao() >= 8 || audio.getTotalReproducoes() >= 2000) {
                System.out.println("-> '" + audio.getTitulo() + "' é um sucesso absoluto e está em alta!");
            } else {
                System.out.println("-> '" + audio.getTitulo() + "' adicionado com sucesso para curtir depois.");
            }
            System.out.println();
        }
    }
