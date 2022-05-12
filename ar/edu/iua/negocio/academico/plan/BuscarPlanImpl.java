package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BuscarPlanImpl implements BuscarPlan {

    @Override
    public Plan buscar(int anio, List<Plan> planes) {
        
        
        for (Plan plan : planes){
            if(plan.getAnio() == anio){
                return plan;
            }
        }    
        
        
        System.out.println("Plan con anio: " + anio + " no encontrado!");
        return null;



    }
    
}
