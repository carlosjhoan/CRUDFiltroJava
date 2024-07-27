package com.crudfiltro.RegistrarPersona.Adapter.In;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crudfiltro.DataBaseConfig.DataBaseConfig;
import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerEmailsServicio;

public class ExtraerEmailsRepositorio implements ExtraerEmailsServicio {

    @Override
    public List<String> extraerEmails() {
        
        List<String> listaEmails = new ArrayList<>();
        
        try {

            String sqlProcedure = "{CALL extraerEmails()}";
            Connection connection = DataBaseConfig.getConnection().DBconnection;
            CallableStatement cs = connection.prepareCall(sqlProcedure);
            cs.execute();
            ResultSet procedureResulSet = cs.getResultSet();

            while (procedureResulSet.next()) {

                String email = procedureResulSet.getString("email");
                listaEmails.add(email);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

            

        return listaEmails;
    } 

    

}
