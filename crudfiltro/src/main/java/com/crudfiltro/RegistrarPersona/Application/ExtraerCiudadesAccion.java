package com.crudfiltro.RegistrarPersona.Application;

import java.util.List;

import com.crudfiltro.RegistrarPersona.Domain.Service.ExtraerCiudadesServicio;

public class ExtraerCiudadesAccion {

    ExtraerCiudadesServicio extraerCiudadesServicio;

    

    public ExtraerCiudadesAccion(ExtraerCiudadesServicio extraerCiudadesServicio) {
        this.extraerCiudadesServicio = extraerCiudadesServicio;
    }



    public List<Integer> extraer() {

        return this.extraerCiudadesServicio.extraerCiudades();

    }

}
