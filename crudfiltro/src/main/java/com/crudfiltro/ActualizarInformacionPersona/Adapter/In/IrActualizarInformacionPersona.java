package com.crudfiltro.ActualizarInformacionPersona.Adapter.In;

import com.crudfiltro.ActualizarInformacionPersona.MainActualizarInformacion.MainActualizarInformacionPersona;
import com.crudfiltro.ClasesAbstractas.Funcionalidad;

public class IrActualizarInformacionPersona extends Funcionalidad {

    public IrActualizarInformacionPersona(String enunciado) {
        this.enunciado = enunciado;
    }



    @Override
    public void ejecutar() {
        
      MainActualizarInformacionPersona.main();

    }

}
