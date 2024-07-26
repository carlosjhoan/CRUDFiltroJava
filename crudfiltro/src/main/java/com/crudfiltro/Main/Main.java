package com.crudfiltro.Main;

import java.util.List;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.DataBaseConfig.DataBaseConfig;

public class Main {
    public static void main(String[] args) {

        List<Funcionalidad> listaFuncionesIntro = CasesListController.getController().lstIntro;
        Intro intro = new Intro(listaFuncionesIntro);

        if (DataBaseConfig.getConnection().verifyConnection) {
            intro.start();
        } 
        
    }
}