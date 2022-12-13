package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AulaModel {
    public static void insert(Aula d, Connection con){
        try{
            PreparedStatement st = con.prepareStatement("INSERT INTO aulas (idAulas, nome, disciplia, nivelDeEnsino) VALUES (?,?,?, ?)");
            st.setInt(1, d.getIdAula());
            st.setString(2, d.getNome());
            st.setString(3, d.getDisciplina());
            st.setString(4, d.getNivelDeEnsino());

            st.execute();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Aula> select(Connection con){
        List<Aula> aulas = new ArrayList<Aula>();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM aulas");
            while(rs.next()){
                Aula a = new Aula(rs.getInt("idAula"), rs.getString("nome"), rs.getString("disciplina"), rs.getString("nivelDeEnsino"));
                aulas.add(a);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return aulas;
    }

    // public static List<Disciplina> listMinCargaHoraria(Connection con){
    //     List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    //     try{
    //         Statement st = con.createStatement();
    //         ResultSet rs = st.executeQuery("SELECT * FROM disciplinas d WHERE cargaHoraria<=all(SELECT cargaHoraria FROM disciplinas)");
    //         while(rs.next()){
    //             disciplinas.add(new Disciplina(rs.getInt("codDisciplina"), rs.getInt("cargaHoraria"), rs.getString("nome")));
    //         }
    //     }catch(SQLException e){
    //         e.printStackTrace();
    //     }
    //     return disciplinas;
    // }
}