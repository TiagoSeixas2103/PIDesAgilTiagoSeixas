package br.edu.insper.desagil.engajamento;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
	public List<Produto> produtos;

	public Vendedor(String nome) {
		super(nome);
		this.produtos = new ArrayList<>();
	}
	
	public void cadastraProduto(String nome, double preco) {
		Produto produto = new Produto(nome, preco);
		this.produtos.add(produto);
	}
	
	
	

}
