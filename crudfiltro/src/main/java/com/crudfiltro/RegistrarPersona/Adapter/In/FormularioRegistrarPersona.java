package com.crudfiltro.RegistrarPersona.Adapter.In;

import java.util.List;

import com.crudfiltro.Main.Main;
import com.crudfiltro.RegistrarPersona.Application.ExtraerCiudadesAccion;
import com.crudfiltro.RegistrarPersona.Application.ExtraerEmailsAccion;
import com.crudfiltro.RegistrarPersona.Application.ExtraerGenerosAccion;
import com.crudfiltro.RegistrarPersona.Application.InsertarPersonaAccion;
import com.crudfiltro.RegistrarPersona.Domain.Entity.Persona;
import com.crudfiltro.Verifiers.CheckInt;
import com.crudfiltro.Verifiers.CheckString;

public class FormularioRegistrarPersona {

    private ExtraerCiudadesAccion extraerCiudadesAccion;
    private ExtraerEmailsAccion extraerEmailsAccion;
    private ExtraerGenerosAccion extraerGenerosAccion;
    private InsertarPersonaAccion insertarPersonaAccion;



    public FormularioRegistrarPersona(ExtraerCiudadesAccion extraerCiudadesAccion,
            ExtraerEmailsAccion extraerEmailsAccion, ExtraerGenerosAccion extraerGenerosAccion,
            InsertarPersonaAccion insertarPersonaAccion) {
        this.extraerCiudadesAccion = extraerCiudadesAccion;
        this.extraerEmailsAccion = extraerEmailsAccion;
        this.extraerGenerosAccion = extraerGenerosAccion;
        this.insertarPersonaAccion = insertarPersonaAccion;
    }




    public void registrar() {

        // Valores para validar nombre
        boolean checkNombre = false;
        boolean exitNombre = false;
        String nombre = "";

        // Valores para validar apellido
        boolean checkApellido = false;
        boolean exitApellido = false;
        String apellido = "";

        // Valores para validar ciudad
        boolean checkCiudad = false;
        boolean exitCiudad = false;
        int idCiudad = 0; 
        List<Integer> listaCiudades = null;

        // Valores para validad dirección
        boolean checkDireccion = false;
        boolean exitDireccion = false;
        String direccion = "";

        //Valores para validar edad
        boolean checkEdad = false;
        boolean exitEdad = false;
        int edad = 0;

        // Valores para validar email
        boolean checkEmail = false;
        boolean exitEmail = false;
        String email = ""; 
        List<String> listaEmails = null;

        // Valores para validar genero
        boolean checkGenero = false;
        boolean exitGenero = false;
        int idGenero = 0; 
        List<Integer> listaGeneros = null;





        System.out.println("\n________________________\n");
        System.out.println("   REGISTRO DE PERSONA");
        System.out.println("_________________________\n");

        // Validar nombre
        while (exitNombre == false) {

            System.out.println("\n\n--> Ingrese el nombre de la persona");
            System.out.println(".........................................");
            System.out.println("      [EXIT/exit] para Salir");
            System.out.print(">>> ");

            nombre = CheckString.check("Ingrese el nombre nuevamente");

            if (nombre.toLowerCase().trim().equals("exit")) {

                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("x    REGISTRO CANCELADO   x");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                exitNombre = true;
                Main.main(null);



            } else {
                
                    exitNombre = true;
                    checkNombre = true;

            }  
        } // Aquì finaliza la validación del nombre

        // Validación del apellido 
        if ( checkNombre == true) {

            while (exitApellido == false) {

                System.out.println("\n\n--> Ingrese el apellido de la persona");
                System.out.println(".........................................");
                System.out.println("      [EXIT/exit] para Salir");
                System.out.print(">>> ");
    
               apellido= CheckString.check("Ingrese el apellido nuevamente");
    
                if (apellido.toLowerCase().trim().equals("exit")) {
    
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("x    REGISTRO CANCELADO   x");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    exitApellido = true;
                    Main.main(null);
    
    
    
                } else {
                    
                        exitApellido = true;
                        checkApellido = true;
    
                }  
            }

        } // Aquí finaliza la validación del apellido


        // Aquí empieza la validación de la ciudad
        if (checkApellido == true) {


                listaCiudades = this.extraerCiudadesAccion.extraer(); 

                while (exitCiudad == false) {

                    
                    System.out.println("\n\n--> Ingrese el código de la ciudad");
                    System.out.println("......................................");
                    System.out.println("      (Presiona -1 para Salir)");
                    System.out.print(">>> ");
    
                    idCiudad = CheckInt.check("Ingrese el código nuevamente");
    
                    if (idCiudad == -1) {
    
                        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        System.out.println("x    REGISTRO CANCELADO   x");
                        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        exitCiudad = true;
                        Main.main(null);
        
                    } else if (idCiudad <0 && idCiudad != -1) {
    
                        System.out.println("\n****************************************");
                        System.out.println("||  EL CÓDIGO NO PUEDE SER NEGATIVO   ||");
                        System.out.println("****************************************\n");
    
                    } else if (listaCiudades.contains(idCiudad) == false) {
    
                        System.out.println("\n******************************************");
                        System.out.println("||    CÓDIGO DE CIUDAD NO REGISTRADO    ||");
                        System.out.println("******************************************\n");
    
                    } else {

                        exitCiudad = true;
                        checkCiudad = true;

                    }
    
                }



        } // Aquí finaliza la validaciòn de la ciudad

        // Aquí empieza la validación de la dirección
        if ( checkCiudad == true) {

            while (exitDireccion == false) {

                System.out.println("\n\n--> Ingrese la dirección de la persona");
                System.out.println(".........................................");
                System.out.println("      [EXIT/exit] para Salir");
                System.out.print(">>> ");
    
               direccion = CheckString.check("Ingrese la dirección nuevamente");
    
                if (direccion.toLowerCase().trim().equals("exit")) {
    
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("x    REGISTRO CANCELADO   x");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    exitDireccion = true;
                    Main.main(null);
    
    
    
                } else {
                    
                        exitDireccion = true;
                        checkDireccion = true;
    
                }  
            }

        } // Aquí finaliza la validación de la dirección

        // Aquí empieza la validación de la edad
        if (checkDireccion == true) {


             

            while (exitEdad == false) {

                
                System.out.println("\n\n--> Ingrese la edad de la persona");
                System.out.println("......................................");
                System.out.println("      (Presiona -1 para Salir)");
                System.out.print(">>> ");

                edad = CheckInt.check("Ingrese la edad nuevamente");

                if (edad == -1) {

                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("x    REGISTRO CANCELADO   x");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    exitEdad = true;
                    Main.main(null);
    
                } else if (edad <0 && edad!= -1) {

                    System.out.println("\n****************************************");
                    System.out.println("||   LA EDAD NO PUEDE SER NEGATIVA    ||");
                    System.out.println("****************************************\n");

                } else {

                    exitEdad= true;
                    checkEdad = true;

                }

            }

        } // Aquí finaliza la validaciòn de la edad

        // Aquí inicia la validación del Email que debe de ser único para cada persona
        if (checkEdad == true) {

            listaEmails = this.extraerEmailsAccion.extraer();

            while (exitEmail == false) {


                System.out.println("\n\n--> Ingrese el email de la persona");
                System.out.println("........................................");
                System.out.println("       [EXIT/exit] para Salir");
                System.out.print(">>> ");
    
                email = CheckString.check("Ingrese el email nuevamente");
    
                if (email.toLowerCase().trim().equals("exit")) {
    
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("x    REGISTRO CANCELADO   x");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    exitEmail = true;
                    Main.main(null);
    
    
    
                } else {
                    
                    if (listaEmails.contains(email)) {
    
                        System.out.println("\n********************************************");
                        System.out.println("*              NO ES POSIBLE               *");
                        System.out.println("*------------------------------------------*");
                        System.out.println("*  Este email ya se encuentra registrado   *");
                        System.out.println("********************************************\n");
    
                    } else {
    
                        exitEmail = true;
                        checkEmail = true;
    
                    }
    
                    
                }
                
            }

        } //Aquí finaliza la validación del email


        // Aquí inici la validación del género
        if (checkEmail == true) {


            listaGeneros = this.extraerGenerosAccion.extraer();

            while (exitGenero == false) {

                
                System.out.println("\n\n--> Ingrese el código del género");
                System.out.println("......................................");
                System.out.println("      (Presiona -1 para Salir)");
                System.out.print(">>> ");

                idGenero = CheckInt.check("Ingrese el código nuevamente");

                if (idCiudad == -1) {

                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("x    REGISTRO CANCELADO   x");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    exitGenero = true;
                    Main.main(null);
    
                } else if (idGenero <0 && idGenero != -1) {

                    System.out.println("\n****************************************");
                    System.out.println("||  EL CÓDIGO NO PUEDE SER NEGATIVO   ||");
                    System.out.println("****************************************\n");

                } else if (listaGeneros.contains(idGenero) == false) {

                    System.out.println("\n******************************************");
                    System.out.println("||    CÓDIGO DE GÉNERO NO REGISTRADO    ||");
                    System.out.println("******************************************\n");

                } else {

                    exitGenero = true;
                    checkGenero = true;

                }

            }


    } // Aquí finaliza la validaciòn de la ciudad

    // Aquí incia la inserción de datos
    if (checkGenero == true) {

        Persona persona = new Persona(nombre, apellido, idCiudad, direccion, edad, email, idGenero);
        int filasInsertadas = this.insertarPersonaAccion.insertarPersona(persona);

        if (filasInsertadas == 1) {

            System.out.println("\n================================");
            System.out.println("       REGISTO EXITOSO");
            System.out.println("================================");
            Main.main(null);

        } else {

            System.out.println("\n*************************************");
            System.out.println("         FALLÓ AL REGISTRAR");
            System.out.println("*************************************");
            Main.main(null);
        }

    }




            
    } 


}


