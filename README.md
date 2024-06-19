# Projeto Loja Virtual

## Objetivo

O Projeto Loja Virtual faz parte do Programa de Aprendizagem Backend, no âmbito do Projeto Guiado I, sob tutoria de Julião do Afrocódigos. O objetivo principal é desenvolver um sistema simples de gerenciamento de estoque e carrinho de compras em Java. Esse sistema permite aos usuários adicionar produtos ao estoque, visualizar os produtos disponíveis, adicionar produtos ao carrinho, remover produtos do carrinho e finalizar uma compra simulada.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

### Estoque

- **Adicionar produto**: Permite adicionar um novo produto ao estoque, incluindo nome, quantidade e preço.
- **Listar produtos**: Exibe todos os produtos disponíveis no estoque.
- **Atualizar produto**: Permite atualizar a quantidade e o preço de um produto existente no estoque.
- **Remover produto**: Remove um produto do estoque com base no seu nome.

### Carrinho de Compras

- **Adicionar produto ao carrinho**: Adiciona um produto ao carrinho de compras com base no seu ID no estoque e na quantidade desejada.
- **Remover produto do carrinho**: Remove um produto do carrinho de compras com base no seu ID no estoque e na quantidade desejada.
- **Finalizar compra**: Calcula o total da compra com base nos produtos presentes no carrinho e exibe o valor total.

## Como Executar

1. Clone o repositório [https://github.com/julianachavespalm/TB-Java-Projeto-Guiado-I](https://github.com/julianachavespalm/TB-Java-Projeto-Guiado-I).
2. Navegue até o diretório do projeto `TB-Java-Projeto-Guiado-I/src/juliaoStore/`.
3. Compile os arquivos `.java` usando o comando `javac`:
    ```
    javac Estoque.java Loja.java Produto.java CarrinhoDeCompras.java
    ```
4. Execute o programa usando o comando `java` e o nome da classe principal `Loja`:
    ```
    java juliaoStore.Loja
    ```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar sugestões, correções de bugs ou melhorias através de pull requests.

## Autora

- **Juliana Chaves Palm**