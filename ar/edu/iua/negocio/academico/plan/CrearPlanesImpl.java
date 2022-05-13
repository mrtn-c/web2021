package ar.edu.iua.negocio.academico.plan;

import java.io.IOException;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class CrearPlanesImpl implements CrearPlanes {

    @Override
    public boolean crear( List<Integer> anios) throws IOException {

        CrearPlanImpl aux = new CrearPlanImpl();
        //Plan guardar = new PlanImpl();
        
        for (int anio : anios){
            aux.crear(new PlanImpl() ,anio);
        }

        return true;
    } 
    
}
