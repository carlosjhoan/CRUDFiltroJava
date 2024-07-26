package com.crudfiltro.Intro;

import java.util.List;

import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.Verifiers.CheckInt;

public class Intro {

    

    public List<Funcionalidad> lstFuncionesIntro;



    public Intro(List<Funcionalidad> lstFuncionesIntro) {
        this.lstFuncionesIntro = lstFuncionesIntro;

        
    }



    public  void start() {
        int opcion = 0;
        int numItem = 0;
        boolean checkOpcion = false;

        System.out.println("\n------------------------------");
        System.out.println("    F I L T R O   J A V A");
        System.out.println("==============================");
        System.out.println("            Menú");
        System.out.println("==============================");

        for (Funcionalidad funcionIntro : this.lstFuncionesIntro) {
            numItem = lstFuncionesIntro.indexOf(funcionIntro) + 1;
            System.out.println("   " + numItem + ". " + funcionIntro.enunciado + "\n");
        }

        numItem ++;
        System.out.println("   " + numItem + ". Salir");
        System.out.println("----------------------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println("¿Qué deseas realizar?");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");

        while (checkOpcion == false) {
            opcion = CheckInt.check("Ingrese nuevamente la opción")- 1;

            if (opcion > lstFuncionesIntro.size() || opcion <= -1 ) {
                System.out.println("\n***********************");
                System.out.println("   OPCIÓN INCORRECTA");
                System.out.println("***********************");

                System.out.println("\n. . . . . . . . . . . . . . . . . .");
                System.out.println("Nuevamente: ¿Qué deseas realizar?");
                System.out.println(". . . . . . . . . . . . . . . . . .");
                System.out.print(">>> ");
            } else {
                checkOpcion = true;
            }

        }

        if (opcion == lstFuncionesIntro.size()) {
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("            C H  A O");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        } else {
            lstFuncionesIntro.get(opcion).ejecutar();
        }

    } 



}
