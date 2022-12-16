package main;

import java.util.*;
import java.util.Scanner;

public class App {
    private List<Aluno> alunos;
    private List<Professor> professores;
    public Scanner input = new Scanner(System.in);  

    /**
     * 
     */
    public App(){
        alunos = new ArrayList<>();
        Aluno aluno2 = new Aluno("Thomas Junior", 333, "thiago@gamil.com", 20, 0);
        alunos.add(aluno2);
        professores = new ArrayList<>();
        Professor professor2 = new Professor("Prof Thales Junior", 444, "email@gamil.com", 20, 0.0, 0, "mestrado", "mestrado em matematica");
        professores.add(professor2);
        int menuPrincipalOp = -1;

        while (menuPrincipalOp!=0){
            System.out.println("Escolha uma opção:");
            System.out.println("1- Alunos.");
            System.out.println("2- Professores");
            System.out.println("3- Aulas.");
            System.out.println("4- Cursos.");
            System.out.println("0- Sair");
            menuPrincipalOp = input.nextInt();
            input.nextLine();

            if(menuPrincipalOp == 1){
                menuAlunos();
            }
            if(menuPrincipalOp == 2){
                menuProfessores();
            }
            if(menuPrincipalOp == 3){
               // menuAulas();
            }
            if(menuPrincipalOp == 4){
                //menuCursos();
            }
               
        }
            
        //cadastrarAula();
        //cadastrarCurso():
        //cadastrarCartao():

      
        //deletarAula();
        //deletarCurso():
        //deletarCartao():

        //atualizarAula();
        //atualizarCurso():
        //atualizarCartao():

        //mostrarAula();
        //mostrarCurso():
        //mostrarCartao():
    }

    public void menuAlunos(){
        int menuAlunoOp = -1;

        while (menuAlunoOp!=0){
            System.out.println("Alunos:");
            System.out.println("1- Adcionar um novo aluno.");
            System.out.println("2- Deletar um aluno.");
            System.out.println("3- Atualizar um aluno.");
            System.out.println("4- Mostrar um aluno.");
            System.out.println("5- Mostrar alunos cadastrados.");
            System.out.println("0- Volta para o menu principal.");
            menuAlunoOp = input.nextInt();
            input.nextLine();

            if(menuAlunoOp == 1){
                cadastrarAluno();
            }
            if(menuAlunoOp == 2){
                deletarAluno();
            }
            if(menuAlunoOp == 3){
                atualizarAluno();
            }
            if(menuAlunoOp == 4){
                mostrarAluno();
            }
            if(menuAlunoOp == 5){
                mostrarAlunos();
            }
               
        }
    }

    public void cadastrarAluno(){
        System.out.println("Adcionar um novo aluno.");
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("CPF:");
        int cpf = input.nextInt();
        input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("idade:");
        int idade = input.nextInt();
        input.nextLine();
        Aluno aluno = new Aluno(nome, cpf, email, idade, 0);
        alunos.add(aluno);
    }

    public void deletarAluno(){
        System.out.println("Informe o CPF do aluno que será DELETADO:");
        int cpf = input.nextInt();
        input.nextLine();
        Aluno aluno = getAluno(cpf);
        alunos.remove(aluno);
    }

    public void mostrarAluno(){
        System.out.println("Informe o CPF do aluno que será mostrado:");
        int cpf = input.nextInt();
        input.nextLine();
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).cpf == cpf){
                System.out.println(alunos.get(i).print());
            }
        }
    }

    public void mostrarAlunos(){
        for(int i=0; i<alunos.size(); i++){
            System.out.println("Aluno " + (i+1) + ':');
            System.out.println(alunos.get(i).print());
		}
    }

    public void atualizarAluno(){
        System.out.println("Informe o CPF do aluno que será ATUALIZADO:");
        int cpf = input.nextInt();
        input.nextLine();
        Aluno aluno = getAluno(cpf);
        System.out.println("Nome:");
        aluno.setNome(input.nextLine());
        System.out.println("Email:");
        aluno.setEmail(input.nextLine());
        System.out.println("idade:");
        aluno.setIdade(input.nextInt());
        input.nextLine();
    }

   
    public Aluno getAluno(int cpf){
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).cpf == cpf){
                Aluno aluno = alunos.get(i);
                return aluno;
            }
        }
        return null;
    }

    //talvez colocar isso num arquivo diferente, passar o array de professores e retornar ele
    public void menuProfessores(){
        int menuProfessorOp = -1;

        while (menuProfessorOp!=0){
            System.out.println("Professor:");
            System.out.println("1- Adcionar um novo professor.");
            System.out.println("2- Deletar um professor.");
            System.out.println("3- Atualizar um professor.");
            System.out.println("4- Mostrar um professor.");
            System.out.println("5- Mostrar professores cadastrados.");
            System.out.println("0- Volta para o menu principal.");
            menuProfessorOp = input.nextInt();
            input.nextLine();

            if(menuProfessorOp == 1){
                cadastraProfessor();
            }
            if(menuProfessorOp == 2){
                deletarProfessor();
            }
            if(menuProfessorOp == 3){
                atualizarProfessor();
            }
            if(menuProfessorOp == 4){
                mostrarProfessor();
            }
            if(menuProfessorOp == 5){
                mostrarProfessores();
            }
               
        }
    }

    public void cadastraProfessor(){
        System.out.println("Adcionar um novo professor.");
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("CPF:");
        int cpf = input.nextInt();
        input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("idade:");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Nivel de Ensino:");
        String nivelDeEnsino = input.nextLine();
        System.out.println("Certificado:");
        String certificado = input.nextLine();

        Professor professor = new Professor(nome, cpf, email, idade, 0.0, 0, nivelDeEnsino, certificado);
        professores.add(professor);
    }

    public void deletarProfessor(){
        System.out.println("Informe o CPF do professor que será DELETADO:");
        int cpf = input.nextInt();
        input.nextLine();
        Professor professor = getProfessor(cpf);
        professores.remove(professor);
    }

    public void mostrarProfessor(){
        System.out.println("Informe o CPF do professor que será mostrado:");
        int cpf = input.nextInt();
        input.nextLine();
        for(int i=0; i<professores.size(); i++){
            if(professores.get(i).cpf == cpf){
                System.out.println(professores.get(i).print());
            }
        }
    }

    public void mostrarProfessores(){
        for(int i=0; i<professores.size(); i++){
            System.out.println("Professor " + (i+1) + ':');
            System.out.println(professores.get(i).print());
		}
    }

    public void atualizarProfessor(){
        System.out.println("Informe o CPF do professor que será ATUALIZADO:");
        int cpf = input.nextInt();
        input.nextLine();
        Professor professor = getProfessor(cpf);
        System.out.println("Nome:");
        professor.setNome(input.nextLine());
        System.out.println("Email:");
        professor.setEmail(input.nextLine());
        System.out.println("idade:");
        professor.setIdade(input.nextInt());
        input.nextLine();
        System.out.println("Nivel de ensino:");
        professor.setNivelDeEnsino(input.nextLine());
        System.out.println("Adicionar um certificado:");
        // fazer metodo aqui depois
    }

   
    public Professor getProfessor(int cpf){
        for(int i=0; i<professores.size(); i++){
            if(professores.get(i).cpf == cpf){
                Professor professor = professores.get(i);
                return professor;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        new App();
    }
}
