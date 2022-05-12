package ar.edu.iua.negocio.academico.plan;

import java.util.List;
import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanImpl implements BorrarPlan {

    @Override
    public boolean borrar(Plan plan, List<Plan> planes) {
         
        
        BuscarPlan buscarPlan = new BuscarPlanImpl();

        if(buscarPlan.buscar(plan.getAnio(), planes) == null){
            return false;
        }
        
        if(buscarPlan.buscar(plan.getAnio(), planes).isEstadoBorrador()) {
            System.out.println("Plan " + plan.getAnio() +" en estado BORRADOR removido.");
            planes.remove(plan);
            return true;
        } else {
            System.out.println("Plan " + buscarPlan.buscar(plan.getAnio(), planes).getAnio() +" ahora esta NO ACTIVO");
            buscarPlan.buscar(plan.getAnio(), planes).setEstadoNoActivo();
            return true;
        }
           
        
    }
    
}
