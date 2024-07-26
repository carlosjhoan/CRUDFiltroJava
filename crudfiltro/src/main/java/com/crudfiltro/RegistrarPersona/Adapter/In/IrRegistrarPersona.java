package com.crudfiltro.RegistrarPersona.Adapter.In;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.RegistrarPersona.MainRegistrarPersona.MainRegistrarPersona;

public class IrRegistrarPersona extends Funcionalidad {

    public IrRegistrarPersona(String enunciado) {
        this.enunciado = enunciado;
    }



    @Override
    public void ejecutar() {
        
     MainRegistrarPersona.main();

    }

}
