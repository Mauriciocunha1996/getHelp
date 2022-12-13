package main;

import java.sql.Connection;
import java.util.*;

public class App {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Aula> aulas;
    private List<Curso> cursos;
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
        aulas = new ArrayList<>();

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
            }
                menuAulas();
            if(menuPrincipalOp == 4){
                menuCursos();
            }
               
        }
            
        //cadastrarCurso():
        //cadastrarCartao():

      
        
        //deletarCurso():
        //deletarCartao():

        
        //atualizarCurso():
        //atualizarCartao():

        
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
    public void menuAulas(){
        Conexao conexao = new Conexao();
        Connection con = conexao.getConnection();
        int menuAulaOp = -1;

        while (menuAulaOp!=0){
            System.out.println("Aulas:");
            System.out.println("1- Adcionar um nova Aula.");
            System.out.println("2- Deletar uma Aula.");
            System.out.println("3- Atualizar Aula.");
            System.out.println("4- Mostrar Aula");
            System.out.println("5- Mostrar aulas cadastrados.");
            System.out.println("0- Volta para o menu principal.");
            menuAulaOp = input.nextInt();
            input.nextLine();

            if(menuAulaOp == 1){
                cadastrarAula(con);
            }
            if(menuAulaOp == 2){
                deletarAula();
            }
            if(menuAulaOp == 3){
                atualizarAula();
            }
            if(menuAulaOp == 4){
                mostrarAula();
            }
            if(menuAulaOp == 5){
                listAulas(con);
            }
               
        }
    }
    public void cadastrarAula(Connection con){
        System.out.println("\nId aula:");
        int idAula = Integer.parseInt(input.nextLine());
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Disciplina:");
        String disciplina = input.nextLine();
        System.out.println("Nivel de Ensino: ");
        String nivelDeEnsino = input.nextLine();
        AulaModel.insert(new Aula(idAula, nome, disciplina, nivelDeEnsino ), con);
    }
    public void deletarAula(){
        System.out.println("Informe o id da aula que será DELETADA:");
        int idAula = input.nextInt();
        input.nextLine();
        Aula aula = getAula(idAula);
        aulas.remove(aula);
    }
    public void mostrarAula(){
        System.out.println("Informe o ID da aula que será mostrada:");
        int idAula = input.nextInt();
        input.nextLine();
        for(int i=0; i<aulas.size(); i++){
            if(aulas.get(i).idAula == idAula){
                System.out.println(aulas.get(i).print());
            }
        }
    }
    public void listAulas(Connection con){
        List<Aula> aulas = AulaModel.select(con);
        System.out.println();
        for(Aula a : aulas){
            System.out.println(a + "\n");
        
	    }
    }
    public void atualizarAula(){
        System.out.println("Informe o ID daula que será ATUALIZADA:");
        int idAula = input.nextInt();
        input.nextLine();
        Aula aula = getAula(idAula);
        System.out.println("Nome:");
        aula.setNome(input.nextLine());
        System.out.println("Disciplina:");
        aula.setDisciplina(input.nextLine());
        System.out.println("Nivel de Ensino:");
        aula.setNivelDeEnsino(input.nextLine());
        input.nextLine();
    }
    public Aula getAula(int idAula){
        for(int i=0; i<aulas.size(); i++){
            if(aulas.get(i).idAula == idAula){
                Aula aula = aulas.get(i);
                return aula;
            }
        }
        return null;
    }

    public void menuCursos(){
        Conexao conexao = new Conexao();
        Connection con = conexao.getConnection();
        int menuCusoOp = -1;

        while (menuCusoOp!=0){
            System.out.println("Cursos:");
            System.out.println("1- Adcionar um novo Curso.");
            System.out.println("2- Deletar um Curso.");
            System.out.println("3- Atualizar Curso.");
            System.out.println("4- Mostrar Curso");
            System.out.println("5- Mostrar cursos cadastrados.");
            System.out.println("0- Volta para o menu principal.");
            menuCusoOp = input.nextInt();
            input.nextLine();

            if(menuCusoOp == 1){
                cadastrarCurso(con);
            }
            if(menuCusoOp == 2){
                deletarAula();
            }
            if(menuCusoOp == 3){
                atualizarAluno();
            }
            if(menuCusoOp == 4){
                mostrarAluno();
            }
            if(menuCusoOp == 5){
                mostrarCursos(con);
            }
               
        }
    }
    public void cadastrarCurso(Connection con){
        System.out.println("\nId do curso:");
        int idCurso = Integer.parseInt(input.nextLine());
        System.out.println("Nome do curso: ");
        String nome = input.nextLine();
        System.out.println("Disciplina:");
        String disciplina = input.nextLine();
        System.out.println("Nivel de Ensino: ");
        String nivelDeEnsino = input.nextLine();
        CursoModel.insert(new Curso(idCurso, nome, disciplina, nivelDeEnsino), con);
        
    }
    public void deletarCurso(){
        System.out.println("Informe o id da aula que será DELETADA:");
        int idCurso = input.nextInt();
        input.nextLine();
        Curso curso = getCurso(idCurso);
        cursos.remove(curso);
    }
    public void mostrarCurso(){
        System.out.println("Informe o ID do curso que será mostrado:");
        int idCurso = input.nextInt();
        input.nextLine();
        for(int i=0; i<cursos.size(); i++){
            if(cursos.get(i).idCurso == idCurso){
                System.out.println(cursos.get(i).print());
            }
        }
    }
    public void mostrarCursos(Connection con){
        List<Curso> cursos = CursoModel.select(con);
        System.out.println();
        for(Curso c : cursos){
            System.out.println(c + "\n");
		}
    }
    public void atualizarCurso(){
        System.out.println("Informe o ID do Curso que será ATUALIZADO:");
        int idCurso = input.nextInt();
        input.nextLine();
        Aula aula = getAula(idCurso);
        System.out.println("Nome:");
        aula.setNome(input.nextLine());
        System.out.println("Disciplina:");
        aula.setDisciplina(input.nextLine());
        System.out.println("Nivel de Ensino:");
        aula.setNivelDeEnsino(input.nextLine());
        input.nextLine();
    }
    public Curso getCurso(int idCurso){
        for(int i=0; i<cursos.size(); i++){
            if(cursos.get(i).idCurso == idCurso){
                Curso curso = cursos.get(i);
                return curso;
            }
        }
        return null;
    }
    public static void main(String args[]) {
        new App();
    }
}

