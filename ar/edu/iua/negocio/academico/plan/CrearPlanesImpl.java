package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.CrearPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes {

    @Override
    public boolean crear(List<Plan> planes) throws CrearPlanEx {

        CrearPlanImpl aux = new CrearPlanImpl();
        
        for (Plan plan : planes){
                aux.crear(plan);
        }

        return true;
    } 
    
}
