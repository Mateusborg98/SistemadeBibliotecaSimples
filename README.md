## Exercício de Revisão em Java - "Sistema de Biblioteca Simples"
Objetivo: Criar um programa em Java para gerenciar uma lista de livros de uma biblioteca. O programa deve demonstrar os conceitos básicos de Java, como variáveis, classes, métodos, laços, arrays (ou listas) e manipulação de entrada/saída.

## Passo 1: Criar a Classe "Livro"
Crie uma classe chamada Livro com os seguintes atributos:
String titulo
String autor
int anoPublicacao

Adicione um construtor para inicializar esses atributos.
Crie um método exibirDetalhes() para exibir as informações do livro.

## Passo 2: Criar o Programa Principal
No método principal (main), faça o seguinte:
Crie um array ou ArrayList para armazenar os objetos do tipo Livro.
Adicione pelo menos 3 livros à lista, utilizando o construtor da classe Livro.

Exiba o menu abaixo para o usuário:
[1] Listar todos os livros
[2] Adicionar um novo livro
[3] Sair
Use um loop while para manter o programa em execução até que o usuário escolha a opção "Sair".

## Passo 3: Funcionalidades do Programa
Listar Livros: Percorra o array ou lista e chame o método exibirDetalhes() de cada livro.
Adicionar Livro: Solicite ao usuário o título, autor e ano de publicação de um novo livro.
Crie um objeto Livro com essas informações e o adicione à lista.
Sair: Finalize o programa com uma mensagem de despedida.

## Desafio Adicional (opcional)
Ordene os livros por ano de publicação antes de exibi-los.
Garanta que o usuário não possa inserir um ano de publicação inválido (por exemplo, maior que o ano atual).
Salve a lista de livros em um arquivo .txt e carregue-a na inicialização do programa.
