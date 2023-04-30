import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootvamp Java Developer");
		bootcamp.setDescricao("Descricao Bootvamp Java Developer");
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);

		Dev devMeire = new Dev();
		devMeire.setNome("Meire Lopes");
		devMeire.increverBootcamp(bootcamp);
		System.out.println("Desenvolvedor: : "+devMeire.getNome());
		System.out.println("Conteúdos Inscritos: "+devMeire.getConteudosIncritos());
		devMeire.progredir();
		System.out.println("Conteúdos Concluídos: "+devMeire.getConteudosConcluidos());
		System.out.println("Conteúdos Inscritos: "+devMeire.getConteudosIncritos());
		double xP = devMeire.calcularTotalXP();
		System.out.println("O total de XP da dev "+devMeire.getNome()+" é de: "+xP);


		System.out.println("------------------------------");
		Dev devJoao = new Dev();
		devJoao.setNome("Joao Silva");
		devJoao.increverBootcamp(bootcamp);
		System.out.println("Desenvolvedor: : "+devJoao.getNome());
		System.out.println("Conteúdos Inscritos: "+devJoao.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos: "+devJoao.getConteudosConcluidos());
		System.out.println("------------------------------");

		

		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
	}

}
