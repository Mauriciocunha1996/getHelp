package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CursoModel {

    public static void insert(Curso c, Connection con){
        try{
            PreparedStatement st = con.prepareStatement("INSERT INTO cursos (idCurso, nome, disciplina, nivelDeEnsino ) VALUES (?,?,?,?)");
            st.setInt(1, c.getIdCurso());
            st.setString(2, c.getNome());
            st.setString(3, c.getDisciplina());
            st.setString(4, c.getNivelDeEnsino());
            st.execute();
            st.close();
        }catch(SQLException e){
            System.out.println("Nao foi possivel adicionar o curso ao banco de dados");
        }
    }

    public static List<Curso> select(Connection con){
        List<Curso> cursos = new ArrayList<Curso>();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Cursos");
            while(rs.next()){
                Curso c = new Curso(rs.getInt("idCurso"), rs.getString("nome"),  rs.getString("disciplina"),  rs.getString("nivelDeEnsino"));
                cursos.add(c);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return cursos;
    }

    // public static List<Aula> listAula(int idCurso, Connection con){
    //     List<Aula> aulas = new ArrayList<Aula>();
    //     try{
    //         PreparedStatement st = con.prepareStatement("SELECT codDisciplina, nome, cargaHoraria FROM aulas NATURAL JOIN grade where idCurso=?");
    //         st.setInt(1, idCurso);
    //         ResultSet rs = st.executeQuery();
    //         while(rs.next()){
    //             aulas.add(new Aula(rs.getInt("idAula"), rs.getString("nome"), rs.getString("disciplina"), rs.getString("nivelDeEnsino")));
    //         }
    //     }catch(SQLException e){
    //         e.printStackTrace();
    //     }
    //     return aulas;
    // }
}