package com.crudfiltro.RegistrarPersona.Application;

import java.util.List;

import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerEmailsServicio;

public class ExtraerEmailsAccion {

    private ExtraerEmailsServicio extraerEmailsServicio;

    public ExtraerEmailsAccion(ExtraerEmailsServicio extraerEmailsServicio) {
        this.extraerEmailsServicio = extraerEmailsServicio;
    }

    public List<String> extraer(){

        return this.extraerEmailsServicio.extraerEmails();

    }

}
