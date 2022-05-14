package ar.edu.iua.negocio.academico.plan;

import java.io.IOException;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes {

    @Override
    public boolean crear(List<Plan> planes) throws IOException {

        CrearPlanImpl aux = new CrearPlanImpl();
        //Plan guardar = new PlanImpl();
        
        for (Plan plan : planes){
            aux.crear(plan);
        }

        return true;
    } 
    
}
