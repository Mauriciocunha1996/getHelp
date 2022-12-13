package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModel {

    public static void insert(Usuario u, Connection con){
        try{
            PreparedStatement st = con.prepareStatement("INSERT INTO usuarios (nome, cpf, email, idade) VALUES (?,?,?,?)");
            st.setString(1, u.getNome());
            st.setInt(2, u.getCpf());
            st.setString(3, u.getEmail());
            st.setInt(4, u.getIdade());
            st.execute();
            st.close();
        }catch(SQLException e){
            System.out.println("Nao foi possivel adicionar o curso ao banco de dados");
        }
    }

    public static List<Usuario> select(Connection con){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Usuarios");
            while(rs.next()){
                Usuario u = new Usuario(rs.getString("nome"), rs.getInt("CPF"),  rs.getString("email"),  rs.getInt("idade"));
                usuarios.add(u);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return usuarios;
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