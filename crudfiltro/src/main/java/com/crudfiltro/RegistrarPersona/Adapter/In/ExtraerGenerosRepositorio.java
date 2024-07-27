package com.crudfiltro.RegistrarPersona.Adapter.In;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crudfiltro.DataBaseConfig.DataBaseConfig;
import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerGenerosServicio;

public class ExtraerGenerosRepositorio implements ExtraerGenerosServicio {

    @Override
    public List<Integer> extraerGeneros() {
        List<Integer> listaGeneros = new ArrayList<>();
        int id = 0;
        String genero = "";
        int cuentaFilas = 0; 

        try {

            String sqlProcedure = "{CALL extraerGeneros()}";
            Connection connection = DataBaseConfig.getConnection().DBconnection;
            CallableStatement cs = connection.prepareCall(sqlProcedure);
            cs.execute();
            ResultSet procedureResulSet = cs.getResultSet();

            System.out.println("\n\n==========================================");
            System.out.println("           GENEROS REGISTRADOS");
            System.out.println("==========================================");
            System.err.println("  COD\t|    GENERO");
            System.out.println("------------------------------------------");

            while (procedureResulSet.next()) {
                cuentaFilas++;
                id = procedureResulSet.getInt("id");
                listaGeneros.add(id);
                genero = procedureResulSet.getString("genero");
                System.out.println("  " + id + ".\t|  " + genero);

            }

            if (cuentaFilas == 0) {

                System.out.println("\nNO HAY GÉNEROS REGISTRADAS\n");

            }

            System.out.println("------------------------------------------");

        } catch (SQLException e) {

            e.printStackTrace();

        }



        return listaGeneros;
    }

    

    

}
