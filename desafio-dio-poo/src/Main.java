import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mentoria mentoria1 = new Mentoria();
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(18);
		
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(mentoria1);
			

	}

}
