package com.crudfiltro.CrearHabilidad.Adapter.In;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.CrearHabilidad.MainCrearhabilidad.MainCrearHabilidad;

public class IrCrearHabilidad extends Funcionalidad {

    public IrCrearHabilidad(String enunciado) {
        this.enunciado = enunciado;
    }



    @Override
    public void ejecutar() {
        
     MainCrearHabilidad.main();

    }

}
