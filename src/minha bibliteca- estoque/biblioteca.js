class Produto {
    constructor(titulo, autor, quantidade) {
        this._titulo = titulo;
       this.autor = autor;
        this.__quantidade = quantidade;
    }

    // Restante do código permanece igual

    listarProdutos() {
        for (const produto of this.produtos) {
            if (produto.getQuantidade() > 0) {
                console.log(`Título: ${produto.getTitulo()}, Autor: ${produto.autor}, Quantidade: ${produto.getQuantidade()}`);
            } else {
                console.log(`Produto indisponível: ${produto.getTitulo()}`);
            }
        }
    }
}

// Exemplo de uso
if (typeof module !== 'undefined' && module.exports) {
    const biblioteca = require('./class'); // Importe a classe Biblioteca aqui

    const livro1 = new Produto("Dom Casmurro", "Machado de Assis", 0); // Produto indisponível
    const livro2 = new Produto("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 15);

    biblioteca.adicionarProduto(livro1);
    biblioteca.adicionarProduto(livro2);

    console.log(`Estoque total: ${biblioteca.calcularEstoque()} livros`);
    biblioteca.listarProdutos();
}
