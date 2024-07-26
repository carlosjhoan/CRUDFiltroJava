package com.crudfiltro.EliminarPersona.Adapter.In;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.EliminarPersona.MainEliminarPersona.MainEliminarPersona;

public class IrEliminarPersona extends Funcionalidad {

    public IrEliminarPersona(String enunciado) {
        this.enunciado = enunciado;
    }



    @Override
    public void ejecutar() {
        
     MainEliminarPersona.main();

    }

}
