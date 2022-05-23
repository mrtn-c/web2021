package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.excepciones.BorrarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanesImpl implements BorrarPlanes {

    @Override
    public boolean borrar(List<Plan> planes) throws BorrarPlanEx {
        
        BorrarPlan borrarPlan = new BorrarPlanImpl();
          
        for(Plan plan : planes){
            if(borrarPlan.borrar(plan)){
                return true;
            }
        }  
        return false;
    }
    
}
