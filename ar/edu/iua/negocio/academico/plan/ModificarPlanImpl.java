package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarPlanImpl implements ModificarPlan {

	@Override
	public boolean modificar(Plan plan) {
        
        if(plan == null || !BaseDeDatos.planes.contains(plan) || (ValidarPlan.validar(plan)) == false){
            return false;
        }
        
        int index = BaseDeDatos.planes.indexOf(plan);

        BaseDeDatos.planes.get(index).setAnio(plan.getAnio());
        BaseDeDatos.planes.get(index).getAnios().clear();
        BaseDeDatos.planes.get(index).setAnios(plan.getAnios());
        
        if(plan.isEstadoActivo()){
            BaseDeDatos.planes.get(index).setEstadoActivo();
        }

        if(plan.isEstadoBorrador()){
            BaseDeDatos.planes.get(index).setEstadoBorrador();
        } else {
            BaseDeDatos.planes.get(index).setEstadoNoActivo();
        }

		return true;
	}
    
}
