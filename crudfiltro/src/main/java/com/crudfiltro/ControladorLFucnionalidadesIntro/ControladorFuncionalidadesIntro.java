package com.crudfiltro.ControladorLFucnionalidadesIntro;

import java.util.ArrayList;
import java.util.List;

import com.crudfiltro.ActualizarInformacionPersona.Adapter.In.IrActualizarInformacionPersona;
import com.crudfiltro.AsignarHabilidad.Adapter.In.IrAsignarHabilidad;
import com.crudfiltro.ClasesAbstractas.Funcionalidad;
import com.crudfiltro.ConsultarPersonaHabilidad.Adpater.In.IrConsultarPersonaHabilidad;
import com.crudfiltro.CrearHabilidad.Adapter.In.IrCrearHabilidad;
import com.crudfiltro.EliminarPersona.Adapter.In.IrEliminarPersona;
import com.crudfiltro.RegistrarPersona.Adapter.In.IrRegistrarPersona;

public class ControladorFuncionalidadesIntro {

    public static List<Funcionalidad> lstIntro;

    private static ControladorFuncionalidadesIntro CONTROLLER = new ControladorFuncionalidadesIntro();

    private ControladorFuncionalidadesIntro() {


        // Inicialización de la lista para el menú inicial
        lstIntro = new ArrayList<>();

        // Instanciar la funcionalidades para el menú principal
        Funcionalidad registrarPersona = new IrRegistrarPersona("Registrar persona");
        Funcionalidad crearHabilidad = new IrCrearHabilidad("Crear habilidad");
        Funcionalidad actualizaInfoPersona = new IrActualizarInformacionPersona("Actualizar persona");
        Funcionalidad asignarHabilidad = new IrAsignarHabilidad("Asignar habilidad");
        Funcionalidad consultarPersonaHabilidad = new IrConsultarPersonaHabilidad("Consultar persona por habilidad");
        Funcionalidad eliminarPersona = new IrEliminarPersona("Eliminar Persona");

        // Añadir funcionalidades a la lstIntro
        lstIntro.add(registrarPersona);
        lstIntro.add(crearHabilidad);
        lstIntro.add(actualizaInfoPersona);
        lstIntro.add(asignarHabilidad);
        lstIntro.add(consultarPersonaHabilidad);
        lstIntro.add(eliminarPersona);

    }

}
