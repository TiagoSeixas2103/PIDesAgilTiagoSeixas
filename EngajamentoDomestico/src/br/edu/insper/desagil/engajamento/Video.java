package br.edu.insper.desagil.engajamento;

import java.util.HashMap;


public class Video {
	public Integer id;
	public Usuario usuario;
	public Produto produto;
	public HashMap<String, Integer> avaliacoes;
	
	public Video(Integer id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public Integer getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, Integer avaliacao) {
		if (usuario != this.usuario && avaliacao >= 1 && avaliacao <= 5) {
			this.avaliacoes.put(usuario.getNome(), avaliacao);
		}
		
	}
	
	public long mediaAvaliacoes() {
		double total = 0.0;
		
		for (Integer valores : this.avaliacoes.values()) {
			total += valores;
			
		}
		
		long novoTotal = Math.round(total);
		
		return novoTotal;
		
	}

}
