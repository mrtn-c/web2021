package ar.edu.iua.negocio.academico.plan;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan {

    @Override
    public boolean borrar(Plan plan) {

        for(Plan aux : BaseDeDatos.planes){
            if(aux.getAnio() == plan.getAnio()){
                if(aux.isEstadoBorrador()){
                    System.out.println("Plan " + aux.getAnio() + " eliminado de la BD");
                    BaseDeDatos.planes.remove(aux);
                    return true;
                } else {
                    System.out.println("Plan " + aux.getAnio() + " seteado a NOACTIVO");
                    aux.setEstadoNoActivo();
                }
            }
        }

        return false;
        
    }
    
}
