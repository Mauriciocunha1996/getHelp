package test;


import main.Aluno;
import main.Professor;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ManagerTest {
  private final Aluno aluno = AlunoMock.get();
  private final Professor professor = ProfessorMock.get();

 // @Before 
  @Test
  public void encontrarRotas() {
    Aluno expected = aluno;
    Professor atual = professor;
    System.out.println("Boas:");
    System.out.println(expected.cpf);
    System.out.println(atual.getEmail());
  }
}