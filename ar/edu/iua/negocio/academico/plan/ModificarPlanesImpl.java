package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.ModificarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ModificarPlanesImpl implements ModificarPlanes {

    @Override
    public boolean modificar(List<Plan> planes) throws ModificarPlanEx {
        
        ModificarPlan modificarPlan = new ModificarPlanImpl();
        
        for(Plan plan : planes){
            if(!modificarPlan.modificar(plan)){
                System.out.println("Plan " + plan.getAnio() + " no pudo ser modificado");
            }
        }

        return true;
    }

    
}
