package test;


import main.Professor;

public class ProfessorMock {

    public static Professor get() {

        Professor mockProfessor = new Professor();

        mockProfessor.setNome("Test Professor");
        mockProfessor.setCpf(111);
        mockProfessor.setEmail("testProfessor@gmail.com");
        mockProfessor.setIdade(25);
        mockProfessor.setNota(8.5);
        mockProfessor.setQuantidadeNotas(8);
        mockProfessor.setNivelDeEnsino("Doutorado");
        mockProfessor.setCertificado("Doutorado em Física");

        return mockProfessor;
    }

}
