package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {
	
	private LocalTime horario;
	private Filme filme;
	private Sala sala;
	
	public Sessao(LocalTime h, Filme f, Sala s){
		this.horario = h;
		this.filme = f;
		this.sala = s;
	
		
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
