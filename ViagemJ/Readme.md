# ✈️ Travel Expense Control (Controle de Gastos de Viagem)

Aplicação desenvolvida em **Java** para controle e gerenciamento de orçamento de viagens via terminal. O projeto consolida conceitos fundamentais de **Programação Orientada a Objetos (POO)**, regras de encapsulamento, manipulação de coleções e ordenação personalizada de dados.

---

## 📌 Funcionalidades

- **Definição de Orçamento:** O usuário estabelece o teto financeiro inicial disponível para a viagem.
- **Validação de Saldo em Tempo Real:** Cada gasto lançado passa por verificação de limite. Se o saldo for insuficiente, a transação é recusada.
- **Coleção Dinâmica:** Armazenamento seguro de despesas utilizando a estrutura `ArrayList` através da interface `List`.
- **Ordenação Automática:** As despesas são ordenadas em ordem crescente de valor ao final da execução via `Collections.sort` e interface `Comparable`.
- **Relatório Consolidado:** Exibição da listagem completa de despesas e o saldo restante disponível.

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Linguagem:** Java (versão 17+)
- **Paradigma:** Orientação a Objetos (POO)
    - **Encapsulamento:** Atributos privados e métodos de acesso e mutação controlados.
    - **Separação de Responsabilidades:** Classes de domínio (`Gasto`, `Viagem`) desacopladas da interface de entrada (`PrincipalViagem`).
- **Collections Framework:**
    - Uso de `List` e `ArrayList` para manipulação de listas dinâmicas.
    - Implementação da interface `Comparable<Gasto>` e sobrescrita do método `compareTo()` para ordenação customizada de objetos.
- **Entrada de Dados:** Leitura e controle de fluxo interativo via `java.util.Scanner`.

---

## 📂 Estrutura do Projeto

```text
src/
└── br/
    └── com/
        └── john/
            └── lista/
                ├── modelos/
                │   ├── Gasto.java      # Representa a despesa e implementa Comparable
                │   └── Viagem.java     # Gerencia orçamento, saldo e lista de gastos
                └── principal/
                    └── PrincipalViagem.java # Classe executável com interface no terminal