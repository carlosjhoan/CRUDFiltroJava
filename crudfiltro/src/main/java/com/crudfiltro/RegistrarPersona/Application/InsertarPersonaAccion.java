package com.crudfiltro.RegistrarPersona.Application;

import com.crudfiltro.RegistrarPersona.Domain.Entity.Persona;
import com.crudfiltro.RegistrarPersona.Domain.Service.InsertarPersonaServicio;

public class InsertarPersonaAccion {

    private InsertarPersonaServicio insertarPersonaServicio;

    public InsertarPersonaAccion(InsertarPersonaServicio insertarPersonaServicio) {
        this.insertarPersonaServicio = insertarPersonaServicio;
    }

    public int insertarPersona(Persona persona) {

        return this.insertarPersonaServicio.insertarPersona(persona);
    }

}
