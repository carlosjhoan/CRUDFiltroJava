package com.crudfiltro.RegistrarPersona.Adapter.Out;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crudfiltro.DataBaseConfig.DataBaseConfig;
import com.crudfiltro.RegistrarPersona.Domain.Entity.Persona;
import com.crudfiltro.RegistrarPersona.Domain.Service.InsertarPersonaServicio;

public class InsertarPersonaRepositorio implements InsertarPersonaServicio {

    @Override
    public int insertarPersona(Persona persona) {
        
        int numeroFilas = 0;

        try {
            String sqlProcedure = "{CALL registrarPersona(?, ?, ? , ?, ?, ?, ?)}";
            Connection connection = DataBaseConfig.getConnection().DBconnection;
            CallableStatement cs = connection.prepareCall(sqlProcedure);
            cs.setString(1, persona.getName());
            cs.setString(2, persona.getLastname());
            cs.setInt(3, persona.getIdcity());
            cs.setString(4, persona.getAddress());
            cs.setInt(5, persona.getAge());
            cs.setString(6, persona.getEmail());
            cs.setInt(7, persona.getIdgender());
            cs.execute();
            ResultSet procedureResulSet = cs.getResultSet();

            while (procedureResulSet.next()) {

                numeroFilas = procedureResulSet.getInt("cantidadInsertada");

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return numeroFilas;
    }

    



}
