package com.crudfiltro.Main;

import java.util.List;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.ControladorLFucnionalidadesIntro.ControladorFuncionalidadesIntro;
import com.crudfiltro.DataBaseConfig.DataBaseConfig;
import com.crudfiltro.Intro.Intro;

public class Main {
    public static void main(String[] args) {

        List<Funcionalidad> listaFuncionesIntro = ControladorFuncionalidadesIntro.getControlador().lstIntro;
        Intro intro = new Intro(listaFuncionesIntro);

        if (DataBaseConfig.getConnection().verifyConnection) {
            intro.start();
        } 
        
    }
}