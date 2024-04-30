# TB-Java-Projeto-Guiado-I

# Sistema de Gestão de Loja
### Este projeto é um sistema de gestão para uma loja que permite a manipulação de produtos, clientes e vendas.
Ele é projetado para que um funcionário possa realizar operações de cadastro, leitura, edição e exclusão das entidades mencionadas, bem como gerenciar vendas e controlar o estoque.

---

## Requisitos:
- **Cadastro, leitura, edição e exclusão de produtos:** Os produtos devem ser gerenciáveis pelo sistema, permitindo que o funcionário adicione, visualize, edite e remova produtos da lista.
- **Cadastro, leitura, edição e exclusão de clientes:** Similarmente, os clientes também devem ser gerenciáveis, com funcionalidades para adicionar, visualizar, editar e remover clientes.
- **Gestão de vendas:**
  - Vendas devem ser registradas no sistema.
  - A cada venda, a quantidade de produtos vendidos deve ser subtraída do estoque.
  - Vendas não podem ser realizadas sem estoque disponível.
- **Controle de estoque mínimo:**
  - O sistema deve permitir a configuração de um estoque mínimo para cada produto.
  - Deve ser possível gerar um relatório mostrando produtos que estão abaixo do estoque mínimo.
- **Interface de usuário interativa:**
  - O sistema deve oferecer um menu interativo que permita ao usuário escolher e realizar todas as funcionalidades disponíveis, e depois sair do programa.

---

## Diagrama de Classe:
O diagrama é essencial para entendermos quantas instâncias de uma classe estão ligadas a outra e são essenciais para a modelagem correta do banco de dados ou da lógica de negócios do sistema.

<img src="/DiagramaClassesLoja.jpg">

## Conceitos trabalhados em Java:
1. Utilização do Conceito de OO para elaboração de um cenário hipotético.
1. Interação com usuário.>
4. Herança com Produto - Eletronico
5. Polimorfismo utilizando o método toString() da classe Eletronico
6. Exceções
