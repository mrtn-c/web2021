package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.excepciones.CrearPlanEx;
import ar.edu.iua.excepciones.ValidarPlanEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;


public class CrearPlanImpl implements CrearPlan {

    @Override
    public boolean crear(Plan plan) throws CrearPlanEx {
        
        try {
            if(ValidarPlan.validar(plan)) {
                try{
                    BaseDeDatos.planes.add((Plan)plan.clone());
                    return true;
                } catch (CloneNotSupportedException e) {
                    throw new CrearPlanEx(e.getMessage());
                }
            }
        } catch (ValidarPlanEx e) {
            throw new CrearPlanEx(e.getMessage());
        }
        return false;
    }
}