package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void increverBootcamp(Bootcamp bootcamp) {
		
	}
	
	public void progredir() {
		
	}
	
	public double calcularTotalXP() {
		return 0d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIncritos() {
		return conteudosIncritos;
	}

	public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
		this.conteudosIncritos = conteudosIncritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosIncritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosIncritos, other.conteudosIncritos) && Objects.equals(nome, other.nome);
	}
	
	

}
