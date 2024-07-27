package com.crudfiltro.RegistrarPersona.Adapter.In;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crudfiltro.DataBaseConfig.DataBaseConfig;
import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerCiudadesServicio;

public class ExtraerCiudadesRepositorio implements ExtraerCiudadesServicio {

    @Override
    public List<Integer> extraerCiudades() {
        List<Integer> listaCiudades = new ArrayList<>();
        String ciudad = "";
        int idCiudad = 0;
        int cuentaFilas = 0;


        try {

            String sqlProcedure = "{CALL extraerCiudades()}";
            Connection connection = DataBaseConfig.getConnection().DBconnection;
            CallableStatement cs = connection.prepareCall(sqlProcedure);
            cs.execute();
            ResultSet procedureResulSet = cs.getResultSet();

            System.out.println("\n\n==========================================");
            System.out.println("           CIUDADES REGISTRADAS");
            System.out.println("==========================================");
            System.err.println("  COD\t|    CIUDAD/REGIÓN/PAÍS");
            System.out.println("------------------------------------------");

            while (procedureResulSet.next()) {
                cuentaFilas++;
                idCiudad = procedureResulSet.getInt("id");
                listaCiudades.add(idCiudad);
                ciudad = procedureResulSet.getString("ciudad");
                System.out.println("  " + idCiudad + ".\t|  " + ciudad);

            }

            if (cuentaFilas == 0) {

                System.out.println("\nNO HAY CIUDADES REGISTRADAS\n");

            }

            System.out.println("------------------------------------------");



        } catch (SQLException e) {

            e.printStackTrace();

        }

        return listaCiudades;
    } 

    

}
