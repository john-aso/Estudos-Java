# 📍 ViaCepJ - Buscador de CEP em Java

Aplicação desenvolvida em Java para consulta e persistência de dados de endereços a partir de um CEP informado pelo usuário. O programa consome os serviços da API pública [ViaCEP](https://viacep.com.br/), mapeia as respostas em formato JSON para estruturas nativas do Java e salva as informações formatadas em um arquivo local `.json`.

---

## 🚀 Funcionalidades

- **Consulta interativa:** Entrada de dados via console com suporte a formatos de CEP preservando zeros à esquerda.
- **Consumo de API HTTP:** Integração direta com os endpoints REST da ViaCEP utilizando a biblioteca nativa do Java.
- **Modelagem imutável com Records:** Estruturação segura dos dados com `record Endereco`.
- **Serialização e Desserialização:** Tratamento dos dados com a biblioteca **Gson**, formatando o arquivo final com identação legível (`setPrettyPrinting`).
- **Persistência de arquivos segura:** Gravação das informações em arquivo `.json` utilizando `try-with-resources`.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+** (ou superior)
- **Java HttpClient (`java.net.http`):** `HttpClient`, `HttpRequest`, `HttpResponse`
- **Google Gson:** Biblioteca para conversão entre objetos Java e formato JSON
- **java.io (`FileWriter`):** Gerenciamento e escrita de arquivos locais

---

## 📁 Estrutura do Projeto

```text
src/
├── Endereco.java       # Record responsável pela modelagem dos campos de endereço
└── Main.java           # Fluxo de entrada, requisição HTTP, conversão e escrita