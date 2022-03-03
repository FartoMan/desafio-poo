import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso voltado para o aprendizado da linguagem Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Acompanhamento e tiragem de dúvidas no curso de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Descrição bootcam Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCharley = new Dev();
        devCharley.setNome("Charley");
        devCharley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCharley.getConteudoInscritos());
        devCharley.progredir();
        devCharley.progredir();
        System.out.println("Conteúdos inscritos: " + devCharley.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + devCharley.getConteudosConcluidos());
        System.out.println("XP: " + devCharley.calcularTotalXp());


        Dev devOutro = new Dev();
        devOutro.setNome("João");
        devOutro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devOutro.getConteudoInscritos());
        devOutro.progredir();
        devOutro.progredir();
        devOutro.progredir();
        System.out.println("Conteúdos inscritos: " + devOutro.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + devOutro.getConteudosConcluidos());
        System.out.println("XP: " + devOutro.calcularTotalXp());

    }

}
