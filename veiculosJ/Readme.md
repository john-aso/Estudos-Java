🚗 Consulta Tabela FIPE - Java & Spring Boot

Aplicação console desenvolvida em Java com o ecossistema Spring Boot para consulta interativa e dinâmica de valores de veículos (carros, motos e caminhões) consumindo a API pública da Tabela FIPE.

📌 Sobre o Projeto

O projeto nasceu da necessidade real de consultar dados de mercado automotivo e serviu como laboratório prático para consolidar conceitos essenciais de desenvolvimento Back-end moderno em Java.

A aplicação guia o usuário através de um fluxo interativo no terminal:

Escolha do tipo de veículo (Carro, Moto ou Caminhão).

Listagem de todas as marcas cadastradas.

Seleção da marca e carregamento dinâmico dos modelos.

Filtro textual via Java Streams por trecho do nome do modelo.

Consulta consolidada com o histórico de avaliação de preços para todos os anos do modelo selecionado.

🛠️ Tecnologias e Conceitos Aplicados

Java 17+ (com uso extensivo de Records)

Spring Boot (execução via CommandLineRunner)

Maven (gerenciamento de dependências e build)

Java HTTP Client (HttpClient, HttpRequest, HttpResponse assíncronos)

Jackson Databind (ObjectMapper, anotações @JsonAlias e @JsonIgnoreProperties)

Java Streams API & Expressões Lambda (filtragem com .filter(), ordenação com .sorted() e coletores)

Clean Code & POO (encapsulamento, desacoplamento via interfaces como IconvertDados)

📂 Estrutura do Projeto

src/main/java/br/com/alura/veiculosJ/
├── model/
│   ├── DadosMarca.java      # DTO Record genérico (código e nome)
│   ├── DadosModelos.java    # Record com lista de modelos
│   └── Veiculos.java        # Record com detalhes finais (valor, combustível, ano)
├── principal/
│   └── Principal.java       # Orquestração do menu e regras de interação
├── service/
│   ├── ConsumoAPI.java      # Camada de comunicação HTTP
│   ├── IconvertDados.java   # Contrato genérico de desserialização
│   └── ConverteDados.java   # Implementação com ObjectMapper (Jackson)
└── VeiculosJApplication.java # Entry point Spring Boot


🚀 Como Executar o Projeto Localmente

Pré-requisitos

Java JDK 17 ou superior instalado.

Git instalado.

IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code).

Passos

Clone o repositório:

git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git


Acesse a pasta do projeto:

cd SEU_REPOSITORIO


Compile e execute pelo Maven Wrapper:

No Linux/Mac:

./mvnw spring-boot:run


No Windows:

mvnw.cmd spring-boot:run


👨‍💻 Autor

Desenvolvido por John Altemy

Java Developer

Sinta-se à vontade para conectar e conferir meu aprendizado contínuo no ecossistema Java & Spring!