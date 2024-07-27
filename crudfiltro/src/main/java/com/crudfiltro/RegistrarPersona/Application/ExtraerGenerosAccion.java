package com.crudfiltro.RegistrarPersona.Application;

import java.util.List;

import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerGenerosServicio;

public class ExtraerGenerosAccion {

    ExtraerGenerosServicio extraerGenerosServicio;

    public ExtraerGenerosAccion(ExtraerGenerosServicio extraerGenerosServicio) {
        this.extraerGenerosServicio = extraerGenerosServicio;
    }

    public List<Integer> extraer() {

        return this.extraerGenerosServicio.extraerGeneros();
    }

}
