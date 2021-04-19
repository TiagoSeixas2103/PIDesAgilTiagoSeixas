package br.edu.insper.desagil.engajamento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideoTest {
	
	private Usuario usuario;
	private Produto produto;
	private Video video1;
	private Usuario usuario2;
	
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Roberto");
		produto = new Produto("TV",1650.50);
		video1 = new Video(1,usuario,produto);
		usuario2 = new Usuario("Tiago");	
	}
	

	@Test
	void videoTest1() {
		video1.adicionaAvaliacao(usuario,3);
		video1.adicionaAvaliacao(usuario2,0);
		video1.adicionaAvaliacao(usuario2,7);
		assertEquals(0,video1.mediaAvaliacoes());
	}
	
	void videoTest2() {
		video1.adicionaAvaliacao(usuario2,3);
		assertEquals(3,video1.mediaAvaliacoes());
	}
	
	void videoTest3() {
		video1.adicionaAvaliacao(usuario2,3);
		video1.adicionaAvaliacao(usuario2,4);
		assertEquals(4,video1.mediaAvaliacoes());
	}
	
	void videoTest4() {
		video1.adicionaAvaliacao(usuario2,3);
		video1.adicionaAvaliacao(usuario2,3);
		video1.adicionaAvaliacao(usuario2,4);
		assertEquals(3,video1.mediaAvaliacoes());
	}
	
	void videoTest5() {
		Usuario usuario3 = new Usuario("Luis");
		Produto produto3 = new Produto("Mesa",1400.50);
		Video video3 = new Video(1,usuario3,produto3);
		video3.adicionaAvaliacao(usuario2,3);
		video1.adicionaAvaliacao(usuario2,3);
		video1.adicionaAvaliacao(usuario2,4);
		assertEquals(4,video1.mediaAvaliacoes());
		assertEquals(3,video3.mediaAvaliacoes());
	}
	
	

}
