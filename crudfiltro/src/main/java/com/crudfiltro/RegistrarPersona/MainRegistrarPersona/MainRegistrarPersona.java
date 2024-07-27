package com.crudfiltro.RegistrarPersona.MainRegistrarPersona;

import com.crudfiltro.RegistrarPersona.Adapter.In.ExtraerCiudadesRepositorio;
import com.crudfiltro.RegistrarPersona.Adapter.In.ExtraerEmailsRepositorio;
import com.crudfiltro.RegistrarPersona.Adapter.In.ExtraerGenerosRepositorio;
import com.crudfiltro.RegistrarPersona.Adapter.In.FormularioRegistrarPersona;
import com.crudfiltro.RegistrarPersona.Adapter.Out.InsertarPersonaRepositorio;
import com.crudfiltro.RegistrarPersona.Application.ExtraerCiudadesAccion;
import com.crudfiltro.RegistrarPersona.Application.ExtraerEmailsAccion;
import com.crudfiltro.RegistrarPersona.Application.ExtraerGenerosAccion;
import com.crudfiltro.RegistrarPersona.Application.InsertarPersonaAccion;
import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerCiudadesServicio;
import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerEmailsServicio;
import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerGenerosServicio;
import com.crudfiltro.RegistrarPersona.Domain.Service.InsertarPersonaServicio;

public class MainRegistrarPersona {

    public static void main() {

        ExtraerCiudadesServicio extraerCiudadesServicio = new ExtraerCiudadesRepositorio();
        ExtraerCiudadesAccion extraerCiudadesAccion = new ExtraerCiudadesAccion(extraerCiudadesServicio);
        ExtraerEmailsServicio extraerEmailsServicio = new ExtraerEmailsRepositorio();
        ExtraerEmailsAccion extraerEmailsAccion = new ExtraerEmailsAccion(extraerEmailsServicio);
        InsertarPersonaServicio insertarPersonaServicio = new InsertarPersonaRepositorio();
        InsertarPersonaAccion insertarPersonaAccion = new InsertarPersonaAccion(insertarPersonaServicio);
        ExtraerGenerosServicio extraerGenerosServicio = new ExtraerGenerosRepositorio();
        ExtraerGenerosAccion extraerGenerosAccion = new ExtraerGenerosAccion(extraerGenerosServicio);
        FormularioRegistrarPersona formularioRegistrarPersona = new FormularioRegistrarPersona(extraerCiudadesAccion, extraerEmailsAccion, extraerGenerosAccion , insertarPersonaAccion );
        formularioRegistrarPersona.registrar();

    }

}
