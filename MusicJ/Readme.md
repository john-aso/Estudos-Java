# 🎵 MusicJ - Sistema de Streaming de Áudio em Java

Projeto desenvolvido para consolidar os fundamentos de **Programação Orientada a Objetos (POO)** em Java. O sistema modela uma plataforma de streaming capaz de gerenciar diferentes formatos de áudio, calcular popularidade por meio de regras de negócio personalizadas e organizar faixas em playlists.

---

## 📌 Funcionalidades

* **Superclasse `Audio`:** Base genérica contendo metadados essenciais como título, duração, total de reproduções e curtidas.
* **Especialização com `Musicas` e `Podcasts`:** Subclasses que herdam características comuns e adicionam atributos específicos (como número de partes/episódios).
* **Classificação Dinâmica:** Métodos de classificação polimórficos que avaliam a popularidade com lógicas distintas para músicas e podcasts.
* **Gerenciamento com `Playlist`:** Mecanismo polimórfico que aceita qualquer tipo derivado de `Audio`, exibindo feedback customizado de acordo com o engajamento da faixa.

---

## 🧠 Conceitos de POO Aplicados

* **Encapsulamento:** Proteção de dados críticos usando modificadores de acesso `private`, expondo apenas métodos de negócio e `getters`/`setters` necessários para evitar estados inconsistentes.
* **Herança (`extends`):** Reutilização de código da superclasse `Audio` pelas filhas `Musicas` e `Podcasts`.
* **Polimorfismo:** Métodos sobrescritos (`@Override`) para garantir comportamentos específicos por tipo de mídia, além do desacoplamento da classe `Playlist`, que opera sobre a abstração `Audio`.
* **Interfaces (`implements`):** Criação de contratos de comportamento para padronização de ações no sistema.

---

## 📂 Estrutura do Projeto

```text
src/
└── br/com/john/Music/
    ├── modelos/
    │   ├── acoes.java               # Interface de ações
    │   ├── Audio.java               # Superclasse base
    │   ├── Musicas.java             # Subclasse especializada para faixas musicais
    │   ├── Podcasts.java            # Subclasse especializada para episódios de podcast
    │   └── Playlist.java            # Gerenciador de coleções e recomendações
    └── Principal_Music.java         # Ponto de entrada (Main) para execução e testes