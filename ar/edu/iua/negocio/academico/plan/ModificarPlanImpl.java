package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarPlanImpl implements ModificarPlan {

	@Override
	public boolean modificar(Plan plan) {
        
       // boolean bandera = false;
        
        if(ValidarPlan.validar(plan)){
			for(Plan aux : BaseDeDatos.planes) {
                if(aux.getAnio().equals(plan.getAnio())){
                    try {
                        BaseDeDatos.planes.set(BaseDeDatos.planes.indexOf(aux), (Plan)plan.clone());
                        return true;
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
            }
    	}
		return false;
	}
}
