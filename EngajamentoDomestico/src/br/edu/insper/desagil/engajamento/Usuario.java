package br.edu.insper.desagil.engajamento;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	public String nome;
	public List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public Video postaVideo(Integer id, Produto produto) {
		
		Video video = new Video(id, this, produto);
		
		this.videos.add(video);
		
		
		return video;
		
	}
	
	public long totalAvaliacoes() {
		long total = 0;
		for (Video video : this.videos) {
			total += video.mediaAvaliacoes();
		}
		
		return total;
	}
	

}
