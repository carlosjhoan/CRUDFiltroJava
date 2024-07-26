package com.crudfiltro.ConsultarPersonaHabilidad.Adpater.In;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.ConsultarPersonaHabilidad.MainConsultarPersonaHabilidad.MainConsultarPersonaHabilidad;

public class IrConsultarPersonaHabilidad extends Funcionalidad {

    public IrConsultarPersonaHabilidad(String enunciado) {
        this.enunciado = enunciado;
    }



    @Override
    public void ejecutar() {
        
     MainConsultarPersonaHabilidad.main();

    }

}
