package ar.edu.iua.util;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import ar.edu.iua.interfazusuario.BuscarEImprimirPlanes;
import ar.edu.iua.interfazusuario.BuscarEImprimirPlanesImpl;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlanes;
import ar.edu.iua.negocio.academico.plan.ModificarPlanesImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class Pruebas {

    public void probar() throws IOException {

        //genera los 2 planes hardcodeados y x aleatorios
        List<Plan> planes = GenerarEjemplosDePlanes.generar(2, false);        

        System.out.println("\n\nSe crearon " + planes.size() + " planes.");

        CrearPlanes crearPlanes = new CrearPlanesImpl();
        
        //envia la lista a la bd
        boolean ok = crearPlanes.crear(planes);

        if (ok == false) {
            return;
        }

        if(BaseDeDatos.planes == null){
            return;
        }
        
        ModificarPlan modificarPlan = new ModificarPlanImpl();
 

        
        BuscarEImprimirPlanesImpl.imprimirPlanes(BaseDeDatos.planes);
        BuscarEImprimirPlanes buscador = new BuscarEImprimirPlanesImpl();
        
        planes.get(0).setEstadoActivo(); 
        planes.get(1).setEstadoNoActivo();
        
        //este deberia tirar NO
        ok = modificarPlan.modificar(planes.get(0));
        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (ok ? "SI" : "NO") );
        
        //este deberia tirar SI
        ok = modificarPlan.modificar(planes.get(1));
        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (ok ? "SI" : "NO") ); 

        BuscarEImprimirPlanesImpl.imprimirPlanes(BaseDeDatos.planes);
        

        //BuscarEImprimirPlanes buscarEImprimirPlanes = new BuscarEImprimirPlanesImpl();

        // debe buscar todos los planes que contengan en sus datos (incluido años y materias)
        // devolver todos los planes q contengan un valor 18, o mate o hist o 5
        System.out.println("jejejejejje");
        buscador.buscarEImprimirPlanes("lengu"); 

        //por favor complete con mas codigo de pruebas, trate de probar todas las clases de negocio, borrar, modificar, buscar    

    }

}
