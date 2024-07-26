package com.crudfiltro.AsignarHabilidad.Adapter.In;

import com.crudfiltro.AsignarHabilidad.MainAsignarHabilidad.MainAsignarHabilidad;
import com.crudfiltro.ClasesAbstractas.Funcionalidad;

public class IrAsignarHabilidad extends Funcionalidad {

    public IrAsignarHabilidad(String enunciado) {
        this.enunciado = enunciado;
    }



    @Override
    public void ejecutar() {
        
     MainAsignarHabilidad.main();

    }

}
