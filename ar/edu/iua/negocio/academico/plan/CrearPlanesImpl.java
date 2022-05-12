package ar.edu.iua.negocio.academico.plan;

import java.io.IOException;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class CrearPlanesImpl implements CrearPlanes {

    @Override
    public boolean crear(List<Plan> planes) throws IOException {

        Plan guardar = new PlanImpl();
        CrearPlanImpl aux = new CrearPlanImpl();

        for (Plan plan : planes) {
            guardar = aux.crear(plan, plan.getAnio());
            BaseDeDatos.planes.add(guardar);
        }

        return true;
    } 
    
}
