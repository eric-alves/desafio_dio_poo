import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso01 = new Curso("Java", "Curso de Java", 5);
        Curso curso02 = new Curso("PHP", "Curso de PHP", 4);

        Mentoria mentoria01 = new Mentoria("Java", "Mentoria Java", LocalDate.now());
        Mentoria mentoria02 = new Mentoria("PHP", "Mentoria PHP", LocalDate.now());

//        System.out.print(curso01);
//        System.out.printf("\n");
//        System.out.print(curso02);
//        System.out.printf("\n");
//        System.out.print(mentoria01);
//        System.out.printf("\n");
//        System.out.print(mentoria02);
//        System.out.printf("\n");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria01);

        Dev devEric = new Dev();
        devEric.setNome("Eric");
        devEric.inscreverBootcamp(bootcamp);
        System.out.println("Eric - Conteúdos Inscritos " + devEric.getConteudoInscritos());
        devEric.progradir();
        System.out.println("Eric - Conteúdos Inscritos " + devEric.getConteudoInscritos());
        System.out.println("Eric - Conteúdos Concluidos " + devEric.getConteudoConcluidos());
        System.out.println("XP: " + devEric.calcularTotalXp());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Maria - Conteúdos Inscritos " + devMaria.getConteudoInscritos());
        devMaria.progradir();
        System.out.println("Maria - Conteúdos Inscritos " + devMaria.getConteudoInscritos());
        System.out.println("Maria - Conteúdos Concluidos " + devMaria.getConteudoConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
