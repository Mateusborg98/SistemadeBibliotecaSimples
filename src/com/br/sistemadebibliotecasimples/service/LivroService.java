package com.br.sistemadebibliotecasimples.service;

import java.util.ArrayList;
import java.util.List;

import com.br.sistemadebibliotecasimples.model.Livro;

public class LivroService {

	public String exibirDetalhes() {
		Livro livro = new Livro();

		return "Titulo: " + livro.getTitulo() + " | Autor: " + livro.getAutor() + " | Anos de publicação: "
				+ livro.getAnoPublicacao();
	}

	public String adicionarLivro(Livro livro) {
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(livro);
		return "Livro cadastrado com sucesso!";
	}

}
